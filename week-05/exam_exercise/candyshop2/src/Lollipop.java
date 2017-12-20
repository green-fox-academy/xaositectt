public class Lollipop extends Sweets {
  public static double lollipopPrice = 10;
  public static double sugarCost = 5;

  public Lollipop(double price, double sugarCost) {
    super (price, sugarCost);
  }

  public static double getLollipopPrice() {
    return lollipopPrice;
  }

  public static void setLollipopPrice(double lollipopPrice) {
    Lollipop.lollipopPrice = lollipopPrice;
  }

  public static double getSugarCost() {
    return sugarCost;
  }

  public static void setSugarCost(int sugarCost) {
    Lollipop.sugarCost = sugarCost;
  }
}
