// Given a string, compute recursively a new string where all the
// adjacent chars are now separated by a "*".

public class StringsAgain2 {

  public static void main(String[] args) {
    String myString = "xaxaxaxa";

    System.out.println(stars(myString));
  }

  public static String stars(String s) {
    if (s.length() == 1) {
      return s;
    }
    else {

      return s.substring(0,1)+"*"+stars(s.substring(1));

    }
  }

}