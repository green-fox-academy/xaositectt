//Write a Stream Expression to find the strings which starts with A and ends with I in the
//following array:
//ArrayList<String> numbers = new ArrayList<>(Arrays.asList("ROME", "LONDON", "NAIROBI",
//"CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartsEnds {

  public static void main(String[] args) {
    ArrayList<String> numbers = new ArrayList<>(Arrays.asList("ROME", "LONDON", "NAIROBI",
"CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));

    System.out.println(checkStartEndChars(numbers));

    List<String> matchingStrings = numbers.stream()
        .filter(p -> p.startsWith("A"))
        .filter(q -> q.endsWith("I"))
        .collect(Collectors.toList());

    System.out.println(matchingStrings);
  }

  public static List<String> checkStartEndChars(List<String> inputList) {
    List<String> matches = new ArrayList<>();
    for (String element : inputList) {
      if (element.startsWith("A") & element.endsWith("I")) {
        matches.add(element);
      }
    }
    return matches;
  }
}
