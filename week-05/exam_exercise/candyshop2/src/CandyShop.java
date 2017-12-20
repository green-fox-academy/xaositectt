import java.util.ArrayList;
import java.util.List;

public class CandyShop {
  public static final int CANDY = 0;
  public static final int LOLLIPOP = 1;
  public static double sugarPricePerGram = 0.1;
  List<Sweets> sweetsInventory;
  private double sugarInventory;
  private double money;


  public CandyShop(int sugarAmount) {
    this.sugarInventory = sugarAmount;
    sweetsInventory = new ArrayList<>();
  }

  @Override
  public String toString() {
    //"Inventory: 3 candies, 2 lollipops, Income: 100, Sugar: 400gr"
    return "Inventory: " + countCandies() + " candies, " + countLollipops() + " lollipops, Income: " +
            money + "$ , Sugar: " + sugarInventory + "gr;";
  }


  public void createSweets(int typeOfSweets) {
    if (typeOfSweets == 0) {
      Sweets newCandy = new Candy(Candy.candyPrice * Sweets.pricePercentage / 100, Candy.sugarCost);
      sugarInventory = sugarInventory - Candy.sugarCost;
      sweetsInventory.add(newCandy);
    } else if (typeOfSweets == 1) {
      Sweets newLollipop = new Lollipop(Lollipop.lollipopPrice * Sweets.pricePercentage / 100, Lollipop.sugarCost);
      sweetsInventory.add(newLollipop);
      sugarInventory = sugarInventory - Lollipop.sugarCost;
    } else {
      System.out.println("Not a valid type of sweets.");
    }
  }

  public void sell(int typeOfSweets, int amount) {
    if (typeOfSweets == 0) {
      remove(amount, Candy.class);
      this.setMoney(money + (Candy.candyPrice * Sweets.pricePercentage / 100));
    } else if (typeOfSweets == 1) {
      remove(amount, Lollipop.class);
      this.setMoney(money + (Lollipop.lollipopPrice * Sweets.pricePercentage / 100));
    } else {
      System.out.println("Not a valid type.");
    }
  }

  public void buySugar(int amountGrams) {
    sugarInventory = sugarInventory + amountGrams;
    money = money - amountGrams*sugarPricePerGram;
  }

  public void raise(double raiseAmount) {
    Sweets.setPricePercentage(Sweets.pricePercentage + raiseAmount);
  }

  public void remove(int amount, Class<?> cls) {
    int i = 0;
    for (int j = 0; j < sweetsInventory.size(); j++) {
      if (cls.isInstance(sweetsInventory.get(j))) {
        sweetsInventory.remove(j);
        i++;
        if (i == amount) {
          break;
        }
      }
    }
  }

  public int countCandies() {
    int candyNum = 0;
    for (Sweets sweets : sweetsInventory) {
      if (sweets instanceof Candy) {
        candyNum++;
      }
    }
    return candyNum;
  }

  public int countLollipops() {
    int lolliNum = 0;
    for (Sweets sweets : sweetsInventory) {
      if (sweets instanceof Lollipop) {
        lolliNum++;
      }
    }
    return lolliNum;
  }

  public double getMoney() {
    return money;
  }

  public void setMoney(double money) {
    this.money = money;
  }
}
