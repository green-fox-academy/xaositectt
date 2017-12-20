import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {

  static Graphics g;
  //    Don't touch the code below
  static int WINDOW_WIDTH = 623;
  static int WINDOW_HEIGHT = 600;
  static int WIDTH = WINDOW_WIDTH;
  static int HEIGHT = WINDOW_HEIGHT - 23;

  public static void mainDraw(Graphics graphics) {
    // create a square drawing function that takes 2 parameters:
    // the square size, and the fill color,
    // and draws a square of that size and color to the center of the canvas.
    // create a loop that fills the canvas with rainbow colored squares.

    drawRect(0, 0, 30, 10);
  }

  public static void drawRect(int startX, int startY, int rectSize, int rectNumber) {

    Color Indigo = new Color(75, 0, 130);
    for (int i = 0; i < rectNumber; i++) {
      startX = startX + rectSize;
      startY = startY + rectSize;
      g.setColor(Indigo);
      g.fillRect(startX, startY, rectSize, rectSize);
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
