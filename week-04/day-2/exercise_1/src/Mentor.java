/*Create a Mentor class that has the same fields and methods as the Personclass, and has the following additional
fields:
level: the level of the mentor (junior / intermediate / senior)
methods:
getGoal(): prints out "Educate brilliant junior software developers."
introduce(): "Hi, I'm name, a age year old gender level mentor."
The Mentor class has the following constructors:
Mentor(name, age, gender, level)
Mentor(): sets name to Jane Doe, age to 30, gender to female, level to intermediate */

public class Mentor extends Person {
  private String level;

  Mentor() {
    this.level = "intermediate";
  }

  Mentor(String name, int age, String gender, String level) {
    super(name, age, gender);
    this.level = "level";
  }

  public void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }

  public void introduce() {
    System.out.println("Hi, i'm " + this.getName() + ", a " + this.getAge() + " old " + this.getGender() + " " + this.getLevel() + " mentor.");
  }

  public String getLevel() {
    return level;
  }
}
