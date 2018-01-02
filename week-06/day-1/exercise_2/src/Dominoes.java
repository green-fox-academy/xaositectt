import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Dominoes {

  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    // You have the list of Dominoes
    // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
    // eg: [2, 4], [4, 3], [3, 5] ...
    List<Domino> myDominoList = orderDominoes(initializeDominoes());
    System.out.println(myDominoList);

    Collections.sort(dominoes);
    System.out.println(dominoes);

  }

  public static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>(
        Arrays.asList(new Domino(5, 2), new Domino(4, 6), new Domino(1, 5),
            new Domino(6, 7), new Domino(2, 4), new Domino(7, 1)));
    return dominoes;
  }

  public static List<Domino> orderDominoes(List<Domino> dominoList) {
    List<Domino> dominoesOrdered = new ArrayList<>();
    dominoesOrdered.add(dominoList.get(0));
    dominoList.remove(0);
    int size = dominoList.size();
    for (int j = 0; j < size; j++) {
      for (int i = 0; i < dominoList.size(); i++) {
        if (dominoList.get(i).firstDominoNum == dominoesOrdered
            .get(dominoesOrdered.size() - 1).secondDominoNum) {
          dominoesOrdered.add(dominoList.get(i));
          dominoList.remove(i);
        }
      }
    }
    return dominoesOrdered;
  }
}
