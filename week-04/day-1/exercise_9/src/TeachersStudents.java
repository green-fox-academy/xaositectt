public class TeachersStudents {
  public static void main(String[] args) {

    Teacher Joco = new Teacher();
    Student Dzsoni = new Student();

    System.out.println(Joco.teach(Dzsoni));

    System.out.println(Dzsoni.question(Joco));
  }
}
