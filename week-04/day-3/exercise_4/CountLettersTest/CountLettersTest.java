import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountLettersTest {
  @Test
  void countLettersTest() {

    CountLetters test1 = new CountLetters("Whatever");
    test1.charCountList();
    test1.printMap();
    assertEquals(test1.getLetterCountMap().get('e'), 2);


  }

}