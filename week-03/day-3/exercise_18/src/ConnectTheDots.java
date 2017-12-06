import javax.swing.*;

import java.awt.*;
import java.lang.reflect.Array;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

// create a function that takes 1 parameter:
// an array of {x, y} points
// and connects them with green lines.
// connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
// connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
// {120, 100}, {85, 130}, {50, 100}}

public class ConnectTheDots {

  static Graphics g;

  public static void mainDraw(Graphics graphics){

    int[][] points1 = new int[][]{
            {10, 10},
            {290,  10},
            {290, 290},
            {10, 290}
    };

    int[][] points2 = new int[][]{
            {50, 100},
            {70, 70},
            {80, 90},
            {90, 90},
            {100, 70},
            {120, 100},
            {85, 130},
            {50, 100}
    };

    connectDots(points1);
    connectDots(points2);
  }

  public static void connectDots(int[][] points){
    for (int i=0; i < points.length-1; i++) {
      g.drawLine(points[i][0], points[i][1], points[i+1][0], points[i+1][1]);
    }
    g.drawLine(points[points.length-1][0], points[points.length-1][1], points[0][0], points[0][1]);
  }

  //    Don't touch the code below
  static int WINDOW_WIDTH = 600;
  static int WINDOW_HEIGHT = 623;

  static int WIDTH = WINDOW_WIDTH;
  static int HEIGHT = WINDOW_HEIGHT -23;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      g= graphics;
      mainDraw(graphics);
    }
  }
}