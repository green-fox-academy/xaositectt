import java.util.ArrayList;
import java.util.Arrays;

public class Lists_2 {

  public static void main(String... args) {
    ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Bözsi", "Kat", "Jane"));
    ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Béla", "Todd", "Neef", "Jeff"));
    ArrayList<String> order = new ArrayList<String>();

    // Join the two lists by matching one girl with one boy in the order list
    // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

    for (int i = 0; i < girls.size(); i += 1) {

      order.add(i, girls.get(i));

    }

    for (int i = 0; i < boys.size() - 1; i += 1) {
      int k = (2 * i) + 1;
      order.add(k, boys.get(i));

    }

    //adding the last one

    order.add(boys.get(boys.size() - 1));

    String girl = girls.get(1);

    System.out.println(order);

    order.add(girls.get(1));

    System.out.println(girls.get(1));
  }
}
