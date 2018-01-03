//Write a Stream Expression to find the frequency of characters in a given string!

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Frequency {

  public static void main(String[] args) {
    String myString = "kiszeramerabavatag";
    Stream<String> words = Stream.of(myString);

    System.out.println(countChars(myString));

    Map<String, Long> letterToCount =
        words.map(w -> w.split(""))
            .flatMap(Arrays::stream)
            .collect(groupingBy(identity(), counting()));
  }

  public static Map<Character, Integer> countChars(String inputString) {
    Map<Character, Integer> charFrequency = new HashMap<>();
    for (int i = 0; i < inputString.length(); i++) {
      int count = 0;
      for (int j = 0; j < inputString.length(); j++) {
        if (inputString.charAt(i) == inputString.charAt(j)) {
          count++;
        }
      }
      charFrequency.put(inputString.charAt(i), count);
    }
    return charFrequency;
  }
}
