public class PrintArguments {
  //  Create the usual class wrapper
  //  and main method on your own.
  // - Create a function called `printer`
  //   which prints the input String parameters
  // - It can have any number of parameters
  // Examples
  // printer("first")
  // printer("first", "second")
  // printer("first", "second", "third", "fourh")
  // ...

  public static void main(String[] args) {
    printer("asd", "ahh", "ehh", "uhh", "gnnn");
  }

  public static void printer(String... args) {
    for (String arg : args) {
      System.out.print(arg + " ");
    }
  }
}
