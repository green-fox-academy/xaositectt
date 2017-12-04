import java.nio.file.*;
import java.util.*;
import java.io.*;



// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

public class CopyFile {
  public static void main(String[] args) {
    Path filePath1 =Paths.get("src/myfile1.txt");
    Path filePath2 =Paths.get("src/myfile2.txt");
    System.out.println(copyFile(filePath1, filePath2));
  }
  private static boolean copyFile(Path added, Path addee) {
    boolean isIt =false;
    try {
      List<String> startFileList = Files.readAllLines(added);
      System.out.println(startFileList);
      Files.write(addee, startFileList);
      byte[] f1 = Files.readAllBytes(added);
      byte[] f2 = Files.readAllBytes(addee);
      isIt= Arrays.equals(f1, f2);
    } catch (Exception e) {}
    return isIt;
  }
}
