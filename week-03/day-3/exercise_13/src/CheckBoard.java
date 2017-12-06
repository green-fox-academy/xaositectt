import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CheckBoard {

  static Graphics g;

  public static void mainDraw(Graphics graphics){
    // fill the canvas with a checkerboard pattern.

    drawCheck();
  }
  public static void drawCheck(){

      int sizeX = WIDTH/8;
      int sizeY = HEIGHT/8;
      for (int j=0; j<4;j++) {
        for (int i = 0; i < 4; i++) {
          g.setColor(Color.black);
          g.fillRect(0+j*(2*sizeX), 0 + i * (2 * sizeY), sizeX, sizeY);
        }
      }

      for (int j=0; j<4;j++) {
        for (int i = 0; i < 4; i++) {
          g.setColor(Color.black);
          g.fillRect(sizeX+j*(2*sizeX), sizeY + i * (2 * sizeY), sizeX, sizeY);
        }
      }
    }


  //    Don't touch the code below
  static int WINDOW_WIDTH = 623;
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