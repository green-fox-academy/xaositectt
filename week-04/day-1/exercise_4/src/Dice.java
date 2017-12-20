import java.util.Arrays;

public class Dice {
//    You have a Dice class which has 6 dice
//    You can roll all of them with roll()
//    Check the current rolled numbers with getCurrent()
//    You can reroll with reroll()
//    Your task is to get where all dice is a 6
  int[] dices = new int[6];

  public static void main(String[] args) {

    Dice myDice = new Dice();
    myDice.roll();
    System.out.println(Arrays.toString(myDice.getCurrent()));

    int rollcount = 0;

    for (int i = 0; i < myDice.getCurrent().length; i++) {
      if (myDice.getCurrent(i) != 6) {
        int j = 0;
        int k = 10;
        while (j < k) {
          myDice.reroll(i);
          rollcount = rollcount + 1;
          if (myDice.getCurrent(i) == 6) {
            j = 11;
          }
        }
      }
    }

    System.out.println(Arrays.toString(myDice.getCurrent()));
    System.out.println("My rollcount is " + rollcount);

    //for (int =0; i< myDice.get; )
/*
    myDice.getCurrent();
    myDice.roll();
    myDice.getCurrent();
    myDice.getCurrent(5);
    myDice.reroll();
    myDice.getCurrent();
    myDice.reroll(4);
    myDice.getCurrent();
    */
  }

  public int[] Dice() {
    return dices;
  }

  public int[] roll() {
    for (int i = 0; i < dices.length; i++) {
      dices[i] = (int) (Math.random() * 6) + 1;
    }
    return dices;
  }

  public int[] getCurrent() {
    return dices;
  }

  public int getCurrent(int i) {
    return dices[i];
  }

  public void reroll(int k) {
    dices[k] = (int) (Math.random() * 6) + 1;
  }
}
