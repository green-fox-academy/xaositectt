//The task is to create a garden application, so in your main method you should
//create a garden with flowers and trees. The program should demonstrate an example
//garden with two flowers (yellow and blue) and two trees (purple and orange). In the
//example after creating them you should show the user, how the garden looks like. After
//that the program should water the garden twice, first with the amount of 40 then with 70.
//And after every watering the user should see the state of the garden as you can see in the output.
//The output should look like this:
//
//The yellow Flower needs water
//The blue Flower needs water
//The purple Tree needs water
//The orange Tree needs water
//
//Watering with 40
//The yellow Flower doesnt need water
//The blue Flower doesnt need water
//The purple Tree needs water
//The orange Tree needs water
//
//Watering with 70
//The yellow Flower doesnt need water
//The blue Flower doesnt need water
//The purple Tree doesnt need water
//The orange Tree doesnt need water
//
//The Garden
//is able to hold unlimited amount of flowers or trees
//when watering it should only water those what needs water with equally divided amount amongst them
//eg. watering with 40 and 4 of them need water then each gets watered with 10
//

import java.util.ArrayList;
import java.util.List;

public class GardenApp {

  private String gardenName;
  private List<Plant> plantList;

  public GardenApp(String gardenName) {
    plantList = new ArrayList<>();
    this.gardenName = gardenName;
  }

  public static void main(String[] args) {
    Plant daisy = new Flower("daisy", "yellow");
    Plant lily = new Flower("lily", "blue");
    Plant tulip = new Flower("tulip", "red");
    Plant pine = new Tree("pine", "purple");
    Plant oak = new Tree("oak", "orange");
    Plant cedar = new Tree("cedar", "beige");

    GardenApp Paradise = new GardenApp("Paradise");
    Paradise.addPlant(daisy);
    Paradise.addPlant(lily);
    Paradise.addPlant(pine);
    Paradise.addPlant(oak);
    Paradise.addPlant(tulip);
    Paradise.addPlant(cedar);

    Paradise.getinfo();

    System.out.println("The number of required waterings: " + waterCount(40, Paradise.getPlantList()));

    waterPlants(40, Paradise.getPlantList());

    Paradise.getinfo();
  }

  public static int waterCount(int water, List<Plant> plantList) {
    int count1 = 0;
    int count2 = 0;
    for (Plant plant : plantList) {
      if (plant.getCurrentWater() <= 5 && plant instanceof Flower) {
        count1++;
      }
      if (plant.getCurrentWater() <= 10 && plant instanceof Tree) {
        count2++;
      }
    }
    return count1 + count2;
  }

  public static void waterPlants(int water, List<Plant> plantList) {
    int portion = water / waterCount(water, plantList);
    System.out.println("number of waterings is: " + waterCount(water, plantList));
    System.out.println("water portion per plant is: " + portion);
    for (Plant plant : plantList) {
      if (plant instanceof Flower && plant.getCurrentWater() <= 5) {
        //System.out.println(plant.getName()+ " needs watering and the amount is: " + portion + "*0.75");
        plant.water((int) (0.75 * portion));
      }
      if (plant instanceof Tree && plant.getCurrentWater() <= 10) {
        //System.out.println(plant.getName()+ " needs watering and the amount is: " + portion + "*0.5");
        plant.water((int) (0.5 * portion));
      }
    }
  }

  public void addToList(Plant plant) {
    plantList.add(plant);
  }

  public void addPlant(Plant plant) {
    plantList.add(plant);
  }

  public Plant getPlant(int i) {
    return plantList.get(i);
  }

  public List<Plant> getPlantList() {
    return plantList;
  }

  public void getinfo() {
    for (Plant plant : plantList) {
      System.out.println("Species is " + plant.getName() + " and the current water level is: " + plant.getCurrentWater());
    }
  }
}
