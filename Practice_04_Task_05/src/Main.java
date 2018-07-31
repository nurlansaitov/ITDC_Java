import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame {

    String title = "Graphics Template";
    Color background = Color.black;

    void draw(Graphics2D g2) {
        // Ваш код



        int screenWidthCenter = getWidth() / 2;
        int screenHeightCenter = getHeight() / 2;
        int ovalMaxDiam = 700;
        int ovalMinDiam = 0;
        int kolOval = 30;
        int redMinColor = 10;
        int redMaxColor = 255;
        for (int i = 0; i < kolOval; i++) {
            Color myColor1 = new Color(redMinColor, 0, 0);
            g2.setColor(myColor1);
            g2.fillOval(screenWidthCenter - ovalMaxDiam / 2, screenHeightCenter - ovalMaxDiam / 2, ovalMaxDiam, ovalMaxDiam);
            ovalMaxDiam -= (ovalMaxDiam - ovalMinDiam) / kolOval;
            redMinColor += (redMaxColor - redMinColor) / kolOval;
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