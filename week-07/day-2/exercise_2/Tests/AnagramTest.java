import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AnagramTest {

  @Test
  public void firstTest() {
    String wordToCheck1 = "gorog";
    String wordToCheck2 = "orogg";
    boolean functionResult = Anagram.isAnagram(wordToCheck1, wordToCheck2);
    boolean expected = true;
    assertEquals(expected, functionResult);
  }

  @Test
  public void secondTest() {
    String wordToCheck1 = "goroga";
    String wordToCheck2 = "orogg";
    boolean functionResult = Anagram.isAnagram(wordToCheck1, wordToCheck2);
    boolean expected = false;
    assertEquals(expected, functionResult);
  }

  @Test
  public void thirdTest() {
    String wordToCheck1 = "goroga";
    String wordToCheck2 = "aorogg";
    boolean functionResult = Anagram.isAnagram(wordToCheck1, wordToCheck2);
    boolean expected = true;
    assertEquals(expected, functionResult);
  }
  @Test
  public void fourthTest() {
    String wordToCheck1 = "goroga";
    String wordToCheck2 = "aoroggaa";
    boolean functionResult = Anagram.isAnagram(wordToCheck1, wordToCheck2);
    boolean expected = false;
    assertEquals(expected, functionResult);
  }
  @Test
  public void fifthTest() {
    String wordToCheck1 = "gorog";
    String wordToCheck2 = "orrgg";
    boolean functionResult = Anagram.isAnagram(wordToCheck1, wordToCheck2);
    boolean expected = false;
    assertEquals(expected, functionResult);
  }

//  @Test
//  public void sixthTest() {
//    String wordToCheck1 = null;
//    String wordToCheck2 = null;
//    boolean functionResult = Anagram.isAnagram(wordToCheck1, wordToCheck2);
//    boolean expected = true;
//    assertEquals(expected, functionResult);
//  }
}
