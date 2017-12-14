import java.util.*;

public class Anagram {

  private String string1;
  private String string2;

  public Anagram() {
  }

  public String getString1() {
    return string1;
  }

  public String getString2() {
    return string2;
  }

  public void setString2(String string2) {
    this.string2 = string2;
  }

  public void setString1(String string1) {
    this.string1 = string1;
  }

  public void main(String[] args) {
   anaCheck(this.getString1(), this.getString2());
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
