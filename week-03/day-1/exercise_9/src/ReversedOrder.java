import java.nio.file.*;
import java.util.*;
import java.io.*;

// Create a method that decrypts reversed-lines.txt

public class ReversedOrder {
  public static void main(String[] args) {
    Path filePath = Paths.get("src/reversed-order.txt");
    reversed(filePath);
  }

  private static void reversed(Path filePath ) {
    try {
      List<String> listToReverse = Files.readAllLines(filePath);
      List<String> listReversed = new ArrayList<>();

      for (int i=0; i <listToReverse.size()/2; i++)
      {
        String firstHalf = listToReverse.get(i);
        String secondHalf = listToReverse.get(listToReverse.size()-1-i);
        listToReverse.set(i, secondHalf);
        listToReverse.set(listToReverse.size()-1-i, firstHalf);
      }
      Path filePathNew = Paths.get("src/decrypted.txt");
      Files.write(filePathNew, listToReverse);
    } catch (Exception e) {}
  }
}
