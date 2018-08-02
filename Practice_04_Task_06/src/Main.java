import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame {

    String title = "Graphics Template";
    Color background = Color.BLACK;

    void draw(Graphics2D g2) {
        // Ваш код

        int screenWCenter = getWidth() / 2;
        int screenHCenter = getHeight() /2;
        int maxRadios = 350;
        int corner = 0;
        int kolLine =300;


        for (double i = 0; i < kolLine; i += 1) {
            Color myColor = new Color(255,0,0);
            g2.setColor(myColor);

            int x2;
            int y2;
            x2 = (int) (screenWCenter + Math.cos(corner) * maxRadios);
            y2 = (int) (screenHCenter + Math.sin(corner) * maxRadios);

            g2.drawLine(screenWCenter,screenHCenter, x2, y2);
            corner += 30;

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