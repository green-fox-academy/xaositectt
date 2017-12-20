import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {

  static Graphics g;
  //    Don't touch the code below
  static int WINDOW_WIDTH = 800;
  static int WINDOW_HEIGHT = 600;
  static int WIDTH = WINDOW_WIDTH;
  static int HEIGHT = WINDOW_HEIGHT - 23;

  public static void mainDraw(Graphics graphics) {
    // create a line drawing function that takes 2 parameters:
    // the x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // draw 3 lines with that function.

    myDraw(0, 0);
    myDraw(WIDTH, 0);
    myDraw(0, HEIGHT);
  }

  public static void myDraw(int xcoord, int ycoord) {
    g.drawLine(xcoord, ycoord, WIDTH / 2, HEIGHT / 2);
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
