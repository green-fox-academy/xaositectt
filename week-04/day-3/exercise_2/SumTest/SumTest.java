/*Create a sum method in your class which has an ArrayList of Integers as parameter
It should return the sum of the elements in the list
Follow these steps:
Add a new test case
Instantiate your class
create a list of integers
use the assertEquals to test the result of the created sum method
Run them
Create different tests where you
test your method with an empyt list
with a list with one element in it
with multiple elements in it
with a null
Run them
Fix your code if needed*/

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SumTest {
  SumList sumList1= new SumList();
  private int num1=3;
  private int num2=4;
  private int num3=5;

  @Test
  public void test1() {
    SumList sumList1= new SumList();
    int num1=3;
    int num2=4;
    int num3=5;
    sumList1.addElement(num1);
    sumList1.addElement(num2);
    sumList1.addElement(num3);
    assertEquals(sumList1.sumListIntegers(), 12);
  }

  @Test
  public void test2() {
    SumList sumList1= new SumList();
    int num1=3;
    int num2=4;
    int num3=5;
    //sumList1.addElement(num1);
    //sumList1.addElement(num2);
    //sumList1.addElement(num3);
    assertEquals(sumList1.sumListIntegers(), 0);
  }

  @Test
  public void test3() {
    SumList sumList1= new SumList();
    int num1=3;
    int num2=4;
    //int num3=5;
    sumList1.addElement(num1);
    sumList1.addElement(num2);
    //sumList1.addElement(num3);
    assertEquals(sumList1.sumListIntegers(), 7);
  }
}
