import sun.security.util.Length;
import javax.swing.*;
import java.awt.*;
import static java.awt.Window.getWindows;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Fractal7 {

  static Graphics g;

  public static void mainDraw(Graphics graphics) {
    g.setColor(Color.white);
    g.fillRect(0, 0, WIDTH, HEIGHT);

    double triHeight = (Math.sqrt(3)/2*(WIDTH-200));

    fract1(100, 200, WIDTH-100, 200, true);
    fract1(100, 200, WIDTH/2, (HEIGHT/3)+triHeight, false);
    fract1(WIDTH/2, (HEIGHT/3)+triHeight, WIDTH-100, 200, false);
  }

  public static void fract1(double x1, double y1, double x2, double y2, boolean orientation){

    double length = (Math.sqrt(Math.pow(Math.abs(x2-x1), 2) + Math.pow(Math.abs(y2-y1), 2)));
    double height = (Math.sqrt(3)/2*length/3);

    g.setColor(Color.black);
    g.drawLine((int)x1, (int)y1, (int)x2, (int)y2);

    double midLinex1= x1+(x2-x1)/3;
    double midLinex2= x1+2*(x2-x1)/3;

    double midLiney1= y1+(y2-y1)/3;
    double midLiney2= y1+2*(y2-y1)/3;

    double lineMiddlex =x1+(x2-x1)/2;
    double lineMiddley = y1+(y2-y1)/2;

    double triHeight = (Math.sqrt(3)/2*length/3);

    double lineAngle = Math.asin((x2 - x1) / length);
    double myHeightAngle = Math.PI/2 - lineAngle;
    double ky = Math.cos(myHeightAngle) * height;
    double kx = Math.sin(myHeightAngle) * height;

    double triangleTopx=0;
    double triangleTopy=0;

    double orientQuotient = 0;

    if (orientation == true) {
      orientQuotient =1;
    }
    if (orientation == false) {
      orientQuotient = -1;
    }

    if (y1 <= y2) {
      triangleTopx = lineMiddlex + orientQuotient*kx;
      triangleTopy = lineMiddley - orientQuotient*ky;
      g.setColor(Color.black);
      g.drawLine((int)midLinex1, (int)midLiney1, (int)triangleTopx, (int)triangleTopy);
      g.drawLine((int)triangleTopx, (int)triangleTopy, (int)midLinex2, (int)midLiney2);
    }
    if (y1 > y2) {
      triangleTopx = lineMiddlex - orientQuotient*kx;
      triangleTopy = lineMiddley - orientQuotient*ky;
      g.setColor(Color.black);
      g.drawLine((int) midLinex1, (int) midLiney1, (int) triangleTopx, (int) triangleTopy);
      g.drawLine((int) triangleTopx, (int) triangleTopy, (int) midLinex2, (int) midLiney2);
    }

    java.awt.Graphics2D g2 = (java.awt.Graphics2D) g.create();

    g2.setStroke(new java.awt.BasicStroke(3));
    g2.setColor(Color.white);
    g2.drawLine((int)midLinex1, (int)midLiney1, (int)midLinex2, (int)midLiney2);


    double lengthNew = length/3;

    if (lengthNew>10) {
      fract1(x1, y1, midLinex1, midLiney1, orientation);
      fract1(midLinex1, midLiney1, triangleTopx, triangleTopy, orientation);
      fract1(triangleTopx, triangleTopy, midLinex2, midLiney2, orientation);
      fract1(midLinex2, midLiney2, x2, y2, orientation);
    }
  }

  //    Don't touch the code below
  static int WINDOW_WIDTH = 800;
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