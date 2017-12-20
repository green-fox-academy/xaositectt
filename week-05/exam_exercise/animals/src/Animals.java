// The program's aim is to collect your favourite animals and store them in a text file.
// There is a given text file called '''favourites.txt''', it will contain the animals
// If ran from the command line without arguments
// It should print out the usage:
// ```java FavouriteAnimals [animal] [animal]```
// You can add as many command line arguments as many favourite you have.
// One animal should be stored only at once
// Each animal should be written in separate lines
// The program should only save animals, no need to print them

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Animals {
  public static void main(String[] args) {
    Path myPath = Paths.get("src/animals.txt");
    writeMyFile(myPath, uniqueList(putIntoList(args)));
  }

  public static ArrayList<String> putIntoList(String[] inputArray) {
    ArrayList<String> myList = new ArrayList<>();
      for (int i = 0; i < inputArray.length; i++) {
        myList.add(inputArray[i]);
    }
    return myList;
  }

  public static ArrayList<String> uniqueList(ArrayList<String> inputList) {
    ArrayList<String> uniqueList = new ArrayList<>();
    if (inputList.size() >0) {
      uniqueList.add(inputList.get(0));
      for (int i = 0; i < inputList.size(); i++) {
        for (int j = 0; j < uniqueList.size(); j++) {
          if (uniqueList.contains(inputList.get(i)) == false) {
            uniqueList.add(inputList.get(i));
          }
        }
      }
    } else {
      System.out.println("```java FavouriteAnimals [animal] [animal]```");
    }
    return uniqueList;
  }

   public static void writeMyFile(Path inputPath, ArrayList<String> inputArrayList) {
    try {
      for (int i = 0; i < inputArrayList.size(); i++) {
        Files.write(inputPath, inputArrayList);
      }
    } catch (Exception e) {
    }
  }
}

