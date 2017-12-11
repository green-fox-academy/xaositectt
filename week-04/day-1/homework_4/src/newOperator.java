public class newOperator {
  public static void main(String[] args) {
    Acme a = new Acme();
    System.out.println(a);
  }
}

class Acme {
  Acme(){ //constructor
    System.out.println("Acme constructor executes all statements in its code block");
  }
}
