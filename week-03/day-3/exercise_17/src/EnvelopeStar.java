import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {

  static Graphics g;

  public static void mainDraw(Graphics graphics){
    linePlay(30);
  }

  public static void linePlay(int lineNumber){

    int spaceX=WIDTH/lineNumber/2;
    int spaceY=HEIGHT/lineNumber/2;

    //first quarter

    for (int i=0; i < lineNumber; i++ ) {
      g.setColor(Color.green);
      g.drawLine(0+i*spaceX, HEIGHT/2, WIDTH/2, HEIGHT/2-i*spaceY);
    }

    //second quarter

    for (int i=0; i < lineNumber; i++ ) {
      g.setColor(Color.green);
      g.drawLine(WIDTH/2, 0+i*spaceY, WIDTH/2+i*spaceX, HEIGHT/2);
    }

    //third quarter

    for (int i=0; i < lineNumber; i++ ) {
      g.setColor(Color.green);
      g.drawLine(0+i*spaceX, HEIGHT/2, WIDTH/2, HEIGHT/2+i*spaceY);
    }

    //fourth quarter

    for (int i=0; i < lineNumber; i++ ) {
      g.setColor(Color.green);
      g.drawLine(WIDTH/2, HEIGHT-i*spaceY, WIDTH/2+i*spaceX, HEIGHT/2);
    }

  }

  //    Don't touch the code below
  static int WINDOW_WIDTH = 600;
  static int WINDOW_HEIGHT = 623;

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