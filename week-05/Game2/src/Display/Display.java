package Display;

import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Display {

  //we draw images to the canvas, and display that in the frame
  private JFrame frame;
  private Canvas canvas;

  private String title;
  private int width;
  private int height;

  public Display(String title, int width, int height) {
    this.title = title;
    this.width = width;
    this.height = height;
    createDisplay();
  }

  //initializes JFrame
  private void createDisplay() {
    frame = new JFrame(title);
    frame.setSize(width, height);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(false);
    //it will appear in the center:
    frame.setLocationRelativeTo(null);
    //JFrame is by default invisible:
    frame.setVisible(true);

    canvas = new Canvas();

    //set size of canvas
    canvas.setPreferredSize(new Dimension(width, height));
    canvas.setMaximumSize(new Dimension(width, height));
    canvas.setMinimumSize(new Dimension(width, height));

    frame.add(canvas);
    //resize a window a bit so that we can see the canvas fully
    frame.pack();
  }

  public Canvas getCanvas() {
    return canvas;
  }
}
