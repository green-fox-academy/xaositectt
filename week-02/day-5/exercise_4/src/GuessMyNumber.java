import java.util.Scanner;

public class GuessMyNumber {

  //Write a program where the program chooses a number between 1 and 100. The player is then
  // asked to enter a guess. If the player guesses wrong, then the program gives feedback and ask
  // to enter an other guess until the guess is correct.
  //Make the range customizable (ask for it before starting the guessing).
  //You can add lives. (optional)

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("I'm going to guess a number. How high should I go at max?");
    int maxNum = input.nextInt();
    int Number = (int) (Math.random() * maxNum);
    System.out.println("Guess the number I've thought of!");
    int i = 0;
    int life = 3;

    while (i < 10) {
      System.out.println("Make a guess.");
      int guess = input.nextInt();
      if (guess < Number && life > 0) {
        life = life - 1;
        System.out.println("The stored number is higher");
      } else if (guess > Number && life > 0) {
        life = life - 1;
        System.out.println("The stried number is lower");
      } else if (life == 0) {
        i = 11;
        System.out.println("You have no more lives left.");
      } else {
        i = 11;
        System.out.println("You found the number: " + Number);
      }
    }
  }
}
