import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;



public class Triangles {




  static Graphics g;

  public static void mainDraw(Graphics graphics){
    int myBase =8;
    int myHeight=7;


    for (int i=0; i <60; i++) {
      for (int j=0; j <i+1; j++)
        triangle(WIDTH/2-i*myBase/2+j*myBase, 20+i*myHeight, myHeight, myBase, g);
    }
}



  public static void triangle(int topX, int topY, int height, int base, Graphics graphics){

    int xpoints[] = {topX, topX-base/2, topX+base/2 };
    int ypoints[] = {topY, topY+height, topY+height};
    int npoints=3;
    graphics.drawPolygon(xpoints, ypoints, npoints);
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