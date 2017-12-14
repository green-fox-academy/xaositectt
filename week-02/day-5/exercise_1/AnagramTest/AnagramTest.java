import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {
  @Test
  void anaCheck() {

    Anagram ana1 = new Anagram();
    ana1.setString1("aka");
    ana1.setString2("aka");
    assertTrue(ana1.anaCheck(ana1.getString1(),ana1.getString2()));
  }
}