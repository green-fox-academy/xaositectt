package music;

public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar() {
    super.name = "Electric Guitar";
    super.numberOfStrings = 6;
  }

  public ElectricGuitar(int numberOfStrings) {
    super.numberOfStrings = numberOfStrings;
  }

  @Override
  public void play() {
    System.out.println(
        "You play the " + this.name + " with " + this.numberOfStrings + " strings : Twang...");
  }
}
