import com.sun.java.browser.plugin2.DOM;

import java.util.ArrayList;
import java.util.List;

public class Domino {
  int firstDominoNum;
  int secondDominoNum;
  List<Integer> Domino =new ArrayList<>();

  Domino(int firstDomino, int secondDomino){
    this.firstDominoNum =firstDomino;
    this.secondDominoNum =secondDomino;
    Domino.add(firstDomino);
    Domino.add(secondDomino);
    //System.out.println(Domino);
  }

  public int Domino1stnum (){
    return Domino.get(0);
  }
  public int Domino2ndnum (){
    return Domino.get(1);
  }

  @Override
  public String toString() {
    return firstDominoNum +
            " : " + secondDominoNum ;
  }
}
