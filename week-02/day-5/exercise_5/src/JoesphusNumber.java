import java.util.*;

public class JoesphusNumber {
  //Write a function to solve Josephus Problem. The program should ask for a number, this number
  // represents how many people are in the "game". The return value should be the number of the "winning" seat.

  //make an arraylist fromm the input with numbers from 1-till input number
  //if it's a power of 2 it's always going to be the first one
  //if it's an even number multiply it by 2 until it becomes an odd number,  the 1st one will always strike
  //when it becomes an odd number on the first round the first one strikes, but then he gets killed and it flips
  //if it's an odd number where 2n+1 n is odd it flips once
  //if it's an odd number where 2n+1 n is evem it keeps flipping until the whole thing becomes even


  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int maxNum = input.nextInt();

    

  }
}
