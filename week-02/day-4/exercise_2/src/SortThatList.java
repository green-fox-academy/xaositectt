import java.util.ArrayList;
import java.util.Collections;

public class SortThatList {
  //Create a function that takes a list of numbers as parameter
  //Returns a list where the elements are sorted in ascending numerical order
  //Make a second boolean parameter, if it's true sort that list descending

  public static void main(String[] args) {
    ArrayList<Integer> mainList = new ArrayList<Integer>();
    mainList.add(5);
    mainList.add(2);
    mainList.add(10);
    mainList.add(14);
    mainList.add(3);
    mainList.add(6);
    mainList.add(9);
    boolean asc = false;
    System.out.println(listSort(mainList, asc));
  }

  public static ArrayList<Integer> listSort(ArrayList<Integer> inputList, boolean asctrue) {
    if (asctrue == true) {
      Collections.sort(inputList);
    } else {
      Collections.sort(inputList);
      for (int i = 0; i < inputList.size() / 2; i++) {
        int front = inputList.get(i);
        int back = inputList.get(inputList.size() - i - 1);
        inputList.set(i, back);
        inputList.set(inputList.size() - i - 1, front);
      }
    }
    //ArrayList<Integer> mainList = new ArrayList<Integer>(Collections.sort(inputList));
    return inputList;
  }
}
