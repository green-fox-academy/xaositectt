import java.util.ArrayList;
import java.util.List;

public class Domino implements Comparable {

  int firstDominoNum;
  int secondDominoNum;
  List<Integer> Domino = new ArrayList<>();

  Domino(int firstDomino, int secondDomino) {
    this.firstDominoNum = firstDomino;
    this.secondDominoNum = secondDomino;
    Domino.add(firstDomino);
    Domino.add(secondDomino);
    //System.out.println(Domino);
  }

  public int Domino1stnum() {
    return Domino.get(0);
  }

  public int Domino2ndnum() {
    return Domino.get(1);
  }

  @Override
  public String toString() {
    return firstDominoNum + " : " + secondDominoNum;
  }

  @Override
  public int compareTo(Object o) {
    int compareNum = ((Domino) o).firstDominoNum;
    return this.firstDominoNum - compareNum;
  }
}
