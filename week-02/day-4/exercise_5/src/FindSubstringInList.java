import java.lang.reflect.Array;
import java.util.*;

public class FindSubstringInList {

    //Create a function that takes a string and a list of string as a parameter
    //Returns the index of the string in the list where the first string is part of
    //Returns -1 if the string is not part any of the strings in the list

    //input: "ching", ["this", "is", "what", "I'm", "searching", "in"]
    //output: 4


    public static void main(String[] args) {

        ArrayList<String> myArrayList = new ArrayList<>();
        myArrayList.add("this");
        myArrayList.add("is");
        myArrayList.add("what");
        myArrayList.add("I'm");
        myArrayList.add("searching");
        myArrayList.add("in");
        myArrayList.add("searching");


        String myString = "ching";


        System.out.println(findpart(myArrayList, myString));

    }

    public static int findpart (ArrayList<String> inputList, String inputString){

        ArrayList<Integer> results= new ArrayList<>();

        for (int i=0; i < inputList.size(); i++){

            String currElement = inputList.get(i);

            if (currElement.contains(inputString)) {

                results.add(i);
            }
        }

        return results.get(0);
    }
}










