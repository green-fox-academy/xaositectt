package animals;

public class Reptile extends Animal {

  public Reptile(String name) {
    super.setName(name);
  }

  @Override
  public String breed() {
    return "egg";
  }
}
