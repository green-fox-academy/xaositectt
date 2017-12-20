//Create Sharpie class
//We should know about each sharpie their color (which should be a string), width (which will be a
// floating point number), inkAmount (another floating point number)
//When creating one, we need to specify the color and the width
//Every sharpie is created with a default 100 as inkAmount
//We can use() the sharpie objects
//which decreases inkAmount

public class Sharpie {
  String color;
  float width;
  float inkAmount;

  Sharpie() {
  }

  Sharpie(String color, float width) {
    this.color = color;
    this.width = width;
    inkAmount = 100;
  }

  public static void main(String[] args) {
    Sharpie mySharpie = new Sharpie("red", 100f);
    mySharpie.whatisit();
    mySharpie.use();
    mySharpie.whatisit();
  }

  public void use() {
    inkAmount--;
  }

  public void whatisit() {
    System.out.println("the color is: " + color);
    System.out.println("the width is: " + width);
    System.out.println("the ink amount is: " + inkAmount);
  }
}
