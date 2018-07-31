import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame {

    String title = "Graphics Template";
    Color background = Color.black;

    void draw(Graphics2D g2) {
        // Ваш код

        int maxOvalSize = 10;
        int minOvalSize = 0;
        int screenWidth = getWidth() - maxOvalSize;
        int screenHeight = getHeight() - maxOvalSize;
        int kolOval = 10000;




        for (int i = 1; i <kolOval; i++) {

            int ovalSize = (int)(minOvalSize + Math.random() * (maxOvalSize - minOvalSize + 1));
            int ovalX = (int)(0 + Math.random() * (screenWidth - 0 + 1));
            int ovalY = (int)(0 + Math.random() * (screenHeight - 0 + 1));
            int colorR = (int)(0 + Math.random() * (255 - 0 +1));
            int colorG = (int)(0 + Math.random() * (255 - 0 +1));
            int colorB = (int)(0 + Math.random() * (255 - 0 +1));
            Color mycolor = new Color(colorR,colorG,colorB);
            g2.setColor(mycolor);
            g2.fillOval(ovalX, ovalY, ovalSize, ovalSize);

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