//Create SharpieSet class
//it contains a list of Sharpie
//countUsable() -> sharpie is usable if it has ink in it
//removeTrash() -> removes all unusable sharpies

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {

  private List<Sharpie> sharpieSetList;

  SharpieSet() {
    sharpieSetList = new ArrayList<>();
  }

  public static void main(String[] args) {
    SharpieSet mySet = new SharpieSet();

    Sharpie red = new Sharpie("red");
    Sharpie blue = new Sharpie("blue");
    Sharpie purple = new Sharpie("purple");

    mySet.addSharpie(red);
    mySet.addSharpie(blue);
    mySet.addSharpie(purple);

    mySet.getSharpieSetList().get(1).setInkAmount(0);

    mySet.printSharpies();
    mySet.countUseable();
    mySet.removeTrash();
    mySet.printSharpies();
  }

  public List<Sharpie> getSharpieSetList() {
    return sharpieSetList;
  }

  public void addSharpie(Sharpie sharpie) {
    this.getSharpieSetList().add(sharpie);
  }

  public void printSharpies() {
    System.out.println("We have in the set the following sharpies:");
    for (Sharpie sharpie : sharpieSetList) {
      System.out.println(sharpie.getColor() + " ");
    }
  }

  public void countUseable() {
    int useableSharpies = 0;
    for (Sharpie sharpie : sharpieSetList) {
      if (sharpie.getInkAmount() > 0) {
        useableSharpies++;
      }
    }
    System.out.println("The number of useable sharpies is: " + useableSharpies);
  }

  public void removeTrash() {
    for (int i = 0; i < this.getSharpieSetList().size(); i++) {
      if (this.getSharpieSetList().get(i).getInkAmount() <= 0) {
        this.getSharpieSetList().remove(i);
      }
    }
  }
}
