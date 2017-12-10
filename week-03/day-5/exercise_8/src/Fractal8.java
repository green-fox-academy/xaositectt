import sun.security.util.Length;
import javax.swing.*;
import java.awt.*;
import static java.awt.Window.getWindows;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Fractal8 {

  static Graphics g;

  public static void mainDraw(Graphics graphics) {
    g.setColor(Color.black);
    g.fillRect(0, 0, WIDTH, HEIGHT);

    fract1(WIDTH/2, HEIGHT-100, 90, 220);
  }
  public static void fract1(double x, double y, double angle, double length){

    double secondX = x+ Math.cos(Math.toRadians(angle))*length;
    double secondY = y- Math.sin(Math.toRadians(angle))*length;

    g.setColor(Color.white);
    g.drawLine((int)x,(int)y,(int)secondX, (int)secondY);

    double newLength = length*0.78;

    if (newLength >53) {
      fract1(secondX, secondY, angle, newLength);
      fract1(secondX, secondY, angle-20, newLength);
      fract1(secondX, secondY, angle+20, newLength);
      fract1(secondX, secondY, angle-40, newLength);
      fract1(secondX, secondY, angle+40, newLength);
    }
  }

  //    Don't touch the code below
  static int WINDOW_WIDTH = 1200;
  static int WINDOW_HEIGHT = 1023;

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