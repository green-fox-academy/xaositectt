import java.util.HashMap;
import java.util.Map;

public class trees1 {
  public static void main(String[] args) {
    Map<String, String> tree1 = new HashMap<String, String>();
    tree1.put("type", "pine");
    tree1.put("sex", "male");
    tree1.put("age", "25");
    tree1.put("leaf color", "red");

    Map<String, String> tree2 = new HashMap<String, String>();
    tree2.put("type", "oak");
    tree2.put("sex", "male");
    tree2.put("age", "22");
    tree2.put("leaf color", "blue");

    Map<String, String> tree3 = new HashMap<String, String>();
    tree3.put("type", "cedar");
    tree3.put("sex", "male");
    tree3.put("age", "34");
    tree3.put("leaf color", "brown");

    Map<String, String> tree4 = new HashMap<String, String>();
    tree4.put("type", "weeping willow");
    tree4.put("sex", "female");
    tree4.put("age", "20");
    tree4.put("leaf color", "yellow");

    Map<String, String> tree5 = new HashMap<String, String>();
    tree5.put("type", "hickory");
    tree5.put("sex", "female");
    tree5.put("age", "29");
    tree5.put("leaf color", "beige");
  }
}
