import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQ {

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
      g.drawLine(0, 0+i*spaceY, 0+i*spaceX, HEIGHT/2);
    }

    for (int i=0; i < lineNumber; i++ ) {
      g.setColor(Color.pink);
      g.drawLine(0+i*spaceX, 0, WIDTH/2, 0+i*spaceY);
    }

      //second quarter

    for (int i=0; i < lineNumber; i++ ) {
      g.setColor(Color.green);
      g.drawLine(WIDTH/2, 0+i*spaceY, WIDTH/2+i*spaceX, HEIGHT/2);
    }

    for (int i=0; i < lineNumber; i++ ) {
      g.setColor(Color.pink);
      g.drawLine(WIDTH/2+i*spaceX, 0, WIDTH, 0+i*spaceY);
    }

      //third quarter

    for (int i=0; i < lineNumber; i++ ) {
      g.setColor(Color.green);
      g.drawLine(0, HEIGHT/2+i*spaceY, 0+i*spaceX, HEIGHT);
    }

    for (int i=0; i < lineNumber; i++ ) {
      g.setColor(Color.pink);
      g.drawLine(0+i*spaceX, HEIGHT/2, WIDTH/2, HEIGHT/2+i*spaceY);
    }

      //fourth quarter

    for (int i=0; i < lineNumber; i++ ) {
      g.setColor(Color.green);
      g.drawLine(WIDTH/2, HEIGHT/2+i*spaceY, WIDTH/2+i*spaceX, HEIGHT);
    }

    for (int i=0; i < lineNumber; i++ ) {
      g.setColor(Color.pink);
      g.drawLine(WIDTH/2+i*spaceX, HEIGHT/2, WIDTH, HEIGHT/2+i*spaceY);
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