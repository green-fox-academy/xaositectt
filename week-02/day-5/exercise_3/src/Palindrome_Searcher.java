import java.lang.reflect.Array;
import java.util.*;


public class Palindrome_Searcher {
  //Create a function named search palindrome following your current language's style guide. It should take a
  // string, search for palindromes that at least 3 characters long and return a list with the found palindromes.
  //create a lowercase string without spaces or special characters
  //create all possible substrings of the string using .substring and put them into an array list, usimg two loops
  //check if all the members of the array are symmetric and if yes add them to a new arraylist
  //return the arraylist

  public static void main(String[] args) {
    System.out.println("This is a palindrome searcher. Enter a set of words:");
    Scanner input = new Scanner(System.in);
    String myWords = input.nextLine();
    System.out.println(palinSearch(myWords));
  }

  public static ArrayList<String> palinSearch(String input) {
    ArrayList<String> myList = new ArrayList<>();
    //I put all possible substrings into an arraylist
    if (input.length() < 3) {
      System.out.println("The string is too short.");
    } else {
      String inputFixed = input.toLowerCase().replaceAll("\\s+", "");

      for (int i = 0; i < inputFixed.length(); i++) {
        for (int j = 3; j < inputFixed.length() + 1 - i; j++) {
          myList.add(input.substring(i, i + j));
        }
      }
    }
    //I sort out all the unique strings
    ArrayList<String> myListUnique = new ArrayList<>();
    for (int j = 0; j < myList.size(); j++) {
      if (myListUnique.contains(myList.get(j)) == false) {
        myListUnique.add(myList.get(j));
      }
    }
    //I check if the strings are palindromes
    ArrayList<String> myPalindromeList = new ArrayList<>();
    for (int k = 0; k < myListUnique.size(); k++) {
      boolean isIt =true;
      for (int l=0; l <myListUnique.get(k).length()/2; l++) {
        if (myListUnique.get(k).charAt(l) != myListUnique.get(k).charAt(myListUnique.get(k).length() - 1 - l)) {
          isIt = false;
        }
      }
      if (isIt == true) {
        myPalindromeList.add(myListUnique.get(k));
      }
    }
    //System.out.println(myList);
    //System.out.println(myListUnique);
    return myPalindromeList;
  }
}


