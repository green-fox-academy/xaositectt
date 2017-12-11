public class Teacher {
  String myAnswer;

  public Teacher() {

  }

  public String answer() {
    myAnswer="This is the answer";
    return myAnswer;
  }

  public String teach(Student name) {
    return name.learn();
  }
}
