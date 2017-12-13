import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppleTest {

  @Test
  public void shouldCreateFruitAndReturnName() {
    String name="birsalma";
    Apple apple = new Birs(name) ;
    assertTrue(apple.getApple().equals("birsalma"));
  }
}