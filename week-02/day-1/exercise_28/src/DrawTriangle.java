import java.util.Collections;
import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        //
        // *
        // **
        // ***
        // ****
        //
        // The triangle should have as many lines as the number was

        Scanner input = new Scanner(System.in);

        System.out.println("Give me a number:");

        int rowNum = input.nextInt();

        for (int n = 1; n <= rowNum; n = n+1) {

            //creating the number of stars
            int starNum=n;

            String row = String.join("", Collections.nCopies(starNum, "*"));

            System.out.println(row);



        }


    }

}
