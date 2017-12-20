public class Candy extends Sweets{
  public static double candyPrice = 20;
  public static double sugarCost = 10;

  public Candy(double price, double sugarCost) {
    super (price, sugarCost);
  }

  public static double getCandyPrice() {
    return candyPrice;
  }

  public static void setCandyPrice(double candyPrice) {
    Candy.candyPrice = candyPrice;
  }

  public static double getSugarCost() {
    return sugarCost;
  }

  public static void setSugarCost(int sugarCost) {
    Candy.sugarCost = sugarCost;
  }
}
