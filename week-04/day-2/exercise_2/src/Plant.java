public class Plant {

  private int currentWater;
  private String color;

  public Plant () {
    currentWater= (int) (Math.random() * 20);
    color="green";
  }

  public Plant (String color) {
    this.color= color;
  }

}
