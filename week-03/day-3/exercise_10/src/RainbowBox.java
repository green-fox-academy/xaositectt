import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBox {

  static Graphics g;

  public static void mainDraw(Graphics graphics){
    // create a square drawing function that takes 2 parameters:
    // the square size, and the fill color,
    // and draws a square of that size and color to the center of the canvas.
    // create a loop that fills the canvas with rainbow colored squares.

    ArrayList<Color> rainbow= new ArrayList<>();

    Color Violet = new Color(148, 0, 211);
    Color Indigo = new Color(75, 0, 130);
    Color Blue = new Color(0, 0, 255);
    Color Green = new Color(0, 255, 0);
    Color Yellow = new Color(255, 255, 0);
    Color Orange = new Color(255, 127, 0);
    Color Red = new Color(255, 0 , 0);

    rainbow.add(Violet);
    rainbow.add(Indigo);
    rainbow.add(Blue);
    rainbow.add(Green);
    rainbow.add(Yellow);
    rainbow.add(Orange);
    rainbow.add(Red);

    for (int i=0; i < rainbow.size(); i++) {
      int rectSize = (WIDTH/rainbow.size())*(i+1);
      drawRect(rectSize, rainbow.get(i));
    }
  }

  public static void drawRect(int edge, Color color){


    g.setColor(color);
    g.drawRect(WIDTH/2-edge/2, HEIGHT/2-edge/2, edge, edge);

  }

  //    Don't touch the code below
  static int WINDOW_WIDTH = 723;
  static int WINDOW_HEIGHT = 700;

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