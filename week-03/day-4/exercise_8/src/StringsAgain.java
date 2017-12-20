public class StringsAgain {

  public static void main(String[] args) {
    String myString = "xaxaxaxa";
    String from = "x";
    String to = "";
    System.out.println(replace(myString, from, to));
  }

  public static String replace(String s, String from, String to) {
    if (s.contains(from) == false) {
      return s;
    } else {
      return replace(s.replaceFirst(from, to), from, to);
    }
  }
}
