import java.util.Arrays;

public class ReverseElements {

  // - Create an array variable named `aj`
  //   with the following content: `[3, 4, 5, 6, 7]`
  // - Reverse the order of the elements in `aj`
  // - Print the elements of the reversed `aj`

  public static void main(String[] args) {

    int[] aj = {3, 4, 5, 6, 7};

    for (int k = 0; k < aj.length / 2; k++) {

      int store = aj[aj.length - k - 1];

      aj[aj.length - k - 1] = aj[k];
      aj[k] = store;
    }

    System.out.println(Arrays.toString(aj));
  }
}
