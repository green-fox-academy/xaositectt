//Create a Fox class with 3 properties(name, type, color) Fill a list with at least 5 foxes,
//it's up to you how you name/create them! Write a Stream Expression to find the foxes with green
//color! Write a Stream Expression to find the foxes with green color and pallida type!

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {

  public static void main(String[] args) {
    Fox dög = new Fox("dög", "vörös", "vörös");
    Fox bestia = new Fox("bestia", "sarki", "fehér");
    Fox cafat = new Fox("cafat", "sivatagi", "sárga");
    Fox marx = new Fox("marx", "sárga", "vörös");
    Fox engels = new Fox("engels", "sarki", "fehér");

    List<Fox> rókák = new ArrayList<>();
    rókák.add(dög);
    rókák.add(bestia);
    rókák.add(cafat);
    rókák.add(marx);
    rókák.add(engels);

    List<Fox> selectedList = rókák.stream()
        .filter(p -> p.getColor().equals("vörös"))
        .filter(q -> q.getType().equals("sárga"))
        .collect(Collectors.toList());

    System.out.println(selectedList);
    System.out.println(selectFoxes(rókák));
  }

  public static List<Fox> selectFoxes(List<Fox> inputList) {
    List<Fox> selectFoxes = new ArrayList<>();
    for (Fox fox : inputList) {
      if (fox.getType().equals("sárga") && fox.getColor().equals("vörös")) {
        selectFoxes.add(fox);
      }
    }
    return selectFoxes;
  }
}
