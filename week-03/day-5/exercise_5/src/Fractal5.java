import sun.security.util.Length;

import javax.swing.*;

import java.awt.*;

import static java.awt.Window.getWindows;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Fractal5 {

  static Graphics g;
  static Graphics2D g2;

  public static void mainDraw(Graphics graphics) {
    g.setColor(Color.getHSBColor((float) Math.random(), (float) Math.random(), (float) Math.random()));
    g.fillRect(0, 0, WIDTH, HEIGHT);

    int side =600;
    int myX = (WIDTH-side)/2;
    int myY=(HEIGHT-side)/2;
    fract1(myX, myY, side);
  }

  public static void fract1(int x, int y, int side){

    //random fill-draw 2

      java.awt.Graphics2D g2 = (java.awt.Graphics2D) g.create();

      g2.setStroke(new java.awt.BasicStroke(5+(int)(Math.random()*5)));
      g2.setColor(Color.getHSBColor((float) Math.random(), (float) Math.random(), (float) Math.random()));
      g2.drawRect(x, y, side, side);

      g2.setStroke(new java.awt.BasicStroke(20+(int)(Math.random()*20)));
      g2.setColor(Color.getHSBColor((float) Math.random(), (float) Math.random(), (float) Math.random()));
      g2.drawRect(x+side/4, y+side/4, side/2, side/2);

    int newSide=side/2;
    if (newSide>100) {
      int incremX = side/2;
      int incremY = side/2;
      fract1(x, y, newSide);
      fract1(x+incremX, y, newSide);
      fract1(x, y+incremY, newSide);
      fract1(x+incremX, y+incremY, newSide);
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