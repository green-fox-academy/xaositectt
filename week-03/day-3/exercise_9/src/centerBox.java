import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class centerBox {

  static Graphics g;

  public static void mainDraw(Graphics graphics){
    // create a square drawing function that takes 1 parameter:
    // the square size
    // and draws a square of that size to the center of the canvas.
    // draw 3 squares with that function.


    drawRect(10);
    drawRect(30);
    drawRect(50);




  }

  public static void drawRect(int edge){

    g.drawRect(WIDTH/2-edge/2, HEIGHT/2-edge/2, edge, edge);

  }

  //    Don't touch the code below
  static int WINDOW_WIDTH = 800;
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