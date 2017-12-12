/*Create Station and Car classes
Station
gasAmount
refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount
Car
gasAmount
capacity
create constructor for Car where:
initialize gasAmount -> 0
initialize capacity -> 100*/

public class Petrol {
  public static void main(String[] args) {
    Car bugatti = new Car();
    Station omv = new Station(1000);
    omv.carFill(bugatti);
    omv.carFill(bugatti);
    omv.carFill(bugatti);

    System.out.println("the station now has " + omv.petrolGet()+" gas");
    System.out.println("The bugatti now has " + bugatti.carGet()+ " gas");
  }
}
