import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {
  public static void main(String[] args) {
    // Create a method that decrypts the duplicated-chars.txt

    Path filePath = Paths.get("src/duplicated-chars.txt");
    decrypt(filePath);
  }

  private static void decrypt(Path mypath) {
    try {
      List<String> crypticList = Files.readAllLines(mypath);
      List<String> decryptedList = new ArrayList<>();
      for (int i = 0; i < crypticList.size(); i++) {
        String currentString = "";
        for (int j = 0; j < crypticList.get(i).length(); j += 2) {
          currentString = currentString + crypticList.get(i).charAt(j);
        }
        currentString = currentString + " ";
        decryptedList.add(currentString);
      }
      Path filePath = Paths.get("src/decrypted.txt");
      Files.write(filePath, decryptedList);
    } catch (Exception e) {
    }
  }
}
