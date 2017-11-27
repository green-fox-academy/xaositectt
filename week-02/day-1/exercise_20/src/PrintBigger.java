import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {

        // Write a program that asks for two numbers and prints the bigger one

        Scanner input = new Scanner(System.in);

        System.out.println("Give me a number:");

        double myNumber1 = input.nextDouble();

        System.out.println("Give me another number:");

        double myNumber2 = input.nextDouble();

        if (myNumber1 > myNumber2) {

            System.out.println("The bigger number is " + myNumber1);

        } else if (myNumber1 < myNumber2) {

            System.out.println("The bigger number is " + myNumber2);

        } else {
            System.out.println("The two numbers are equal.");
        }

    }

}
