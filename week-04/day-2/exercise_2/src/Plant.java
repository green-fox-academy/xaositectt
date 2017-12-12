public class Plant {

  private int currentWater;
  private String color;
  private String name;

  public Plant () {
    this.currentWater= (int) (Math.random() * 10);
    this.color="green";
  }

  public Plant (String name, String color) {
    this.currentWater= (int) (Math.random() * 10);
    this.name=name;
    this.color= color;
  }

  public void water(int water) {
    this.currentWater=currentWater+water;
  }


  public int getCurrentWater() {
    return currentWater;
  }

  public String getColor() {
    return color;
  }

  public String getName() {
    return name;
  }

}
