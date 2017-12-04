import java.nio.file.*;
import java.util.*;
import java.io.*;

// Create a function that takes 3 parameters: a path, a word and a number,
// than it should write to a file.
// The path parameter should be a string, that describes the location of the file.
// The word parameter should be a string, that will be written to the file as lines
// The number paramter should describe how many lines the file should have.
// So if the word is "apple" and the number is 5, than it should write 5 lines
// to the file and each line should be "apple"
// The function should not raise any error if it could not write the file.

public class WriteMultipleLines {
  public static void main(String[] args) {
    Path myPath = Paths.get("src/myfile.txt");
    String myWord = "This will be my line" ;
    int myNumber = 5;
    writeFile(myPath, myWord, myNumber);
  }

  public static void writeFile(Path inputPath, String inputWord, int inputNumber ) {
    try {
      List<String> inputList = new ArrayList<>();
      for (int i=0; i < inputNumber; i++) {
        inputList.add(inputWord);
      }
      Files.write(inputPath, inputList);
    } catch (Exception e) {}
  }
}
