import java.util.ArrayList;

public class Unique {

  //Create a function that takes a list of numbers as a parameter
  //Returns a list of numbers where every number in the list occurs only once
  //input: [1, 11, 34, 11, 52, 61, 1, 34]
  //output: [1, 11, 34, 52, 61]

  public static void main(String[] args) {

    ArrayList<Integer> inputList = new ArrayList<Integer>();
    inputList.add(1);
    inputList.add(11);
    inputList.add(34);
    inputList.add(11);
    inputList.add(52);
    inputList.add(61);
    inputList.add(1);
    inputList.add(34);

    System.out.println(inputList);
    System.out.println(inputList.get(0));
    System.out.println(unique(inputList));
  }

  public static ArrayList<Integer> unique(ArrayList<Integer> input) {
    ArrayList<Integer> result = new ArrayList<Integer>();
    result.add(input.get(0));
    for (int i = 1; i < input.size(); i++) {
      if (result.contains(input.get(i)) == false) {
        result.add(input.get(i));
      }
    }
    return result;
  }
}
