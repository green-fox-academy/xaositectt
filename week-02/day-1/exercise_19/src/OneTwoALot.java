import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {
        // Write a program that reads a number form the standard input,
        // If the number is zero or smaller it should print: Not enough
        // If the number is one it should print: One
        // If the number is two it should print: Two
        // If the number is more than two it should print: A lot

        Scanner input = new Scanner(System.in);

        System.out.println("Give me a number:");

        int myNumber = input.nextInt();

        if (myNumber <= 0) {
            System.out.println("Not enough.");

        }

        else if (myNumber == 1) {
            System.out.println("It is one.");
        }

        else if (myNumber == 2) {
            System.out.println("It is two.");
        }

        else if (myNumber > 2) {
            System.out.println("It is a lot.");
        }
    }
}
