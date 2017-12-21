import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class GameObject {
  BufferedImage image;
  int posX;
  int posY;
  Graphics g;

  public GameObject() {
  }

  public GameObject(String fileName, int posX, int posY) {
    this.posX = posX;
    this.posY = posY;
    try {
      image = ImageIO.read(new File(fileName));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void draw(int posX, int posY) {
    if (image != null) {
      g.drawImage(image, posX, posY, null);
    }
  }


}
