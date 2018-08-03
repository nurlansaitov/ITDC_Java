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
        int maxRadios = 200;
        int sredRadios = 80;
        int corner = 0;
        int stepCorner = 15;
        int kolLine = 360 / stepCorner;

        Color myColor = new Color(255,0,0);

        drawStar(g2, screenWCenter, screenHCenter, maxRadios, myColor, kolLine, sredRadios, corner, stepCorner);
        drawStar(g2, screenWCenter - 300, screenHCenter - 300, 80, Color.yellow, kolLine, 50, corner, stepCorner);
        drawStar(g2, screenWCenter + 300,screenHCenter + 300, 80, Color.yellow, kolLine, 50, corner, stepCorner);
        drawStar(g2, screenWCenter + 300, screenHCenter - 300, 80, Color.yellow, kolLine, 50, corner, stepCorner);
        drawStar(g2, screenWCenter - 300, screenHCenter + 300, 80, Color.yellow, kolLine, 50, corner, stepCorner);
    }



     void drawStar(
         Graphics2D g2,
         int centerX,
         int centerY,
         int maxRadios,
         Color myColor,
         int kolLine,
         int sredRadios,
         int corner,
         int stepCorner){
         int maxR;
         int roofStart;
         g2.setColor(myColor);

         for (int i = 0; i < kolLine; i += 1) {
            if (i % 2 == 0) {
                maxR = maxRadios;
                roofStart = sredRadios;
            } else {
                maxR = sredRadios;
                roofStart = maxRadios;
            }
            double radian = corner * Math.PI / 180;
            int x2 = (int) (centerX + Math.cos(radian) * maxR);
            int y2 = (int) (centerY + Math.sin(radian) * maxR);
            g2.drawLine(centerX, centerY, x2, y2);

            int x2R = (int) (centerX + Math.cos((corner + stepCorner) * Math.PI / 180) * roofStart);
            int y2R = (int) (centerY + Math.sin((corner + stepCorner) * Math.PI / 180) * roofStart);
            g2.drawLine(x2, y2, x2R, y2R);

            corner += stepCorner;
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