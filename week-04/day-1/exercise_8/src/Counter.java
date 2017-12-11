/*Create Counter class
which has an integer field value
when creating it should have a default value 0 or we can specify it when creating
we can add(number) to this counter another whole number
or we can add() without parameters just increasing the counter's value by one
and we can get() the current value
also we can reset() the value to the initial value*/

public class Counter {
  int field;
  int defaultValue=0;

  public Counter (){
    field = defaultValue;
  }

  public Counter (int field){
    this.field=field;
    defaultValue=field;
  }

  public int add(){
    return field++;
  }

  public int add(int n){
    return field+n;
  }

  public int get(){
    return field;
  }

  public void reset(){
    field=defaultValue;
  }

  public static void main(String[] args) {
    Counter myCounter = new Counter();
    myCounter.add();
    System.out.println(myCounter.get());
    myCounter.reset();
    System.out.println(myCounter.get());
  }
}
