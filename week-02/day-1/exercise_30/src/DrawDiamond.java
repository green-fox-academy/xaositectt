import java.util.Collections;
import java.util.Scanner;

public class DrawDiamond {
  public static void main(String[] args) {

    // Write a program that reads a number from the standard input, then draws a
    // diamond like this:
    //
    //
    //    *
    //   ***
    //  *****
    // *******
    //  *****
    //   ***
    //    *
    //
    // The diamond should have as many lines as the number was

    //defining the number of rows

    Scanner input = new Scanner(System.in);
    System.out.println("This exerise will print out a pyramid of *s");
    System.out.println("Enter a number:");

    int rowNumber = input.nextInt();

    // pyramid top and bottom numbers

    if (rowNumber % 2 != 0) {

      int top = (int) Math.ceil(rowNumber / 2);
      System.out.println("So the top pyramid will be this many rows: " + top);

      int bottom = rowNumber - top;
      System.out.println("So the bottom pyramid will be this many rows: " + bottom);

      // Top pyramid lines with a loop

      for (int n = 1; n <= top; n = n + 1) {

        //creating the number of stars and the number of spaces
        int starNum = ((n - 1) * 2) + 1;
        int spaceNum = top - n + 1;

        String space = String.join("", Collections.nCopies(spaceNum, " "));
        String row = String.join("", Collections.nCopies(starNum, "*"));
        System.out.println(String.join("", space, row));
      }
      //bottom pyramid lines with a loop

      for (int n = 1; n <= bottom; n = n + 1) {
        //creating the number of stars and the number of spaces
        int starNum = 2 * bottom - (2 * n - 1);
        int spaceNum = n - 1;
        String space = String.join("", Collections.nCopies(spaceNum, " "));
        String row = String.join("", Collections.nCopies(starNum, "*"));
        System.out.println(String.join("", space, row));
      }
    } else
    {
      int top = rowNumber / 2;
      System.out.println("So the top pyramid will be this many rows: " + top);

      int bottom = rowNumber / 2;
      System.out.println("So the bottom pyramid will be the same number of rows as the top");


      // Top pyramid lines with a loop


      for (int n = 1; n <= top; n = n + 1) {

        //creating the number of stars and the number of spaces
        int starNum = ((n - 1) * 2) + 1;
        int spaceNum = top - n + 1;

        String space = String.join("", Collections.nCopies(spaceNum, " "));
        String row = String.join("", Collections.nCopies(starNum, "*"));


        System.out.println(String.join("", space, row));
      }
      //bottom pyramid lines with a loop

      for (int n = 1; n <= bottom; n = n + 1) {
        //creating the number of stars and the number of spaces
        int starNum = 2 * bottom - ((2 * (n - 1)) + 1);
        int spaceNum = n;
        String space = String.join("", Collections.nCopies(spaceNum, " "));
        String row = String.join("", Collections.nCopies(starNum, "*"));
        System.out.println(String.join("", space, row));
      }
    }
  }
}
