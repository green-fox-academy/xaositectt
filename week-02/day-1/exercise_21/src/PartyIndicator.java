import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {

        // Write a program that asks for two numbers
        // Thw first number represents the number of girls that comes to a party, the
        // second the boys
        // It should print: The party is exellent!
        // If the the number of girls and boys are equal and there are more people coming than 20
        //
        // It should print: Quite cool party!
        // It there are more than 20 people coming but the girl - boy ratio is not 1-1
        //
        // It should print: Average party...
        // If there are less people coming than 20
        //
        // It should print: Sausage party
        // If no girls are coming, regardless the count of the people

        Scanner input = new Scanner(System.in);

        System.out.println("There is a party tonight.");

        System.out.println("Give me the number of girls:");

        int numGirls = input.nextInt();

        System.out.println("Give me the number of boys:");

        int numBoys = input.nextInt();

        int sum = numGirls + numBoys;

        if  ((numGirls == numBoys) &&  (sum >= 20)) {
            System.out.println("It's gonna be an excellent party!");
        }

        else if  ((numGirls != numBoys) &&  (sum >= 20) && (numGirls >0)) {
            System.out.println("It's gonna be quite a cool party!");
        }

        else if  (  (sum < 20) && (numGirls >0)) {
            System.out.println("It's gonna be an average party.");
        }

        else if  (numGirls == 0) {
            System.out.println("It's gonna be a sausage fest:(");
        }


    }

}
