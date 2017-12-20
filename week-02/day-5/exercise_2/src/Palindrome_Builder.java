import java.util.Scanner;

public class Palindrome_Builder {
  //Create a function named create palindrome following your current
  // language's style guide. It should take a string, create a palindrome from it and then return it.

  //get the sting input
  //turn it into char array
  //reverse it
  //turn it back into string
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.println("This is a palindrome creator. Insert a word and it returns a nonsensical symmetrical version.");
    String inputWord = input.nextLine();
    System.out.println(palindrome(inputWord));
  }

  public static String palindrome(String input) {
    String reversed = new StringBuilder(input).reverse().toString();
    String inputPalin =input+reversed;
    return inputPalin;
  }
}
