import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Fractal3 {
  static Graphics g;
  //    Don't touch the code below
  static int WINDOW_WIDTH = 1000;
  static int WINDOW_HEIGHT = 1023;
  static int WIDTH = WINDOW_WIDTH;
  static int HEIGHT = WINDOW_HEIGHT - 23;

  public static void mainDraw(Graphics graphics) {
    g.setColor(Color.getHSBColor((float) Math.random(), (float) Math.random(), (float) Math.random()));
    g.fillRect(0, 0, WIDTH, HEIGHT);
    fract1(0, HEIGHT / 2, WIDTH / 2);
  }

  public static void fract1(int x, int y, int side) {
    int height = (int) (0.866 * side);
    int xpoints[] = {x, x + side / 2, x + (3 * side) / 2, x + 2 * side, x + (3 * side) / 2, x + side / 2};
    int ypoints[] = {y, y - height, y - height, y, y + height, y + height};
    int npoints = 6;

    int dev = (int) (Math.random() * 100);

    if (dev >= 50) {
      g.setColor(Color.getHSBColor((float) Math.random(), (float) Math.random(), (float) Math.random()));
      g.drawPolygon(xpoints, ypoints, npoints);
    }
    if (dev < 50) {
      g.setColor(Color.getHSBColor((float) Math.random(), (float) Math.random(), (float) Math.random()));
      g.fillPolygon(xpoints, ypoints, npoints);
    }

    int newSide = side / 3;
    int newHeight = height / 3;
    if (newSide > 1) {
      int incremX = newSide * 2;
      int incremY = newHeight * 2;

      g.setColor(Color.getHSBColor((float) Math.random(), (float) Math.random(), (float) Math.random()));
      fract1(x, y, newSide);
      g.setColor(Color.getHSBColor((float) Math.random(), (float) Math.random(), (float) Math.random()));
      fract1(x + 2 * incremX, y, newSide);
      g.setColor(Color.getHSBColor((float) Math.random(), (float) Math.random(), (float) Math.random()));
      fract1(x + incremX / 2, y + incremY, newSide);
      g.setColor(Color.getHSBColor((float) Math.random(), (float) Math.random(), (float) Math.random()));
      fract1(x + incremX / 2, y - incremY, newSide);
      g.setColor(Color.getHSBColor((float) Math.random(), (float) Math.random(), (float) Math.random()));
      fract1(x + incremX / 2 + incremX, y - incremY, newSide);
      g.setColor(Color.getHSBColor((float) Math.random(), (float) Math.random(), (float) Math.random()));
      fract1(x + incremX / 2 + incremX, y + incremY, newSide);
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
