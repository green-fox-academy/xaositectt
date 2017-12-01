import java.lang.reflect.Array;
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

  //maradékos osztás a megmaradt sor és a sor eredeti hossza közt azt adja meg hogy hányadikat kell megölni!


  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.println("How many people are in the circle?");
    int maxNum = input.nextInt();
    System.out.println("So the list of people is here:");
    ArrayList<Integer> inputList= peopleList(maxNum);
    System.out.println(peopleList(maxNum));
    System.out.println(josephus(inputList, 0));





  }

  public static ArrayList<Integer> peopleList(int maxNumber) {
    ArrayList<Integer> numList = new ArrayList<>();
    for (int i=0; i < maxNumber; i++) {
      numList.add(i+1);
    }
    return numList;
  }

  public static ArrayList<Integer> josephus(ArrayList<Integer> inputList, int position) {
    int a=0;
    while (inputList.size()>1) {


      inputList.remove(inputList.size()%(inputList.size()-position-a-1));


    }
    return inputList;
  }

}
