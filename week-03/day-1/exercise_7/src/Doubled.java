import java.nio.file.*;
import java.util.*;
import java.io.*;

public class Doubled {
  public static void main(String[] args) {
    // Create a method that decrypts the duplicated-chars.txt
    decrypt();
  }

  private static void decrypt(Path mypath) {
    try {
      List<String> crypticList = Files.readAllLines(mypath);
      List<String> decryptedList = new ArrayList<>();
      for (int i=0; i < crypticList.size(); i++)

    }
    catch (Exception e) {}
  }
}
