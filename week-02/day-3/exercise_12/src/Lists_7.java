import java.util.ArrayList;
import java.util.Arrays;

public class Lists_7 {

  public static void main(String[] args) {

    ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

    // Accidentally I messed up this quote from Richard Feynman.
    // Two words are out of place
    // Your task is to fix it by swapping the right words with code

    // Also, print the sentence to the output with spaces in between

    String quoteCannot = list.get(5);
    String quoteDo = list.get(2);

    list.set(2, quoteCannot);
    list.set(5, quoteDo);
    // First solution
    //list = list.toString();
    //list = list.replace(",", " ");
    //System.out.println(list);
    //second solution

    StringBuilder listString = new StringBuilder();
    for (String word : list) {
      listString.append(word + " ");
    }
    String sentence = listString.toString();
    System.out.println(sentence);
  }
}
