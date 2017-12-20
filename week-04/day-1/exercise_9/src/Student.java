public class Student {
  String subject;

  public Student() {

  }

  public String learn() {
    subject = "I am learning the subject";
    return subject;
  }

  public String question(Teacher name) {
    return name.answer();
  }
}
