//Every animal has a hunger value, which is a whole number
//Every animal has a thirst value, which is a whole number
//when creating a new animal object these values are created with the default 50 value
//Every animal can eat() which decreases their hunger by one
//Every animal can drink() which decreases their thirst by one
//Every animal can play() which increases both by one

public class Animal {
  int thirst;
  int hunger;

  public Animal() {
    this(40, 40);
  }

  public Animal(int thirst, int hunger) {
    this.thirst = thirst;
    this.hunger = hunger;
  }

  public static void main(String[] args) {
    Animal milla = new Animal(40, 40);
    milla.play();
    milla.whatisit();
    milla.eat();
    milla.eat();
    milla.play();
    milla.play();
    milla.whatisit();
  }

  public void whatisit() {
    System.out.println("the thirst is: " + thirst);
    System.out.println("the hunger is: " + hunger);
  }

  public void eat() {
    hunger--;
  }

  public void drink() {
    thirst--;
  }

  public void play() {
    thirst++;
    hunger++;
  }
}
