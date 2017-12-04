import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.io.IOException;
import java.util.*;

// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.

public class CountlessLines {
  public static void main(String[] args) {
    System.out.println(countLine("src/new_file.txt"));

  }

  public static int countLine(String fileName) {
    int a=0;
    try {
      Path filePath = Paths.get(fileName);
      List<String> lines = Files.readAllLines(filePath);
      a=lines.size();

    } catch (Exception e) { a=0;
    }
    return a;
  }
}
