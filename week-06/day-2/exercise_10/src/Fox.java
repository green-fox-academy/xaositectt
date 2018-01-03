//Create a Fox class with 3 properties(name, type, color) Fill a list with at least 5 foxes,
//it's up to you how you name/create them! Write a Stream Expression to find the foxes with green
//color! Write a Stream Expression to find the foxes with green color and pallida type!

public class Fox {
  private String name;
  private String type;
  private String color;

  public Fox(String name, String type, String color) {
    this.name = name;
    this.type = type;
    this.color = color;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}
