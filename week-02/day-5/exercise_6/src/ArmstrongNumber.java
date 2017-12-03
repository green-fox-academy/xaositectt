import java.lang.reflect.Array;
import java.util.*;
import static java.lang.Math.pow;

public class ArmstrongNumber {
  //Write a simple program to check if a given number is an armstrong number. The program should ask for a number.
  // E.g. if we type 371, the program should print out: The 371 is an Armstrong number.
  //An Armstrong number is an n-digit number that is equal to the sum of the nth powers of its digits.
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("This code Please an type in a number.");
    int myNumber = input.nextInt();
    //System.out.println(digitsArray(myNumber));
    System.out.println(isArmstrong(myNumber));
  }

  public static int digitsNthSum(int input) {
    ArrayList<Integer> myDigits = digitsArray(input);
    System.out.println("My digits are: " +myDigits);
    for (int i=0; i < myDigits.size(); i++) {
      double digitNth = Math.pow(myDigits.get(i), myDigits.size());
      myDigits.set(i, (int)digitNth);
    }
    System.out.println("My digits on nth power are: " +myDigits);
    int total= 0;
    for (int i=0; i < myDigits.size(); i++){
      total=total+myDigits.get(i);
    }
    return total;
  }

  public static ArrayList<Integer> digitsArray(int inputNum) {
    String inputNumString = String.valueOf(inputNum);
    ArrayList<Integer> digits= new ArrayList<>();
    for (int i = 0; i < inputNumString.length(); i++ ) {
      digits.add(Character.digit(inputNumString.charAt(i), 10));
    }
    return digits;
  }
  public static boolean isArmstrong(int inputNum) {
    boolean isIt =false;
    if ((digitsNthSum(inputNum)) == inputNum) {
      isIt = true;
    }
    else {
      isIt = false;
    }
    return isIt;
  }
}
