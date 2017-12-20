public class Station {
  int gasAmount;

  public Station(int gasAmount) {
    this.gasAmount = gasAmount;
  }

  public void carFill(Car car) {
    this.gasAmount = gasAmount - car.capacity;
    car.gasAmount = car.gasAmount + car.capacity;
  }

  public int petrolGet() {
    return this.gasAmount;
  }
}
