import java.util.HashMap;
import java.util.Map;

public class Map_1 {

  public static void main(String[] args) {
    String out = "";
    int[] notSoCrypticMessage = {1, 12, 1, 2, 11, 1, 7, 11, 1, 49, 1, 3, 11, 1, 50, 11};

    Map<Integer, String> map = new HashMap<Integer, String>();

    map.put(7, "run around and desert you");
    map.put(50, "tell a lie and hurt you");
    map.put(49, "make you cry,");
    map.put(2, "let you down");
    map.put(12, "give you up,");
    map.put(1, "Never gonna");
    map.put(11, "\n");
    map.put(3, "say goodbye");

    // Things are a little bit messed up
    // Your job is to decode the notSoCrypticMessage by using the hashmap as a look up table
    // Assemble the fragments into the out variable

    String var = map.get(3);
    //System.out.println("Value at index 2 is: "+var);
    //System.out.println(notSoCrypticMessage[1]);
    for (int i = 0; i < notSoCrypticMessage.length; i++) {
      String code = map.get(notSoCrypticMessage[i]);
      System.out.println(code);
    }
    System.out.println(out);
  }
}
