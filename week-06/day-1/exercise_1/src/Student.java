//Make the Student implement the Cloneable interface
//Implement the method, so it clones the student

public class Student extends Person implements Cloneable {

  private String previousOrganization;
  private int skippedDays;

  Student() {
    this.previousOrganization = "The School of Life";
    this.skippedDays = 0;
  }

  Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
  }

  @Override
  public Student clone() throws CloneNotSupportedException {
    return (Student) super.clone();
  }


  public void getGoal() {
    System.out.println("My goal: Be a junior software developer.");
  }

  public void introduce(Person person) {
    System.out.println(
        "Hi, i'm " + this.getName() + " from " + this.getPreviousOrganization() + " who skipped "
            + this.getSkippedDays() + " from the course already");
  }

  public void skipDays(int numberOfDays) {
    skippedDays = skippedDays + numberOfDays;
  }

  public String getPreviousOrganization() {
    return previousOrganization;
  }

  public int getSkippedDays() {
    return skippedDays;
  }
}
