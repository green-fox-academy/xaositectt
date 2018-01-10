public class Anagram {

  public static boolean isAnagram(String inputString1, String inputString2) {
    if (inputString1.charAt(inputString1.length()-1) == 'a' &&
        inputString1.charAt(inputString1.length()-1) != inputString2.charAt(0)||
        inputString1.length() != inputString2.length()) {
      return false;
    }
    return true;
  }
}
