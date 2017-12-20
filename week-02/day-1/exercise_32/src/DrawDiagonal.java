import java.util.Collections;
import java.util.Scanner;

public class DrawDiagonal {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("This exerise will print out a square of %-s");
    System.out.println("Enter a number:");

    int rowNumber = input.nextInt();

    //creating the rows

    String row = String.join("", Collections.nCopies(rowNumber, "%"));

    //first line

    System.out.println(row);

    //middle lines with a loop

    int n = 0;
    int middleRows = rowNumber - 2;

    while (n < middleRows) {
      String space1 = String.join("", Collections.nCopies(n, " "));

      String space2 = String.join("", Collections.nCopies((rowNumber - n - 3), " "));

      System.out.println("%" + space1 + "%" + space2 + "%");
      n += 1;
    }
    //last line
    System.out.println(row);
  }
}
