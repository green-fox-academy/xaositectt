//Write a Stream Expression to get the even numbers from the following array:
//ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {

  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(
        Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

    List<Integer> evenNumbers = numbers.stream()
        .filter(n -> n % 2 == 0)
        .collect(Collectors.toList());
    System.out.println(evenNumbers);

    System.out.println(sortEvenNumbers(numbers));
  }

  public static List<Integer> sortEvenNumbers(List<Integer> inputList) {
    List<Integer> sortedList = new ArrayList<>();
    for (int number : inputList) {
      if (number % 2 == 0) {
        sortedList.add(number);
      }
    }
    return sortedList;
  }
}

