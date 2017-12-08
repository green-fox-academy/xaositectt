import sun.security.util.Length;

import javax.swing.*;

import java.awt.*;

import static java.awt.Window.getWindows;
import static javax.swing.JFrame.EXIT_ON_CLOSE;




public class Fractal6 {

  static Graphics g;

  public static void mainDraw(Graphics graphics) {
    g.setColor(Color.white);
    g.fillRect(0, 0, WIDTH, HEIGHT);

    fract1(0, HEIGHT/2, WIDTH, HEIGHT/2+100);

  }

  public static void fract1(double x1, double y1, double x2, double y2){

    double length = (Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)));
    double height = (Math.sqrt(3)/2*length/3);


    g.setColor(Color.black);
    g.drawLine((int)x1, (int)y1, (int)x2, (int)y2);

    double linex1= x1+(x2-x1)/3;
    double linex2= x1+2*(x2-x1)/3;

    double liney1= y1+(y2-y1)/3;
    double liney2= y1+2*(y2-y1)/3;



    double triangleTopx = x1+height;
    double triangleTopy = 0;



    java.awt.Graphics2D g2 = (java.awt.Graphics2D) g.create();

    g2.setStroke(new java.awt.BasicStroke(3));
    g2.setColor(Color.white);
    g2.drawLine((int)linex1, (int)liney1, (int)linex2, (int)liney2);


    int xpoints1[] = {linex1, linex2, trangleTopx};
    int ypoints1[] = {liney1, liney2};
    int npoints1 = 3;

    //g.setColor(Color.black);
    //g.drawPolygon(xpoints1, ypoints1, npoints1);




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