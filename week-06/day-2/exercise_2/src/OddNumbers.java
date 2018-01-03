//Write a Stream Expression to get the average value of the odd numbers from the following array:
//ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;

public class OddNumbers {

  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(
        Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

    double average = numbers.stream()
        .filter(n -> Math.abs(n) % 2 == 1)
        .mapToDouble(n -> n)
        .average()
        .getAsDouble();

    //how to cast optionaldouble as double
    //double value = average.orElse(-1);

    System.out.println(average);
    System.out.println(averageOfOdds(numbers));
  }

  public static double averageOfOdds(ArrayList<Integer> inputList) {
    int sum = 0;
    int count= 0;
    for (int element : inputList) {
      if (Math.abs(element) % 2 == 1) {
        sum = sum + element;
        count++;
      }
    }
    return (double) sum / count;
  }
}
