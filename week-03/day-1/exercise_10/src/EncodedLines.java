import java.nio.file.*;
import java.util.*;
import java.io.*;

public class EncodedLines {
  public static void main(String[] args) {
    // Create a method that decrypts the duplicated-chars.txt

    Path filePath = Paths.get("src/encoded-lines.txt");
    decrypt(filePath);
  }

  private static void decrypt(Path mypath) {
    try {
      List<String> crypticList = Files.readAllLines(mypath);
      List<String> decryptedList = new ArrayList<>();
      for (int i=0; i < crypticList.size(); i++) {
        String currentString ="";
        String currentWord="";
        for (int j=0; j < crypticList.get(i).length(); j+=1) {
          String value = "" +crypticList.get(i).charAt(j);
          int charValue = value.charAt(0);
          String next = String.valueOf((char)(charValue-1));
          currentWord=currentWord+next;
        }

        currentString=currentString+currentWord +" ";
        decryptedList.add(currentString);
      }
      Path filePath = Paths.get("src/decrypted.txt");
      Files.write(filePath, decryptedList);
    }
    catch (Exception e) {}
  }
}