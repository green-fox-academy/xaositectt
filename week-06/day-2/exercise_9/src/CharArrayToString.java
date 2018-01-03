//Write a Stream Expression to convert a char array to a string!

import java.util.stream.Collectors;

public class CharArrayToString {

  public static void main(String[] args) {

    char[] chars = {'a', 'b', 'c'};

    String what = new String(chars).chars()
        .mapToObj(e -> Character.toString((char)e))
        .collect(Collectors.joining());

    System.out.println(what);
    System.out.println(returnAsString(chars));
  }

  public static String returnAsString(char[] inputArray) {
    return new String(inputArray);
  }
}
