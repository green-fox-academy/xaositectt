//Student john=new Student("John Doe",20,"male","BME");
//Student johnTheClone=john.clone();

public class CloneableEx {

  public static void main(String[] args) throws CloneNotSupportedException {
    Student john = new Student("John Doe", 20, "male", "BME");
    try {
      Student johnTheClone = john.clone();
    } catch (CloneNotSupportedException ex) {
      System.out.println("Clone Not Supported");
    }
  }
}
