import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PositionedImage {

  BufferedImage image;
  BufferedImage resized;
  int posX;
  int posY;

  public PositionedImage(String filename) {

    try {
      image = ImageIO.read(new File(filename));
      //Image resizedImage = image.getScaledInstance(width, -1, Image.SCALE_SMOOTH);
      //resized = new BufferedImage(resizedImage.getWidth(null), resizedImage.getHeight(null), BufferedImage.TYPE_INT_RGB);
      //resized.getGraphics().drawImage(resizedImage, 0, 0, null);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void draw(Graphics graphics, int posX, int posY) {
    if (image != null) {
      graphics.drawImage(image, posX, posY, null);
    }
  }
}
