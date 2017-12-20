// Create a CandyShop class
// It can store sugar and money as income. The constructor should take the amount of sugar in gramms.
// we can create lollipops and candies store them in the CandyShop's storage
// If we create a candie or lollipop the CandyShop's sugar amount gets reduced by the amount needed to create the sweets
// We can raise the prices of all candies and lollipops with a given percentage
// We can sell candie or lollipop with a given number as amount
// If we sell sweets the income will be increased by the price of the sweets and we delete it from the inventory
// We can buy sugar with a given number as amount. The price of 1000gr sugar is 100$
// If we buy sugar we can raise the CandyShop's amount of sugar and reduce the income by the price of it.
// The CandyShop should be represented as string in this format:
// "Inventory: 3 candies, 2 lollipops, Income: 100, Sugar: 400gr"

import java.util.ArrayList;
import java.util.List;

public class CandyShop {
  public static final int CANDY = 0;
  public static final int LOLLIPOP = 1;
  private List<Treat> treatInventory;
  private int sugarInventory;
  private int moneyAccount;
  private int candyPrice = 20;
  private int candySugarCost = 10;
  private int lollipopPrice = 10;
  private int lollipopSugarCost = 5;

  public CandyShop(int sugarAmount) {
    treatInventory = new ArrayList<>();
    this.moneyAccount = 0;
    this.sugarInventory = sugarAmount;
    this.candyPrice = 20;
    this.lollipopPrice = 10;
  }

  @Override
  public String toString() {
    String stringRepresentation = "Inventory: " +this.getSugarInventory()+ " candies, " + " lollipops, " + "Income: " + "Sugar";
    return stringRepresentation;
  }

  public void raise(int percentage) {
    if (percentage >= -100) {
      setCandyPrice(candyPrice * (1 + percentage / 100));
      setLollipopPrice(lollipopPrice * (1 + percentage / 100));
    } else {
      System.out.println("Not a valid raise value.");
    }
  }

  public void createSweets(int treatType) {
    if (treatType == 0) {
      this.getTreatInventory().add(new Candy(candySugarCost));
      this.setSugarInventory(sugarInventory-candySugarCost);
    } else if (treatType == 1) {
      this.getTreatInventory().add(new Lollipop(lollipopSugarCost));
      this.setSugarInventory(sugarInventory-lollipopSugarCost);
    } else {
      System.out.println("Not a valid type of candy.");
    }
  }

  public int countCandies() {
    int candyNum = 0;
    for (Treat treat : treatInventory) {
      if (treat instanceof Candy) {
        candyNum++;
      }
    }
    return candyNum;
  }

  public int countLollipops() {
    int lolliNum = 0;
    for (Treat treat : treatInventory) {
      if (treat instanceof Lollipop) {
        lolliNum++;
      }
    }
    return lolliNum;
  }

  public void sell(int treatType, int treatAmount) {
    if (treatType == 0 && treatAmount <= countCandies() && 0 <= treatAmount) {
      remove(treatAmount, Candy.class);
      this.setMoneyAccount(moneyAccount + treatAmount * candyPrice);
    } else if (treatType == 0 && treatAmount > countCandies()) {
      System.out.println("Not enough candies in the shop.");
    } else if (treatType == 1 && treatAmount <= countLollipops() && 0 <= treatAmount) {
      remove(treatAmount, Lollipop.class);
      this.setMoneyAccount(moneyAccount + treatAmount * lollipopPrice);
    } else if (treatType == 1 && treatAmount > countCandies()) {
      System.out.println("Not enough lollipops in the shop.");
    } else if (treatAmount < 0) {
      System.out.println("Treat amount can't be negative.");
    }
  }

  public void remove(int amount, Class<?> cls) {
    int i = 0;
    while (i < amount) {
      for (int j = 0; j < this.getTreatInventory().size(); j++) {
        if (cls.isInstance(this.getTreatInventory().get(j))) {
          this.getTreatInventory().remove(j);
          i++;
        }
      }
    }
  }

  public int getMoneyAccount() {
    return moneyAccount;
  }

  public void setMoneyAccount(int moneyAccount) {
    this.moneyAccount = moneyAccount;
  }

  public List<Treat> getTreatInventory() {
    return treatInventory;
  }

  public int getCandyPrice() {
    return candyPrice;
  }

  public void setCandyPrice(int candyPrice) {
    this.candyPrice = candyPrice;
  }

  public int getLollipopPrice() {
    return lollipopPrice;
  }

  public void setLollipopPrice(int lollipopPrice) {
    this.lollipopPrice = lollipopPrice;
  }

  public int getSugarInventory() {
    return sugarInventory;
  }

  public void setSugarInventory(int sugarInventory) {
    this.sugarInventory = sugarInventory;
  }
}
