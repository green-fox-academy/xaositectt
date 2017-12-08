import javax.swing.*;
import java.awt.*;

final public class Fractal1_2 {

  JFrame frame;
  DrawPanel drawPanel;

  private int oneX = 7;
  private int oneY = 7;

  boolean up = false;
  boolean down = true;
  boolean left = false;
  boolean right = true;

  public static void main(String[] args) {
    new Fractal1_2().go();
  }

  private void go() {
    frame = new JFrame("Test");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    drawPanel = new DrawPanel();

    frame.getContentPane().add(BorderLayout.CENTER, drawPanel);

    frame.setVisible(true);
    frame.setResizable(false);
    frame.setSize(1000, 1000);
    frame.setLocation(375, 55);
    moveIt();
  }

  class DrawPanel extends JPanel {
    public void paintComponent(Graphics g) {

      g.setColor(Color.BLACK);
      g.fillRect(oneX, oneY, 6, 6);
    }
  }

  public static void fract1( int x, int y, int side, Graphics g){
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
      fract1(x, y, sideNew, g);
      g.setColor(Color.getHSBColor((float)Math.random(), (float)Math.random(), (float)Math.random()));
      fract1(x+side/2, y, sideNew, g);
      g.setColor(Color.getHSBColor((float)Math.random(), (float)Math.random(), (float)Math.random()));
      fract1(x+sideNew/2, y+heightNew, sideNew, g);
    }




  private void moveIt() {
    while(true){

      if(up){
        oneY--;
      }
      if(down){
        oneY++;
      }
      if(left){
        oneX--;
      }
      if(right){
        oneX++;
      }
      try{
        Thread.sleep(10);
      } catch (Exception exc){}
      frame.repaint();
    }
  }
}