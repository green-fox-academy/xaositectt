import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {

        // Write a program that reads a number form the standard input,
        // Than prints "Odd" if the number is odd, or "Even" it it is even.

        Scanner input = new Scanner(System.in);

        System.out.println("Give me a number please:");

        int numberInput = input.nextInt();

        if ( numberInput%2 ==0) {
            System.out.println("The number is even.");

        }

        else {
            System.out.println("The number is odd.");

        }


    }

}
