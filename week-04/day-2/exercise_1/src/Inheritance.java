import java.util.ArrayList;

public class Inheritance {
  public static void main(String[] args) {

    ArrayList<Person> people = new ArrayList<>();

    Person mark = new Person("Mark", 46, "male");
    people.add(mark);
    Person jane = new Person();
    people.add(jane);
    Student john = new Student("John Doe", 20, "male", "BME");
    people.add(john);
    Student student = new Student();
    people.add(student);
    Mentor gandhi = new Mentor("Gandhi", 148, "male", "senior");
    people.add(gandhi);
    Mentor mentor = new Mentor();
    people.add(mentor);
    Sponsor sponsor = new Sponsor();
    people.add(sponsor);
    Sponsor elon = new Sponsor("Elon Musk", 46, "male", "SpaceX");
    people.add(elon);

    student.skipDays(3);

    for (int i = 0; i < 3; i++) {
      elon.hire();
    }
    for (int i = 0; i < 5; i++) {
      sponsor.hire();
    }

    for (Person person : people) {
      person.introduce();
      person.getGoal();
    }

    PallidaClass badass = new PallidaClass("BADA55");
    badass.addStudent(student);
    badass.addStudent(john);
    badass.addMentor(mentor);
    badass.addMentor(gandhi);
    badass.info();
  }
}

//Hi, I'm Mark, a 46 year old male.
//My goal is: Live for the moment.
//Hi, I'm Jane Doe, a 30 year old female.
//My goal is: Live for the moment.
//Hi, I'm John Doe, a 20 year old male from BME who skipped 0 days from the course already.
//My goal is: Be a junior software developer.
//Hi, I'm Jane Doe, a 30 year old female from The School of Life who skipped 3 days from the course already.
//My goal is: Be a junior software developer.
//Hi, I'm Gandhi, a 148 year old male senior mentor.
//My goal is: Educate brilliant junior software developers.
//Hi, I'm Jane Doe, a 30 year old female intermediate mentor.
//My goal is: Educate brilliant junior software developers.
//Hi, I'm Jane Doe, a 30 year old female who represents Google and hired 5 students so far.
//My goal is: Hire brilliant junior software developers.
//Hi, I'm Elon Musk, a 46 year old male who represents SpaceX and hired 3 students so far.
//My goal is: Hire brilliant junior software developers.
//Lagopus BADA55 class has 2 students and 2 mentors.