import java.nio.file.*;
import java.util.*;
import java.io.*;

// Create a method that decrypts reversed-lines.txt

public class ReversedLines {
  public static void main(String[] args) {
    Path filePath = Paths.get("src/reversed-lines.txt");
    reversed(filePath);
  }

  private static void reversed(Path filePath ) {
    try {
      List<String> listToReverse = Files.readAllLines(filePath);
      List<String> listReversed = new ArrayList<>();
      for (int i=0; i <listToReverse.size(); i++)
      {
        String elementReversed =  new StringBuilder(listToReverse.get(i)).reverse().toString();
        listReversed.add(elementReversed);
      }
      Path filePathNew = Paths.get("src/decrypted.txt");
      Files.write(filePathNew, listReversed);
    } catch (Exception e) {}
  }
}
