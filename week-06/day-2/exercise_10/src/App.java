//Create a Fox class with 3 properties(name, type, color) Fill a list with at least 5 foxes,
//it's up to you how you name/create them! Write a Stream Expression to find the foxes with green
//color! Write a Stream Expression to find the foxes with green color and pallida type!

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {

  public static void main(String[] args) {
    Fox trotski = new Fox("trotski", "red", "red");
    Fox kadar = new Fox("kadar", "arctic", "white");
    Fox sanders = new Fox("sanders", "fennec", "yellow");
    Fox marx = new Fox("marx", "yellow", "red");
    Fox engels = new Fox("engels", "arctic", "white");

    List<Fox> foxes = new ArrayList<>();
    foxes.add(trotski);
    foxes.add(kadar);
    foxes.add(sanders);
    foxes.add(marx);
    foxes.add(engels);

    List<Fox> selectedList = foxes.stream()
        .filter(p -> p.getColor().equals("red"))
        .filter(q -> q.getType().equals("yellow"))
        .collect(Collectors.toList());

    System.out.println(selectedList);
    System.out.println(selectFoxes(foxes));
  }

  public static List<Fox> selectFoxes(List<Fox> inputList) {
    List<Fox> selectFoxes = new ArrayList<>();
    for (Fox fox : inputList) {
      if (fox.getType().equals("red") && fox.getColor().equals("yellow")) {
        selectFoxes.add(fox);
      }
    }
    return selectFoxes;
  }
}
