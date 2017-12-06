import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {

  public static void mainDraw(Graphics graphics){
    // draw a box that has different colored lines on each edge.

    graphics.setColor(Color.blue);
    graphics.drawLine(50, 50, 300,50);

    graphics.setColor(Color.yellow);
    graphics.drawLine(300, 50, 300, 300 );

    graphics.setColor(Color.green);
    graphics.drawLine(300, 300, 50,300);

    graphics.setColor(Color.red);
    graphics.drawLine(50, 300, 50,50);





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
      mainDraw(graphics);

    }
  }

}