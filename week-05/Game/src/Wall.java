import java.awt.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Wall {
  private boolean isWall = true;
  private Path filePath;
  private String filename = "Graphics/wall1_100.jpg";
  private PositionedImage imageWall;

  public Wall() {
    filePath = Paths.get(filename);
    imageWall = new PositionedImage(filename);
  }

  public PositionedImage getImageWall() {
    return imageWall;
  }
}
