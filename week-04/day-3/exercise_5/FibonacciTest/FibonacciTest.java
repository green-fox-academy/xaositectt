import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

  @Test
  void fibonacciTest1() {
    Fibonacci fibonacciTest = new Fibonacci(6);
    int num = fibonacciTest.fibonacciNum(fibonacciTest.getIndex());
    assertEquals(num, 5);
  }
}