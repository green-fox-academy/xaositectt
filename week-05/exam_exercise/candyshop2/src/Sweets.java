public class Sweets {

  private double price;
  private double sugarCost;

  public Sweets(double price, double sugarCost) {
    this.price = price;
    this.sugarCost = sugarCost;
  }

  //public static void setPricePercentage(double pricePercentage) {
  //  Sweets.pricePercentage = pricePercentage;
  //}

  public static void setPricePercentage(double pricePercentage) {
    Lollipop.setLollipopPrice((100+pricePercentage)/100*Lollipop.getLollipopPrice());
    Candy.setCandyPrice((100+pricePercentage)/100*Candy.getCandyPrice());
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }
}
