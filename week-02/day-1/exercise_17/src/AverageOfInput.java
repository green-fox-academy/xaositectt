import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4

        Scanner input = new Scanner(System.in);

        System.out.println("Give me 4 numbers please:");

        int numOne = input.nextInt();

        int numTwo = input.nextInt();

        int numThree = input.nextInt();

        int numFour = input.nextInt();

        int sum = numOne + numTwo + numThree + numFour;

        double average = (double)sum / 4;

        System.out.println("The sum of the numbers is " + sum + ".");
        System.out.println("The average of the numbers is " + average + ".");
    }
}
