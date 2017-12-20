import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The seconf represents the number of pigs the farmer has
        // It should print how many legs all the animals have

        System.out.println("Insert the number of chickens:");

        int chickens = input.nextInt();

        int chickenLegs = chickens*2;

        System.out.println("Insert the number of pigs:");

        int pigs = input.nextInt();

        int pigLegs = pigs*4;

        int legSum = chickenLegs+pigLegs;

        System.out.println("There are " + legSum + " animal legs.");
    }
}
