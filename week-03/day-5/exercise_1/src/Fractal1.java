import sun.security.util.Length;
import javax.swing.*;
import java.awt.*;
import static java.awt.Window.getWindows;
import static javax.swing.JFrame.EXIT_ON_CLOSE;





public class Fractal1 {




  static Graphics g;

  public static void mainDraw(Graphics graphics) {
    g.setColor(Color.getHSBColor((float)Math.random(), (float)Math.random(), (float)Math.random()));
    g.fillRect(0, 0, WIDTH, HEIGHT);

    fract1(50, 100, 900);





  }

  public static void fract1(int x, int y, int side){
    side = side;
    int height = (int)(Math.sqrt(3)/2*side);

    int xpoints1[] = {x+(int)(Math.random()*10), x+side+(int)(Math.random()*10), x+side/2+(int)(Math.random()*10)};
    int ypoints1[] = {y+(int)(Math.random()*10), y+(int)(Math.random()*10), y+height+(int)(Math.random()*10)};
    int npoints1 = 3;

    g.setColor(Color.getHSBColor((float)Math.random(), (float)Math.random(), (float)Math.random()));
    g.drawPolygon(xpoints1, ypoints1, npoints1);

    int sideNew = side/2;
    int heightNew = (int)(Math.sqrt(3)/2*sideNew);
    if (sideNew > 1) {
      g.setColor(Color.getHSBColor((float)Math.random(), (float)Math.random(), (float)Math.random()));
      fract1(x, y, sideNew);
      g.setColor(Color.getHSBColor((float)Math.random(), (float)Math.random(), (float)Math.random()));
      fract1(x+side/2, y, sideNew);
      g.setColor(Color.getHSBColor((float)Math.random(), (float)Math.random(), (float)Math.random()));
      fract1(x+sideNew/2, y+heightNew, sideNew);
    }



    }





  //    Don't touch the code below
  static int WINDOW_WIDTH = 1000;
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