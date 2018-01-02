import java.awt.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TileMap {
  private int[][] coordinateMapX;
  private int tileDimension;
  private Path filePath;

  public TileMap(String filepath) {
    this.filePath = Paths.get(filepath);
  }

  public void generateMap(Graphics graphics) {
    try {
      List<String> fileContentList = Files.readAllLines(filePath);
      Grass grass = new Grass();
      Wall wall = new Wall();
      for (int y = 0; y < fileContentList.size(); y++) {
        for (int x = 0; x < fileContentList.get(y).length(); x++) {
          if (fileContentList.get(y).charAt(x) == '0') {
            grass.getImageGrass().draw(graphics, x*100, y*100);
          } else {
            wall.getImageWall().draw(graphics,x*100, y*100);
          }
        }
      }
    } catch (Exception e) {
    }
  }
}
