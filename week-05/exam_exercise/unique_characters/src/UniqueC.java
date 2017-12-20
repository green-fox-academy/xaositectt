// Create a function called `uniqueCharacters` that takes a string as parameter
// and returns a list with the unique letters of the given string
// Create basic unit tests for it with at least 3 different test cases

import java.util.ArrayList;
import java.util.List;
// Should print out:
// ["n", "g", "r", "m"]

public class UniqueC {
  public static void main(String[] args) {
    System.out.println(uniqueCharacters("anagram"));
  }

  public static List<String > uniqueCharacters(String inputString) {
    List<String> uniqueCharList = new ArrayList<>();
    for (int i = 0; i < inputString.length() ; i++) {
      int occurence = 0;
      for (int j = 0; j < inputString.length(); j++) {
        if (inputString.charAt(i) == inputString.charAt(j)) {
          occurence++;
        }
      }
      if (occurence == 1) {
        String uniqueChar = String.valueOf(inputString.charAt(i));
        uniqueCharList.add(uniqueChar);
      }
    }
    return uniqueCharList;
  }
}
