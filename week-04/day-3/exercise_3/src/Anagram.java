import java.util.Arrays;

public class Anagram {


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
