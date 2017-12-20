import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it

        Scanner input = new Scanner(System.in);

        System.out.println("Insert a distance in km:");

        double distanceKm = input.nextDouble();

        double distanceMile = distanceKm * 1.609344;

        System.out.println("Your distance is " + distanceMile + " miles.");
    }
}
