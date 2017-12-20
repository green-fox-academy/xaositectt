public class Strings_5 {

  public static void main(String[] args) {
    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

    // Create a function that can reverse a String, which is passed as the parameter
    // Use it on this reversed string to check it!
    // Try to solve this using charAt() first, and optionally anything else after.

    System.out.println(reverse(reversed));
  }

  public static String reverse(String input) {

    String reverseInput = "";

    for (int i = input.length() - 1; i >= 0; i--) {


      reverseInput = reverseInput + input.charAt(i);
    }

    return reverseInput;
  }
}
