//Reuse your Animal class
//Create a Farm class
//it has list of Animals
//it has slots which defines the number of free places for animals
//breed() -> creates a new animal if there's place for it
//slaughter() -> removes the least hungry animal

import java.util.ArrayList;
import java.util.List;

public class Farm {
  private List<Animal> myFarm;
  private int maxNumber;

  public Farm(int maxNumber) {
    myFarm = new ArrayList<>();
    this.maxNumber = maxNumber;
  }

  public static void main(String[] args) {
    Animal parrot = new Animal("parrot");
    Animal bear = new Animal("bear");
    Animal beaver = new Animal("beaver");
    Animal otter = new Animal("otter");

    Farm myLittleFarm = new Farm(3);
    myLittleFarm.addToFarm(parrot);
    myLittleFarm.addToFarm(bear);
    myLittleFarm.addToFarm(beaver);
    myLittleFarm.addToFarm(otter);

    myLittleFarm.listAnimals();
  }

  public List<Animal> getMyFarm() {
    return myFarm;
  }

  public void addToFarm(Animal animal) {
    if (this.getMyFarm().size() < maxNumber) {
      this.getMyFarm().add(animal);
    } else {
      System.out.println("There is no more place left in this farm for animals.");
    }
  }

  public void listAnimals() {
    System.out.println("This farm has the following animals:");
    for (Animal animal : myFarm) {
      System.out.println(animal.getSpecies());
    }
  }
}
