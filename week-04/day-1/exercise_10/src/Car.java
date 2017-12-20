//Create Station and Car classes
//Station
//gasAmount
//refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount
//Car
//gasAmount
//capacity
//create constructor for Car where:
//initialize gasAmount -> 0
//initialize capacity -> 100

public class Car {
  int capacity;
  int gasAmount;

  public Car() {
    this.capacity = 100;
    this.gasAmount = 0;
  }

  public int carGet() {
    return this.gasAmount;
  }
}
