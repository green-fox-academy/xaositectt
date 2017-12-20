import java.util.Collections;
import java.util.Scanner;

public class DrawSquare {
  public static void main(String[] args) {
    // Write a program that reads a number from the standard input, then draws a
    // square like this:
    //
    //
    // %%%%%
    // %   %
    // %   %
    // %   %
    // %   %
    // %%%%%
    //
    // The square should have as many lines as the number was

    //defining the number of rows
    Scanner input = new Scanner(System.in);
    System.out.println("This exerise will print out a square of %-s");
    System.out.println("Enter a number:");

    int rowNumber = input.nextInt();
    //creating the rows
    String spaces = String.join("", Collections.nCopies(rowNumber - 2, " "));
    String row = String.join("", Collections.nCopies(rowNumber, "%"));
    //first line
    System.out.println(row);
    //middle lines with a loop

    int n = 0;
    int middleRows = rowNumber - 2;

    while (n <= middleRows) {
      System.out.println("%" + spaces + "%");
      n += 1;

    }
    //last line

    System.out.println(row);
  }
}
