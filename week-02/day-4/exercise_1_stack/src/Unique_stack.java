import java.util.*;

public class Unique_stack {

    //input: [1, 11, 34, 11, 52, 61, 1, 34]
    //output: [1, 11, 34, 52, 61]

    //Create a function that takes a list of numbers as a parameter
    //Returns a list of numbers where every number in the list occurs only once

    public static void main(String[] args) {

        int[] myIntArray = {1, 11, 34, 11, 52, 61, 1, 34};

        Set<Integer> set = new HashSet<Integer>();
        int[] array = {1,1,2,2,2,3,3,4,5,6,8};

        for (int num : array) {
            set.add(num);
        }

        System.out.println(set);




    }
}
