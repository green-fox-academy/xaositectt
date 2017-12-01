import java.util.*;

public class Anagram {

  //Create a function named is anagram following your current language's style guide. It should take
  // two strings and return a boolean value depending on whether its an anagram or not.
  // public static void main(String[] args) {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.println("This is an anagram checker. Please type in two sets of words:");
    String word1input = input.nextLine();
    String word2input = input.nextLine();
    System.out.println(word1input+" "+word2input);
    System.out.println("So it is "+ anaCheck(word1input, word2input)+ " that they are anagrams.");
  }

  public static boolean anaCheck(String input1, String input2) {
    input1= input1.toLowerCase().replaceAll("\\s+", "");
    input2= input2.toLowerCase().replaceAll("\\s+", "");
    char[] word1chars = input1.toCharArray();
    char[] word2chars = input2.toCharArray();
    Arrays.sort(word1chars);
    Arrays.sort(word2chars);
    String word1sorted = new String(word1chars);
    String word2sorted = new String(word2chars);
    return word1sorted.equals(word2sorted);
  }
}
