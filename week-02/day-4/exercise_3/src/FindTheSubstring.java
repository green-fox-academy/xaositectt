public class FindTheSubstring {

  //Create a function that takes two strings as a parameter
  //Returns the starting index where the second one is starting in the first one
  //Returns -1 if the second string is not in the first on

  public static void main(String[] args) {

    String word1 = "Lofasz";
    String word2 = "fa";

    System.out.println(stringContain(word1, word2));
  }

  public static int stringContain(String container, String contained) {

    int startIndex = 0;

    if (container.toLowerCase().contains(contained.toLowerCase())) {
      System.out.println("yes it contains it, and the starting index is: ");
      startIndex = container.indexOf(contained, 0);
    } else {
      startIndex = 0;
    }
    return startIndex;
  }
}
