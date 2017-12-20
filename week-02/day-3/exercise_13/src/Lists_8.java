import java.util.Scanner;

public class Lists_8 {

  public static void main(String[] args) {
    // Create a simple calculator application which reads the parameters from the prompt
    // and prints the result to the prompt.
    // It should support the following operations:
    // +, -, *, /, % and it should support two operands.
    // The format of the expressions must be: {operation} {operand} {operand}.
    // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)
    // You can use the Scanner class
    // It should work like this:
    // Start the program
    // It prints: "Please type in the expression:"
    // Waits for the user input
    // Print the result to the prompt
    // Exit

    System.out.println("This is a calculator.");
    System.out.println("It supports +,-,*,/");
    System.out.println("Please type in the operation:");

    Scanner input = new Scanner(System.in);
    Scanner scanner = new Scanner(System.in);

    String operator = scanner.nextLine();

    System.out.println("Please type in the first number:");

    double firstNumber = input.nextDouble();

    System.out.println("Please type in the second number:");

    double secondNumber = input.nextDouble();

    if (operator.equals("+")) {
      double result = firstNumber + secondNumber;
      System.out.println(firstNumber + " " + operator + " " + secondNumber + "=" + " " + result);
    } else if (operator.equals("*")) {
      double result = firstNumber * secondNumber;
      System.out.println(firstNumber + " " + operator + " " + secondNumber + "=" + " " + result);
    } else if (operator.equals("-")) {
      double result = firstNumber - secondNumber;
      System.out.println(firstNumber + " " + operator + " " + secondNumber + "=" + " " + result);
    } else if (operator.equals("/")) {
      double result = firstNumber / secondNumber;
      System.out.println(firstNumber + " " + operator + " " + secondNumber + "=" + " " + result);
    }
    //System.out.println(firstNumber +" "+ operator +" "+ secondNumber+"=" + " "+ result);
    //System.out.println(firstNumber +" "+ operator +" "+ secondNumber+"=");
    //System.out.println(result);
  }
}
