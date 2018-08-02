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
        int maxRadios = 80;
        int corner = 0;
        int kolLine =300;
        int x2;
        int y2;
        int dynRadios;
        int kolStars = 40;

        for  (int k = 0; k < kolStars; k++) {
            int dynX1 = (int) (50 + Math.random() * (getWidth()- maxRadios - 50 + 1));
            int dynY1 = (int) (50 + Math.random() * (getHeight()- maxRadios - 50 + 1));
            int colorRed;
            int colorGreen;
            int colorBlue;

            if (k % 3 == 0) {
                colorRed = 255;
                colorGreen = 0;
                colorBlue = 0;
            } else if (k % 2 == 0){
                colorRed = 0;
                colorGreen = 255;
                colorBlue = 0;
            } else {
                colorRed = 0;
                colorGreen = 0;
                colorBlue = 255;
            }

            for (double i = 0; i < kolLine; i += 1) {
                Color myColor = new Color(colorRed,colorGreen,colorBlue);
                g2.setColor(myColor);
                g2.setStroke(new BasicStroke(1));
                dynRadios = (int) (Math.random()* (maxRadios - 0 +1));

                x2 = (int) (dynX1 + Math.cos(corner) * dynRadios);
                y2 = (int) (dynY1 + Math.sin(corner) * dynRadios);

                g2.drawLine(dynX1,dynY1, x2, y2);
                corner += 7;
            }

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