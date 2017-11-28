import java.util.Scanner;

public class Summing {


    //  Create the usual class wrapper
    //  and main method on your own.

    // - Write a function called `sum` that sum all the numbers
    //   until the given parameter

    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);

        System.out.println("Please type a parameter: ");

        int parameter = input.nextInt();

        System.out.println(sum(parameter));



    }

    public static int sum(int inputInt) {

        int i = 1;

        int sumNum =0;


        while (i <= inputInt) {

            sumNum =sumNum+i;
            i+=1;

        }

        return sumNum;

    }
}
