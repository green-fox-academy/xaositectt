import java.util.Scanner;

public class ParametricAverage {
    // Write a program that asks for a number.
    // It would ask this many times to enter an integer,
    // if all the integers are entered, it should print the sum and average of these
    // integers like:
    //
    // Sum: 22, Average: 4.4

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;

        System.out.println("How many numbers should I ask for?");

        int count = input.nextInt();



        for (int i=0; i < count;i++)
        {
            System.out.println("Give me a number:");
            int Input = input.nextInt();

            sum = sum + Input;

        }

        double average = (double)sum/count;

        System.out.println("The summary is:" +sum);
        System.out.println("The average is:" +average);




    }
}
