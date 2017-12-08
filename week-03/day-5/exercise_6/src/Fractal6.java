import sun.security.util.Length;

import javax.swing.*;

import java.awt.*;

import static java.awt.Window.getWindows;
import static javax.swing.JFrame.EXIT_ON_CLOSE;




public class Fractal6 {




  static Graphics g;

  public static void mainDraw(Graphics graphics) {
    g.setColor(Color.yellow);
    g.fillRect(0, 0, WIDTH, HEIGHT);

    fract1(WIDTH/2, 500, 600);





  }

  public static void fract1(int x, int y, int side){

    int xpoints[] = {};
    int ypoints[] = {};
    int npoints = 3;

    g.setColor(Color.black);
    g.drawPolygon(xpoints, ypoints, npoints);


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