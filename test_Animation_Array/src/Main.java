import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame {

    final String TITLE = "Molecules";
    final Color BACKGROUND = Color.BLACK;
    final int DELAY = 10;
    final int MOLECULES_COUNT = 100;

    final int MOLECULE_RADIUS = 6;
    final int MOLECULE_DIAMETER = 2 * MOLECULE_RADIUS;
    final int MAX_D = 10;
    final int MIN_D = -10;

    // Ваши переменные

    int[] x = new int[MOLECULES_COUNT];
    int[] y = new int[MOLECULES_COUNT];
    int[] dx = new int[MOLECULES_COUNT];
    int[] dy = new int[MOLECULES_COUNT];
    int width, height;

    void start() {
        // код для инициализации
        width = getWidth();
        height = getHeight();

        for (int i = 0; i < MOLECULES_COUNT; ++i) {
            x[i] =  (int) (MOLECULE_DIAMETER + Math.random() * (width - MOLECULE_DIAMETER + 1));
            y[i] =  (int) (MOLECULE_DIAMETER + Math.random() * (height - MOLECULE_DIAMETER + 1));
            dx[i] = (int) (MIN_D + Math.random() * (MAX_D - MIN_D + 1));
            dy[i] = (int) (MIN_D + Math.random() * (MAX_D - MIN_D + 1));
        }

    }

    void update() {
        // код для обновления свойств объектов
        for (int i = 0; i < MOLECULES_COUNT; i++) {
            x[i] += dx[i];
            y[i] += dy[i];

            if (x[i] < 0 || x[i] > width - MOLECULE_DIAMETER) {
                dx[i] = -dx[i];
            }
            if (y[i] < 0 || y[i] > height - MOLECULE_DIAMETER) {
                dy[i] = -dy[i];
            }
        }


    }

    void draw(Graphics2D g2) {

        // код для рисования следующего кадра


        int randomR = (int) (0 + Math.random() * (255 + 1));
        int randomG = (int) (0 + Math.random() * (255 + 1));
        int randomB = (int) (0 + Math.random() * (255 + 1));
        Color MOLECULE_COLOR = new Color(randomR,randomG,randomB);
        g2.setColor(MOLECULE_COLOR);

        for (int i = 0; i < MOLECULES_COUNT; i++) {
            g2.fillOval(x[i], y[i], MOLECULE_DIAMETER, MOLECULE_DIAMETER);
        }



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