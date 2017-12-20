import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Fractal1 {
  static Graphics g;
  //    Don't touch the code below
  static int WINDOW_WIDTH = 600;
  static int WINDOW_HEIGHT = 623;
  static int WIDTH = WINDOW_WIDTH;
  static int HEIGHT = WINDOW_HEIGHT - 23;

  public static void mainDraw(Graphics graphics) {
    g.setColor(Color.yellow);
    g.fillRect(0, 0, WIDTH, HEIGHT);
    fract1(0, 0, 600);
  }

  public static void fract1(int x, int y, int side) {

    int sideNew = side / 3;
    int xcoord = x + sideNew;
    int ycoord = y + sideNew;

    g.setColor(Color.black);
    g.drawLine(x + sideNew, y + 0, x + sideNew, y + side);
    g.drawLine(x + 2 * sideNew, y + 0, x + 2 * sideNew, y + side);
    g.drawLine(x + 0, y + sideNew, x + side, y + sideNew);
    g.drawLine(x + 0, y + 2 * sideNew, x + side, y + 2 * sideNew);

    if (sideNew >= 3) {
      fract1(x + sideNew, 0 + y, sideNew);
      fract1(x, y + sideNew, sideNew);
      fract1(x + sideNew, y + 2 * (sideNew), sideNew);
      fract1(x + 2 * sideNew, y + sideNew, sideNew);
    }
  }

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      g = graphics;
      mainDraw(graphics);
    }
  }
}
