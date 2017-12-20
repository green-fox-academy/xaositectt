public class Doubling {
  // - Create an integer variable named `ak` and assign the value `123` to it
  // - Create a function called `doubling` that doubles it's input parameter
  // - Print the result of `doubling(ak)`
  public static void main(String[] args) {
    int ok = 123;
    System.out.println(doubling(ok));
    //doubling(ok);
  }
  public static int doubling(int Input) {
    int doubling = 2 * Input;
    return doubling;
  }
}
