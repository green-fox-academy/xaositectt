package music;

public class Violin extends StringedInstrument {

  public Violin() {
    super.name = "Violin";
    super.numberOfStrings = 4;
  }

  public Violin(int numberOfStrings) {
    super.numberOfStrings = numberOfStrings;
  }

  @Override
  public void play() {
    System.out
        .println("You play the " + this.name + " with " + this.numberOfStrings
            + " strings : Screech...");
  }
}
