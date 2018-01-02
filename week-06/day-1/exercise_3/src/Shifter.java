//Create a Shifter class implementing this interface
//This charsequence can be set up with a string (that is to be shifted) and a number (which will tell how many to shift)
//Implement the methods so the returned results of them will be shifted

public class Shifter implements CharSequence {

  private String attribute;
  private int shiftNum;

  public Shifter(String attribute, int shiftNum) {
    this.attribute = attribute;
    this.shiftNum = shiftNum;
  }

  public static void main(String[] args) {
    Shifter shifter = new Shifter("example", 2);
    System.out.println(shifter.charAt(0));
    System.out.println(shifter.subSequence(0, 2));
  }

  @Override
  public int length() {
    return attribute.length();
  }

  @Override
  public char charAt(int index) {
    return attribute.charAt(index + this.shiftNum);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return attribute.subSequence(start + this.shiftNum, end + this.shiftNum);
  }
}
