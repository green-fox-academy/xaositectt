import java.util.ArrayList;

public class FindPartOfInteger {

  //Create a function that takes a number and a list of numbers as a parameter
  //Returns the indeces of the numbers in the list where the first number is part of
  //Returns an empty list if the number is not part any of the numbers in the list
  //input: [1, 11, 34, 52, 61], 1
  //output: [0, 1, 4]

  public static void main(String[] args) {

    ArrayList<Integer> myArrayList = new ArrayList<>();
    myArrayList.add(1);
    myArrayList.add(11);
    myArrayList.add(34);
    myArrayList.add(52);
    myArrayList.add(61);

    int myNumber = 1;

    System.out.println(findpart(myArrayList, myNumber));
  }

  public static ArrayList<Integer> findpart(ArrayList<Integer> inputList, int inputNum) {

    ArrayList<Integer> results = new ArrayList<>();

    String myNumString = String.valueOf(inputNum);

    for (int i = 0; i < inputList.size(); i++) {

      String currElement = inputList.get(i).toString();

      if (currElement.contains(myNumString)) {

        results.add(i);
      }
    }
    return results;
  }
}
