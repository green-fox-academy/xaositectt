public class Sharpie {
  String color;
  ;
  int inkAmount;

  Sharpie() {
  }

  Sharpie(String color) {
    this.color = color;
    inkAmount = 100;
  }

  public void use() {
    System.out.println("You write something.");
    inkAmount--;
  }

  public void info() {
    System.out.println("the color is: " + color);
    System.out.println("the ink amount is: " + inkAmount);
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }


  public float getInkAmount() {
    return inkAmount;
  }

  public void setInkAmount(int inkAmount) {
    this.inkAmount = inkAmount;
  }
}
