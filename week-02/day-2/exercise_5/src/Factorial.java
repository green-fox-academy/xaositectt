import java.util.Scanner;

public class Factorial
{


    //  Create the usual class wrapper
    //  and main method on your own.

    // - Create a function called `factorio`
    //   that returns it's input's factorial

    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);

        System.out.println("Please type a parameter: ");

        int parameter = input.nextInt();

        System.out.println(factorio(parameter));



    }

    public static int factorio(int inputInt) {

        int i = 1;

        int product =1;


        while (i <= inputInt) {

            product =product*i;
            i+=1;

        }

        return product;

    }

}
