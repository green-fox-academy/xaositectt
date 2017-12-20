import java.util.Arrays;

public class Anagram {

  private String string1;
  private String string2;

  public Anagram() {
  }

  public Anagram(String stringToCheck, String stringWith) {
    this.string1 = stringToCheck;
    this.string2 = stringToCheck;
  }

  public static boolean anaCheck(String input1, String input2) {
    input1 = input1.toLowerCase().replaceAll("\\s+", "");
    input2 = input2.toLowerCase().replaceAll("\\s+", "");
    char[] word1chars = input1.toCharArray();
    char[] word2chars = input2.toCharArray();
    Arrays.sort(word1chars);
    Arrays.sort(word2chars);
    String word1sorted = new String(word1chars);
    String word2sorted = new String(word2chars);
    return word1sorted.equals(word2sorted);
  }

  public String getString1() {
    return string1;
  }

  public void setString1(String string1) {
    this.string1 = string1;
  }

  public String getString2() {
    return string2;
  }

  public void setString2(String string2) {
    this.string2 = string2;
  }

  public static void main(String[] args) {
    Anagram thisAnagram = new Anagram("kutya", "atyuk");

    System.out.println(anaCheck(thisAnagram.getString1(), thisAnagram.getString2()));
  }
}
