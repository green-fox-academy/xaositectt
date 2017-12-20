public class Sweets {
  public static double pricePercentage = 100;
  private double price;
  private double sugarCost;

  public Sweets(double price, double sugarCost) {
    this.price = (price * pricePercentage) / 100;
    this.sugarCost = sugarCost;
  }

  public static double getPricePercentage() {
    return pricePercentage;
  }

  //public static void setPricePercentage(double pricePercentage) {
  //  Sweets.pricePercentage = pricePercentage;
  //}

  public static void setPricePercentage(double pricePercentage) {
    Lollipop.setLollipopPrice(pricePercentage*Lollipop.getLollipopPrice());
    Candy.setCandyPrice(pricePercentage*Candy.getCandyPrice());
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }
}
