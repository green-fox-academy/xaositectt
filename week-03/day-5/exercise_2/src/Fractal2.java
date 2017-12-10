import sun.security.util.Length;
import javax.swing.*;
import java.awt.*;
import static java.awt.Window.getWindows;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Fractal2 {

  static Graphics g;

  public static void mainDraw(Graphics graphics) {
    g.setColor(Color.getHSBColor((float)Math.random(), (float)Math.random(), (float)Math.random()));
    g.fillRect(0, 0, WIDTH, HEIGHT);
    fract1(WIDTH/2, HEIGHT/2, WIDTH);
  }

  public static void fract1(int x, int y, int diameter){

    diameter= diameter- (int)(Math.random()*20);
    int newDiameter=diameter/2- (int)(Math.random()*10);
    x= x-diameter/2;
    y=y-diameter/2;
    int dev =(int)(Math.random()*100);
    if (dev >=50) {

      g.setColor(Color.getHSBColor((float)Math.random(), (float)Math.random(), (float)Math.random()));
      g.fillOval(x,y, diameter,diameter);
    }

    if (dev <50) {

      g.setColor(Color.getHSBColor((float)Math.random(), (float)Math.random(), (float)Math.random()));
      g.drawOval(x,y, diameter,diameter); }

    if (newDiameter>1){

      int cosLength = (int)(Math.cos(Math.PI/6)*newDiameter/2);
      int sinLength = (int)(Math.sin(Math.PI/6)*newDiameter/2);

      g.setColor(Color.getHSBColor((float)Math.random(), (float)Math.random(), (float)Math.random()));
      fract1(x+diameter/2, y+newDiameter/2, newDiameter);
      g.setColor(Color.getHSBColor((float)Math.random(), (float)Math.random(), (float)Math.random()));
      fract1(x+diameter/2-cosLength,y+diameter/2+sinLength,newDiameter );
      g.setColor(Color.getHSBColor((float)Math.random(), (float)Math.random(), (float)Math.random()));
      fract1(x+diameter/2+cosLength,y+diameter/2+sinLength,newDiameter );
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