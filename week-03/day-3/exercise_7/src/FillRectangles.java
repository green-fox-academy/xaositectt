import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FillRectangles {

  //    Don't touch the code below
  static int WINDOW_WIDTH = 800;
  static int WINDOW_HEIGHT = 600;
  static int WIDTH = WINDOW_WIDTH;
  static int HEIGHT = WINDOW_HEIGHT - 23;

  public static void mainDraw(Graphics graphics) {
    // draw four different size and color rectangles.

    graphics.setColor(Color.green);
    graphics.fillRect(100, 100, 10, 10);

    graphics.setColor(Color.blue);
    graphics.fillRect(200, 100, 20, 20);

    graphics.setColor(Color.yellow);
    graphics.fillRect(100, 200, 30, 30);

    graphics.setColor(Color.red);
    graphics.fillRect(200, 200, 40, 40);
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
      mainDraw(graphics);
    }
  }
}