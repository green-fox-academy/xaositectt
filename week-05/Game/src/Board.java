import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

  int cicaaX;
  int cicaaY;
  int numberofDivisions = 8;
  private int WIDTH = 800;
  private int HEIGHT = WIDTH;

  public Board() {
    //testBoxX = 0;
    //testBoxY = 0;
    // set the size of your draw board
    setPreferredSize(new Dimension(WIDTH, HEIGHT));
    setVisible(true);
  }

  public static void main(String[] args) {
    // Here is how you set up a new window and adding our board to it
    JFrame frame = new JFrame("RPG Game");
    Board board = new Board();
    frame.add(board);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.pack();
    // Here is how you can add a key event listener
    // The board object will be notified when hitting any key
    // with the system calling one of the below 3 methods
    frame.addKeyListener(board);
    // Notice (at the top) that we can only do this
    // because this Board class (the type of the board object) is also a KeyListener
  }


  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    // here you have a 720x720 canvas
    // you can create and draw an image using the class below e.g.
    //Wall wall = new Wall();
    //wall.getImageWall().draw(graphics, 0,0);

    TileMap newTileMap = new TileMap("map_arrangement/map_arrangement.txt");
    newTileMap.generateMap(graphics);

    Character cica = new Character(graphics, cicaaX, cicaaY);

    //PositionedImage image = new PositionedImage("Graphics/floor.jpg", 000, 000, 100);
    //PositionedImage image1 = new PositionedImage("Graphics/wall.jpg", 000, 100, 100);
    //image.draw(graphics);
    //image1.draw(graphics);
  }

  // To be a KeyListener the class needs to have these 3 methods in it
  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {

  }

  // But actually we can use just this one for our goals here
  @Override
  public void keyReleased(KeyEvent e) {
    int increment = WIDTH/numberofDivisions;
    // When the up or down keys hit, we change the position of our box
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      cicaaY -= increment;
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      cicaaY += increment;
    }
    if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      cicaaX -= increment;
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      cicaaX += increment;
    }

    // and redraw to have a new picture with the new coordinates
    repaint();
  }

  public int getWIDTH() {
    return WIDTH;
  }

  public void setWIDTH(int WIDTH) {
    this.WIDTH = WIDTH;
  }

  public int getHEIGHT() {
    return HEIGHT;
  }

  public void setHEIGHT(int HEIGHT) {
    this.HEIGHT = HEIGHT;
  }
}
