package animals;

public class Mammal extends Animal {

  public Mammal(String name) {
    super.setName(name);
  }

  @Override
  public String breed() {
    return "birth";
  }
}
