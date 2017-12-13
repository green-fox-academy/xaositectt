/*Create a Sponsor class that has the same fields and methods as the Personclass, and has the following additional
fields:
company: name of the company
hiredStudents: number of students hired
method:
introduce(): "Hi, I'm name, a age year old gender who represents company and hired hiredStudents students so far."
hire(): increase hiredStudents by 1
getGoal(): prints out "Hire brilliant junior software developers."
The Sponsor class has the following constructors:
Sponsor(name, age, gender, company): beside the given parameters, it sets hiredStudents to 0
Sponsor(): sets name to Jane Doe, age to 30, gender to female, company to Google and hiredStudents to 0*/

public class Sponsor extends Person {
  private String company;
  private int hiredStudents;

  Sponsor() {
    company="Google";
    hiredStudents=0;
  }

  Sponsor(String name, int age, String gender, String company) {
    super(name, age, gender);
    this.company=company;
    this.hiredStudents=0;
  }

  public void introduce() {
    System.out.println("Hi, I'm " + this.getName() + ", a " + this.getAge() + " year old " + this.getGender()+" who represents " +
            this.getCompany()+ " and hired " + this.getHiredStudents() + " students so far.");
  }

  public void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }

  public void hire() {
    hiredStudents=hiredStudents+1;
  }

  public String getCompany() {
    return company;
  }

  public int getHiredStudents() {
    return hiredStudents;
  }
}