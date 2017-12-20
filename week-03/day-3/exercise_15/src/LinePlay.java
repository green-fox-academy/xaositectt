import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {

  static Graphics g;
  //    Don't touch the code below
  static int WINDOW_WIDTH = 600;
  static int WINDOW_HEIGHT = 623;
  static int WIDTH = WINDOW_WIDTH;
  static int HEIGHT = WINDOW_HEIGHT - 23;

  public static void mainDraw(Graphics graphics) {
    linePlay(30);
  }

  public static void linePlay(int lineNumber) {
    int startX = 0;
    int startY = 0;

    int spaceX = WIDTH / lineNumber;
    int spaceY = HEIGHT / lineNumber;

    for (int i = 0; i < lineNumber; i++) {
      g.setColor(Color.green);
      g.drawLine(startX, startY + i * spaceY, startX + i * spaceX, HEIGHT);
    }

    for (int i = 0; i < lineNumber; i++) {
      g.setColor(Color.pink);
      g.drawLine(startX + i * spaceX, startY, WIDTH, startY + i * spaceY);
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
