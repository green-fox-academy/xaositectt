import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        // Create a program that asks for two numbers
        // If the second number is not bigger than the first one it should print:
        // "The second number should be bigger"
        //
        // If it is bigger it should count from the first number to the second by one
        //
        // example:
        //
        // first number: 3, second number: 6, should print:
        //
        // 3
        // 4
        // 5

        Scanner input = new Scanner(System.in);

        System.out.println("Give me two numbers:");

        int myNumber1 = input.nextInt();
        int myNumber2 = input.nextInt();
        if (myNumber2 <= myNumber1) {
            System.out.println("The second number should be bigger!");

        }

        else  {
            while(myNumber1 <= myNumber2) {


                System.out.println(myNumber1);
                myNumber1=myNumber1+1;


            }


        }


        System.out.println("This is the multiplication table of the number:");


    }

}
