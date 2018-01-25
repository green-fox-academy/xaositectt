public class HungarianTester {

  public static void main(String[] args) {
    System.out.println(translateFunny("Ez egy példamondat. Remélem célbatalál.", "f"));
  }

  public static String translateFunny(String inputString, String syllableFirstConsonant) {

    String[] syllables = splitIntoSyllables(inputString);

    String stringWithExtraSyllables = addExtraSyllables(syllables, syllableFirstConsonant);

    return capitalizeFirstLetter(stringWithExtraSyllables);
  }

  public static String addExtraSyllables(String[] syllables, String syllableFirstConsonant) {
    String stringWithExtraSyllables = "";
    for (int i = 0; i < syllables.length; i++) {
      stringWithExtraSyllables = stringWithExtraSyllables + syllables[i];
      char syllableEndChar = syllables[i].charAt(syllables[i].length() - 1);
      if (syllableEndChar == 'a' || syllableEndChar == 'ú') {
        stringWithExtraSyllables = stringWithExtraSyllables + syllableFirstConsonant+"a";
      } else if (syllableEndChar == 'á') {
        stringWithExtraSyllables = stringWithExtraSyllables + syllableFirstConsonant+"á";
      } else if (syllableEndChar == 'o') {
        stringWithExtraSyllables = stringWithExtraSyllables + syllableFirstConsonant+"o";
      } else if (syllableEndChar == 'ó') {
        stringWithExtraSyllables = stringWithExtraSyllables + syllableFirstConsonant+"ó";
      } else if (syllableEndChar == 'u') {
        stringWithExtraSyllables = stringWithExtraSyllables + syllableFirstConsonant+"u";
      } else if ( syllableEndChar == 'ú' ) {
        stringWithExtraSyllables = stringWithExtraSyllables + syllableFirstConsonant+"ú";
      } else if ( syllableEndChar == 'e' ) {
        stringWithExtraSyllables = stringWithExtraSyllables + syllableFirstConsonant+"e";
      } else if ( syllableEndChar == 'é' ) {
        stringWithExtraSyllables = stringWithExtraSyllables + syllableFirstConsonant+"é";
      } else if ( syllableEndChar == 'i' ) {
        stringWithExtraSyllables = stringWithExtraSyllables + syllableFirstConsonant+"i";
      } else if ( syllableEndChar == 'ü' ) {
        stringWithExtraSyllables = stringWithExtraSyllables + syllableFirstConsonant+"ü";
      } else if ( syllableEndChar == 'ű' ) {
        stringWithExtraSyllables = stringWithExtraSyllables + syllableFirstConsonant+"ű";
      }
    }
    return stringWithExtraSyllables;
  }

  public static String capitalizeFirstLetter(String inputString) {
    String capitalism = "";
    capitalism = inputString.substring(0,1).toUpperCase() + inputString.substring(1);
    return capitalism;
  }

  public static String[] splitIntoSyllables(String inputString) {
    String[] syllables = inputString.toLowerCase().split("(?<=[aáeéiíoóöőuúüű])");
    return syllables;
  }
}
