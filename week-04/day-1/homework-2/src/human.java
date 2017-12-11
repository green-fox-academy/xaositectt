
public class human {
  String name;
  int age;
  int height;
  String eyeColor;

  public human(){
  }

  public void speak(){
    System.out.println("Hello, my name is " + name);
    System.out.println("I am "+ height + " tall");
    System.out.println("I am "+ age + " years old");
    System.out.println("My eye color is "+ eyeColor);
  }

  public void eat(){
    System.out.println("eating...");
  }
  public void walk(){
    System.out.println("walking...");
  }
  public void work(){
    System.out.println("work work work work work...");
  }
}
