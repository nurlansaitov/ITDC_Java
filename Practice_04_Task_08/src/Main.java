import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame {

    String title = "Graphics Template";
    Color background = Color.BLACK;

    void draw(Graphics2D g2) {
        // Ваш код


            int maxRectWidthSize = 100;
            int kolRect = 30;
            int redMinColor = 10;
            int redMaxColor = 255;
            int x1 = 0;

            for (int k = 0; k < 20; k++) {
                int maxRS = maxRectWidthSize;
                for (int i = 0; i < kolRect; i++) {
                    Color myColor = new Color(redMinColor, 0, 0);
                    g2.setColor(myColor);
                    g2.fillRect(x1, 80, maxRS, 800);
                    x1 = x1 + maxRS / kolRect;
                    maxRS = maxRS - (maxRS / kolRect * 2);
                    redMinColor += (redMaxColor - redMinColor) / kolRect;
                }
                x1 = x1 + maxRectWidthSize;
                redMinColor = 10;
                redMaxColor = 255;
            }

    }

    public Main() {
        setTitle(title);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        DrawPanel panel = new DrawPanel();
        panel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.exit(0);
            }
        });
        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }

    class DrawPanel extends JPanel {
        public DrawPanel() {
            setBackground(background);
            setFocusable(true);
            requestFocusInWindow();
            setDoubleBuffered(true);
        }

        public void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;
            RenderingHints hints = new RenderingHints(
                    RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON
            );
            g2.setRenderingHints(hints);

            super.paintComponent(g);
            draw(g2);
        }
    }

}
