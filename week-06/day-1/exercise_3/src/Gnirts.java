//Check out the CharSequence interface
//Create a Gnirts class implementing this interface
//It should have one String field that can be set via the constructor
//Implementing the interfaces methods always think of the field as backwards, so at the second position of "this example" there is a 'p'
//In a main method try out all the methods
//Create a Shifter class implementing this interface
//This charsequence can be set up with a string (that is to be shifted) and a number (which will tell how many to shift)
//Implement the methods so the returned results of them will be shifted

public class Gnirts implements CharSequence {

  private String attribute;

  public Gnirts(String attribute) {
    this.attribute = attribute;
  }

  public static void main(String[] args) {
    Gnirts gnirt = new Gnirts("example");
    System.out.println(gnirt.charAt(1));
    System.out.println(gnirt.subSequence(0, 2));
  }

  @Override
  public int length() {
    return attribute.length();
  }

  @Override
  public char charAt(int index) {
    return attribute.charAt(attribute.length() - 1 - index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return attribute.subSequence(attribute.length() - end, attribute.length() - start);
  }
}
