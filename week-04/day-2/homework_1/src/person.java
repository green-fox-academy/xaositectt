/*Create a Person class with the following fields:

name: the name of the person
age: the age of the person (whole number)
gender: the gender of the person (male / female)
And the following methods:

introduce(): prints out "Hi, I'm name, a age year old gender."
getGoal(): prints out "My goal is: Live for the moment!"
And the following constructors:

Person(name, age, gender)
Person(): sets name to Jane Doe, age to 30, gender to female*/

public class person {
  private String name;
  private int age;
  private String gender;

  person() {
    this ("Jane Doe", 30, "female");
  }

  person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender=gender;
  }

  void introduce () {
    System.out.println("Hi, I'm "+ name + ", my age is "+age + " and I am "+gender);
  }

  void getGoal () {
    System.out.println("my goal is to live for the moment!");
  }
}
