import java.util.ArrayList;
import java.util.Arrays;

public class Lists_6 {
  public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));

    ArrayList<Integer> listTocheck = new ArrayList<Integer>(Arrays.asList(4, 8, 12, 16));

    // Check if list contains all of the following elements: 4,8,12,16
    // Print "true" if it contains all, otherwise print "false"
    // Can you do both the different approaches you tried in the previous one?

    if (list.containsAll(listTocheck)) {
      System.out.println("True");

    } else {
      System.out.println("False");
    }
    // other solution: check individually with contains...
  }
}
