import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EverythingCenter {

  static Graphics g;

  public static void mainDraw(Graphics graphics){
    // create a line drawing function that takes 2 parameters:
    // the x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // fill the canvas with lines from the edges, every 20 px, to the center.

    int myYcoord=0;
    for (int x=0;x<HEIGHT/20; x++) {
      myDraw(0,myYcoord);
      myDraw(WIDTH,myYcoord);
      myYcoord=myYcoord+20;
    }
    int myXcoord=0;
    for (int x=0;x<WIDTH/20; x++) {
      myDraw(myXcoord,0);
      myDraw(myXcoord,HEIGHT);
      myXcoord=myXcoord+20;
    }


  }

  public static void myDraw(int xcoord, int ycoord){

    g.drawLine(xcoord, ycoord, WIDTH/2, HEIGHT/2);

  }

  //    Don't touch the code below
  static int WINDOW_WIDTH = 600;
  static int WINDOW_HEIGHT = 600;

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