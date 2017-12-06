import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;



public class Hexagon {

  static Graphics g;

  public static void mainDraw(Graphics graphics) {

    for (int i = 0; i < 4; i++) {
      hexagon(100, 150+i*52, g);
    }
    for (int i = 0; i < 5; i++) {
      hexagon(100+45, 150-26+i*52, g);
    }
    for (int i = 0; i < 6; i++) {
      hexagon(100+45+45, 150-26-26+i*52, g);
    }
    for (int i = 0; i < 7; i++) {
      hexagon(100+45+45+45, 150-26-26-26+i*52, g);
    }
    for (int i = 0; i < 6; i++) {
      hexagon(100+45+45+45+45, 150-26-26+i*52, g);
    }
    for (int i = 0; i < 5; i++) {
      hexagon(100+45+45+45+45+45, 150-26+i*52, g);
    }
    for (int i = 0; i < 4; i++) {
      hexagon(100+45+45+45+45+45+45, 150+i*52, g);
    }
  }



  public static void hexagon(int centerX, int centerY, Graphics g){
    int xpoints[] = {centerX-15, centerX+15, centerX+30, centerX+15, centerX-15, centerX-30};
    int ypoints[] = {centerY-26, centerY-26, centerY, centerY+26, centerY+26, centerY};
    int npoints = 6;

    g.drawPolygon(xpoints, ypoints, npoints);


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