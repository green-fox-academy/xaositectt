/*The Flower
needs water if its current water amount is less then 5
when watering it the flower can only absorb the 75% of the water
eg. watering with 10 the flower's amount of water should only increase with 7.5*/

public class Flower extends Plant {

  public Flower(){

  }

  public Flower (String name, String color) {
    super(name, color);
  }

  public void water(int water) {
    super.water((int)(water*0.75));
  }

  public boolean isThirsty(int water) {
    return super.isThirsty(water);
  }
}

