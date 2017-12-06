import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {

  static Graphics g;

  public static void mainDraw(Graphics graphics){
    // create a line drawing function that takes 2 parameters:
    // the x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // fill the canvas with lines from the edges, every 20 px, to the center.

    linePlay(5);

  }

  public static void linePlay(int lineNumber){

    int startX=0;
    int startY=0;
    int endX=0;
    int endY=0;
    int spaceX=WIDTH/lineNumber;
    

    for (int i=0; i < WIDTH/lineNumber; i++ ) {
      g.drawLine(startX, startY+i*);
    }

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