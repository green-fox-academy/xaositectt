import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UniqueCTest {

  @Test
  public void UniqueCTest1() {
    String inputString1 = "alma";
    List inputList1 = new ArrayList<>();
    inputList1.add("l");
    inputList1.add("m");
    assertEquals(UniqueC.uniqueCharacters(inputString1), inputList1);
  }

  @Test
  public void UniqueCTest2() {
    String inputString2 = "birka";
    List inputList2 = new ArrayList<>();
    inputList2.add("b");
    inputList2.add("i");
    inputList2.add("r");
    inputList2.add("k");
    inputList2.add("a");
    assertEquals(UniqueC.uniqueCharacters(inputString2), inputList2);
  }

  @Test
  public void UniqueCTest3() {
    String inputString3 = "momo";
    List inputList3 = new ArrayList<>();
    assertEquals(UniqueC.uniqueCharacters(inputString3), inputList3);
  }
}