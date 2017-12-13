import java.util.ArrayList;
import java.util.List;

public class Garden {
  private String gardenName;
  private List<Plant> plantList;

  public Garden(String gardenName) {
    plantList = new ArrayList<>();
    this.gardenName = gardenName;
  }

  public void addToList(Plant plant) {
    plantList.add(plant);
  }

  public void getinfo() {
    for (Plant plant : plantList) {
      System.out.println("Species is " + plant.getName() + " and the current water level is: " + plant.getCurrentWater());
    }
  }

  public Plant getPlant(int i) {
    return plantList.get(i);
  }

  public List<Plant> getPlantList() {
    return plantList;
  }

  public int thirstCounter() {
    int counter = 0;
    for (int i = 0; i < this.getPlantList().size(); i++) {
      if (this.getPlant(i).isThirsty(5)) {
        counter++;
      }
    }
    return counter;
  }

  public void waterPlants(int water) {
    int portion = water/thirstCounter();
    for (int i = 0; i < this.getPlantList().size(); i++) {
      if (this.getPlant(i).isThirsty(5)) {
        this.getPlant(i).water(portion);
      }
    }
  }
}
