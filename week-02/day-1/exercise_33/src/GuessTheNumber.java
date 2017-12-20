import java.util.Scanner;

public class GuessTheNumber {
  // Write a program that stores a number, and the user has to figure it out.
  // The user can input guesses, after each guess the program would tell one
  // of the following:
  //
  // The stored number is higher
  // The stried number is lower
  // You found the number: 8
  public static void main(String[] args) {

    int Number = (int) (Math.random() * 100);

    Scanner input = new Scanner(System.in);

    System.out.println("Guess the number I've thought of!");

    int i = 1;
    while (i < 10) {
      System.out.println("Make a guess.");
      int guess = input.nextInt();

      if (guess < Number) {
        System.out.println("The stored number is higher");

      } else if (guess > Number) {
        System.out.println("The stried number is lower");
      } else {
        i = 11;
        System.out.println("You found the number: " + Number);
      }
    }
  }
}
