import sun.security.util.Length;

import javax.swing.*;

import java.awt.*;

import static java.awt.Window.getWindows;
import static javax.swing.JFrame.EXIT_ON_CLOSE;




public class Fractal2 {




  static Graphics g;

  public static void mainDraw(Graphics graphics) {
    g.setColor(Color.yellow);
    g.fillRect(0, 0, WIDTH, HEIGHT);

    fract2(400,400,300);





  }

  public static void fract2(int x, int y, int side){

    int height = (int)(0.866*side);

    int xpoints[] = {x-side/2, x+side/2, x+side, x+side/2, x-side/2, x-side};
    int ypoints[] = {y-height, y-height, y, y+height, y+height, y};
    int npoints = 6;

    g.setColor(Color.black);
    g.drawPolygon(xpoints, ypoints, npoints);

    int sideNew = side/2;
    if (sideNew>2) {
      fract2(x-sideNew/2, y-(int)(0.866*sideNew), sideNew);
      fract2(x+sideNew, y, sideNew);
      fract2(x-sideNew/2, y+(int)(0.866*sideNew), sideNew);
    }
  }

  //    Don't touch the code below
  static int WINDOW_WIDTH = 800;
  static int WINDOW_HEIGHT = 823;

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