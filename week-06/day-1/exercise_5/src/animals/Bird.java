package animals;

public class Bird extends Animal {

  public Bird(String name) {
    super.setName(name);
  }

  @Override
  public String breed() {
    return "egg";
  }
}
