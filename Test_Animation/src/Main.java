import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame {

    final String TITLE = "Molecules";
    final Color BACKGROUND = Color.BLACK;
    final int DELAY = 10;

    final Color MOLECULE_COLOR = Color.WHITE;
    final int MOLECULE_RADIUS = 20;
    final int MOLECULE_DIAMETER = 2 * MOLECULE_RADIUS;

    // Ваши переменные
    int x1, y1;
    int x2, y2;

    int dx1 = 2, dy1 = 2;
    int dx2 = -2, dy2 = -2;
    int width, height;


    void start() {
        // код для инициализации
        width = getWidth();
        height = getHeight();
        x1 = width / 2 - MOLECULE_RADIUS;
        y1 = height / 2 - MOLECULE_RADIUS;
        x2 = width / 2 - MOLECULE_RADIUS;
        y2 = height / 2 - MOLECULE_RADIUS;

    }

    void update() {
        // код для обновления свойств объектов
        x1 += dx1;
        y1 += dy1;
        x2 += dx2;
        y2 += dy2;


        if (x1 < 0 || x1 > width - MOLECULE_DIAMETER) {
            dx1 = -dx1;
        }
        if (y1 < 0 || y1 > height - MOLECULE_DIAMETER) {
            dy1 = -dy1;
        }
        if (x2 < 0 || x2 > width - MOLECULE_DIAMETER) {
            dx2 = -dx2;
        }
        if (y2 < 0 || y2 > height - MOLECULE_DIAMETER) {
            dy2 = -dy2;
        }


    }

    void draw(Graphics2D g2) {

        // код для рисования следующего кадра
        g2.setColor(MOLECULE_COLOR);
        g2.fillOval(x1,y1, MOLECULE_DIAMETER, MOLECULE_DIAMETER);
        g2.fillOval(x2,y2, MOLECULE_DIAMETER, MOLECULE_DIAMETER);


    }

    void input(int keyCode) {
        // код для обработки ввода
        if (keyCode == KeyEvent.VK_ESCAPE) {
            System.exit(0);
        } // else if / switch...

    }

    public Main() {
        setTitle(TITLE);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        DrawPanel panel = new DrawPanel();
        panel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                input(e.getKeyCode());
            }
        });
        add(panel);

        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentShown(ComponentEvent arg0) {
                start();

                javax.swing.Timer timer = new javax.swing.Timer(DELAY, new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        update();
                        repaint();
                    }
                });
                timer.start();
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }

    class DrawPanel extends JPanel {
        public DrawPanel() {
            setBackground(BACKGROUND);
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