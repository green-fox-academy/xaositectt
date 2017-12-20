//Write a function that computes a member of the fibonacci sequence by a given index
//Create tests that covers all types of input (like in the previous workshop exercise)

public class Fibonacci {
  private int index;

  public Fibonacci(int index) {
    this.index = index;
  }

  public static void main(String[] args) {
    Fibonacci fibonacci = new Fibonacci(5);

    System.out.println(fibonacciNum(fibonacci.getIndex()));
  }

  public int getIndex() {
    return index;
  }

  public void setIndex(int index) {
    this.index = index;
  }

  public static int fibonacciNum(int n) {
    if(n == 1) {
      return 0;
    } else if (n == 2) {
      return 1;
    } else {
      return fibonacciNum(n - 1) + fibonacciNum(n - 2);
    }
  }
}
