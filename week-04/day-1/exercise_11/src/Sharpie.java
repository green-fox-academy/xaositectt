public class Sharpie {
  String color;
  float width;
  float inkAmount;

  Sharpie () {

  }

  Sharpie (String color, float width) {
    this.color = color;
    this.width = width;
    inkAmount=100;
  }

  public void use(){
    inkAmount--;
  }

  public void whatisit(){
    System.out.println("the color is: "+color);
    System.out.println("the width is: " + width);
    System.out.println("the ink amount is: "+inkAmount);
  }

  public static void main(String[] args) {
    Sharpie mySharpie = new Sharpie("red", 100f);
    mySharpie.whatisit();
    mySharpie.use();
    mySharpie.whatisit();
  }
}
