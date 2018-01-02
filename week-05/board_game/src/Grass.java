import java.awt.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Grass {
  private boolean isWall = false;
  private Path filePath;
  private String filename = "Graphics/floor1_100.jpg";
  PositionedImage imageGrass;

  public Grass() {
    filePath = Paths.get(filename);
    imageGrass = new PositionedImage(filename);
  }

  public PositionedImage getImageGrass() {
    return imageGrass;
  }
}

