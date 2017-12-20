/*Create a Student class that has the same fields and methods as the
Person class, and has the following additional
fields:
previousOrganization: the name of the student’s previous company / school
skippedDays: the number of days skipped from the course
methods:
getGoal(): prints out "Be a junior software developer."
introduce(): "Hi, I'm name, a age year old gender from previousOrganization who
skipped skippedDays days from the course already."
skipDays(numberOfDays): increases skippedDays by numberOfDays
The Student class has the following constructors:
Student(name, age, gender, previousOrganization): beside the
given parameters, it sets skippedDays to 0
Student(): sets name to Jane Doe, age to 30, gender to female,
previousOrganization to The School of Life, skippedDays to 0
*/

public class Student extends Person {
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

  public void getGoal() {
    System.out.println("My goal: Be a junior software developer.");
  }

  public void introduce(Person person) {
    System.out.println("Hi, i'm " + this.getName() + " from " + this.getPreviousOrganization() + " who skipped " + this.getSkippedDays() + " from the course already");
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
