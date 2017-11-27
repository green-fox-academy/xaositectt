import java.util.Collections;
import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {

        // Write a program that reads a number from the standard input, then draws a
        // pyramid like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //
        // The pyramid should have as many lines as the number was

        //defining the number of rows

        Scanner input = new Scanner(System.in);
        System.out.println("This exerise will print out a pyramid of *s");
        System.out.println("Enter a number:");

        int rowNumber = input.nextInt();

        //lines with a loop

        for (int n = 1; n <= rowNumber; n = n+1) {

            //creating the number of stars and the number of spaces
            int starNum=((n-1)*2)+1;
            int spaceNum=rowNumber-n;

            String space = String.join("", Collections.nCopies(spaceNum, " "));
            String row = String.join("", Collections.nCopies(starNum, "*"));


            System.out.println(String.join("", space, row));


        }

    }

}
