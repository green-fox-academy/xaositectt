/*Create a PallidaClass class that has the following
fields:
className: the name of the class
students: a list of Students
mentors: a list of Mentors
methods:
addStudent(Student): adds the given Student to students list
addMentor(Mentor): adds the given Mentor to mentors list
info(): prints out "Pallida className class has students.size students and mentors.size mentors."
The PallidaClass class has the following constructors:
PallidaClass(className): beside the given parameter, it sets students and mentors as empty lists*/

import java.util.ArrayList;
import java.util.List;

public class PallidaClass {
  private String className;
  private List<Student> studentList;
  private List<Mentor> mentorList;

  public PallidaClass() {
  }

  public PallidaClass(String className) {
    studentList = new ArrayList<>();
    mentorList = new ArrayList<>();
    this.className = className;
    this.studentList = studentList;
    this.mentorList = mentorList;
  }

  public void addStudent(Student student) {
    this.studentList.add(student);
  }

  public void addMentor(Mentor mentor) {
    this.mentorList.add(mentor);
  }

  public void info() {
    System.out.println("Pallida " + this.getClassName() + "class has" + getStudentSize()
            + " students and " + getMentorSize() + " mentors.");
  }

  public String getClassName() {
    return className;
  }

  public int getStudentSize() {
    return studentList.size();
  }

  public int getMentorSize() {
    return mentorList.size();
  }
}
