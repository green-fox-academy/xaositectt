//Write a Stream Expression to get the squared value of the positive numbers from the following array:
//ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Squared {

  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(
        Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

    List<Integer> squaresOfPositives = numbers.stream()
        .filter(n -> n > 0)
        .map(n -> n * n)
        .collect(Collectors.toList());

    System.out.println(squaresOfPositives);
    System.out.println(getSquaresOfPositives(numbers));

  }

  public static List<Integer> getSquaresOfPositives(List<Integer> inputList) {
    List<Integer> squaresOfPositives = new ArrayList<>();
    for (int number : inputList) {
      if (number > 0) {
        squaresOfPositives.add((int) Math.pow(number, 2));
      }
    }
    return squaresOfPositives;
  }
}
