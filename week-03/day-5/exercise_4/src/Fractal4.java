import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Fractal4 {

  static Graphics g;
  //    Don't touch the code below
  static int WINDOW_WIDTH = 800;
  static int WINDOW_HEIGHT = 823;
  static int WIDTH = WINDOW_WIDTH;
  static int HEIGHT = WINDOW_HEIGHT - 23;

  public static void mainDraw(Graphics graphics) {
    g.setColor(Color.getHSBColor((float) Math.random(), (float) Math.random(), (float) Math.random()));
    g.fillRect(0, 0, WIDTH, HEIGHT);
    int side = 600;
    int myX = (WIDTH - side) / 2;
    int myY = (HEIGHT - side) / 2;
    fract1(myX, myY, side);
  }

  public static void fract1(int x, int y, int side) {
    int dev = (int) (Math.random() * 100);
    //random fill-draw 1
    if (dev >= 50) {

      g.setColor(Color.getHSBColor((float) Math.random(), (float) Math.random(), (float) Math.random()));
      g.drawRect(x, y, side + (int) (Math.random() * 10), side + (int) (Math.random() * 10));

      int dev2 = (int) (Math.random() * 100);

      if (dev2 >= 50) {

        g.setColor(Color.getHSBColor((float) Math.random(), (float) Math.random(), (float) Math.random()));
        g.drawRect(x + side / 3, y + side / 3 + (int) (Math.random() * 10), side / 3, side / 3);
      }

      if (dev2 < 50) {

        g.setColor(Color.getHSBColor((float) Math.random(), (float) Math.random(), (float) Math.random()));
        g.fillRect(x + side / 3, y + side / 3, side / 3, side / 3);
      }
    }

    //random fill-draw 2
    if (dev < 50) {
      g.setColor(Color.getHSBColor((float) Math.random(), (float) Math.random(), (float) Math.random()));
      g.fillRect(x, y, side + (int) (Math.random() * 10), side + (int) (Math.random() * 10));

      int dev3 = (int) (Math.random() * 100);

      if (dev3 >= 50) {

        g.setColor(Color.getHSBColor((float) Math.random(), (float) Math.random(), (float) Math.random()));
        g.drawRect(x + side / 3, y + side / 3, side / 3, side / 3);
      }

      if (dev3 < 50) {

        g.setColor(Color.getHSBColor((float) Math.random(), (float) Math.random(), (float) Math.random()));
        g.fillRect(x + side / 3, y + side / 3, side / 3, side / 3);
      }
    }

    int newSide = side / 3;
    if (newSide > 100) {
      int incremX = newSide;
      int incremY = newSide;
      fract1(x, y, newSide);
      fract1(x + incremX, y, newSide);
      fract1(x + incremX + incremX, y, newSide);
      fract1(x, y + incremY, newSide);
      fract1(x + incremX + incremX, y + incremY, newSide);
      fract1(x, y + incremY + incremY, newSide);
      fract1(x + incremX, y + incremY + incremY, newSide);
      fract1(x + incremX + incremX, y + incremY + incremY, newSide);
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
