//Write a Stream Expression to find the uppercase characters in a string!

import static java.lang.Character.isUpperCase;

import java.util.List;
import java.util.stream.Collectors;

public class Uppercase {

  public static void main(String[] args) {

    String myString = "HUEHUEeeee";
    List<Character> chars = myString.chars()
        .mapToObj(e -> (char) e)
        .filter(p -> isUpperCase(p))
        .collect(Collectors.toList());

    System.out.println(chars);

    System.out.println(countUppercase(myString));
  }

  public static String countUppercase(String inputString) {
    String uppercases = "";
    for (char character : inputString.toCharArray()) {
      if (isUpperCase(character)) {
        uppercases = uppercases + character;
      }
    }
    return uppercases;
  }
}
