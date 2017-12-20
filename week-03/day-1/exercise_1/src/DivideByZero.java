public class DivideByZero {
  // create a function that takes a number
  // divides ten with it,
  // and prints the result.
  // it should print "fail" if the parameter is 0

  public static void main(String[] args) {
    System.out.println(divider(10, 0));
  }

  public static int divider(int dividee, int divider) {
    int result = 0;
    try {
      result = dividee / divider;
    } catch (Exception e) {
      System.out.println("fail");
    }
    return result;
  }
}