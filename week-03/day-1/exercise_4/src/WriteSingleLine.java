import java.nio.file.*;
import java.util.*;
import java.io.*;
// Open a file called "my-file.txt"
// Write your name in it as a single line
// If the program is unable to write the file,
// then it should print an error message like: "Unable to write file: my-file.txt"

public class WriteSingleLine {
  public static void main(String[] args) {
    writeMyfile();
  }
  public static void writeMyfile() {
    Scanner input = new Scanner(System.in);
    String myname = input.next();
    try {
      // Required by Files.write(filePath, content)
      // Creates a new file if not exists and overwrites it's content
      // The elements of the content lists will become the lines of the file
      Path filePath = Paths.get("src/my-file.txt");
      List<String> myName = new ArrayList<>();
      myName.add(myname);
      Files.write(filePath, myName);
    } catch (Exception e) {
      System.out.println("Unable to write file: my-file.txt");
    }
  }
}
