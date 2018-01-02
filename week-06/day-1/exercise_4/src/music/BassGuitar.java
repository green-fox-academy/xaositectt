package music;

public class BassGuitar extends StringedInstrument {

  public BassGuitar() {
    super.name = "Bass Guitar";
    super.numberOfStrings = 4;
  }

  public BassGuitar(int numberOfStrings) {
    super.numberOfStrings = numberOfStrings;
  }

  @Override
  public void play() {
    System.out.println(
        "You play the " + this.name + " with " + this.numberOfStrings
            + " strings : Duum-duum-duum...");
  }
}
