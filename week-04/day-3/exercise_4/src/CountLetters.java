//Write a function, that takes a string as an argument and returns a dictionary
//with all letters in the string as keys, and numbers as values that shows how
//many occurrences there are.
//Create a test for that.

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CountLetters {
  private String myString;
  HashMap letterCountMap;

  public CountLetters(String myString) {
    this.myString = myString;
    letterCountMap = new HashMap();
  }

  public void charCountList() {
    for (int i = 0; i < this.getMyString().length(); i++) {
      int num=0;
      for (int j = 0; j < this.getMyString().length(); j++) {
        if (this.getMyString().charAt(i) == this.getMyString().charAt(j)) {
          num++;
        }
      }
      this.getLetterCountMap().put(this.getMyString().charAt(i), num);
    }
  }

  public void printMap(){
    System.out.println(Arrays.asList(this.getLetterCountMap()));
  }

  public String getMyString() {
    return myString;
  }

  public HashMap getLetterCountMap() {
    return letterCountMap;
  }

  public void setMyString(String myString) {
    this.myString = myString;
  }

  public static void main(String[] args) {

    CountLetters thisOne = new CountLetters("Northamerica");

    thisOne.charCountList();

    thisOne.printMap();

    System.out.println(thisOne.getLetterCountMap().get('a'));
  }
}
