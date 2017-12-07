import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.Array;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

// draw the night sky:
// - The background should be black
// - The stars can be small squares
// - The stars should have random positions on the canvas
// - The stars should have random color (some shade of grey)

public class StarryNight {

  static Graphics g;

  public static void mainDraw(Graphics graphics){

    graphics.setColor(Color.black);
    graphics.fillRect(0, 0, WIDTH, HEIGHT);

    int numStars = (int) (Math.random() * 50000000);

    for (int i=0; i<numStars; i++) {
      int rectSize = (int) (Math.random()*20);
      int colorNum = (int) (Math.random()*255);
      Color myGrey = new Color(colorNum, colorNum , colorNum);
      graphics.setColor(myGrey);
      int randomX = (int) (Math.random()*WIDTH);
      int randomY = (int) (Math.random()*HEIGHT);
      graphics.fillRect(randomX, randomY, rectSize, rectSize);
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