//Write a Stream Expression to find which number squared value is more then 20 from the following array:
//ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5))

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MoreThan {

  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));

    List<Integer> squareGreaterThan20 = numbers.stream()
        .filter(n -> n * n > 20)
        .collect(Collectors.toList());
    System.out.println(squareGreaterThan20);
    System.out.println(sortSquareGreaterthan20(numbers));

  }

  public static List<Integer> sortSquareGreaterthan20(List<Integer> inputList) {
    List<Integer> sortedList = new ArrayList<>();
    for (int number : inputList) {
      if (number*number > 20) {
        sortedList.add(number);
      }
    }
    return sortedList;
  }
}
