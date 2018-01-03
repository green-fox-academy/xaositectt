//Write a Stream Expression to find the frequency of numbers in the following array:
//ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2));

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyNum {

  public static void main(String[] args) {
    ArrayList<Integer> numbers = new
        ArrayList<>(Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2));

    Map<Integer, Long> frequencies = numbers.stream()
        .collect(Collectors.groupingBy(
            e -> e,
            Collectors.counting()
            )
        );

    System.out.println(frequencies);
    System.out.println(countNumbers(numbers));
  }

  public static Map<Integer, Integer> countNumbers(ArrayList<Integer> inputList) {
    Map<Integer, Integer> frequencies = new HashMap<>();
    for (int i = 0; i < inputList.size(); i++) {
      int count = 0;
      for (int j = 0; j < inputList.size(); j++) {
        if (inputList.get(i) == inputList.get(j)) {
          count++;
        }
      }
      frequencies.put(inputList.get(i), count);
    }
    return frequencies;
  }
}
