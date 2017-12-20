//Aircraft Carrier
//
//Create a class that represents an aircraft-carrier
//
//The carrier should be able to store aircrafts
//Each carrier should have a store of ammo represented as number
//The inital ammo should be given by a parameter in it's constructor
//The carrier also has a health point given in it's constructor as well
//Methods:
//
//addAircraft
//
//It should take a string as the type of the aircraft (F16 / F35) and add a new aircraft to its store
//fill
//
//It should fill all the aircraft with ammo and substract the needed ammo from the ammo storage
//If there is not enough ammo than it should start to fill the F35 types first
//If there is no ammo when this method is called it should throw an exception
//fight
//
//It should take another carrier as a refrence parameter and fire all the ammo from the aircrafts to it, than substract all the damage from it's health points
//getStatus
//
//It should give back a string about it's and all of its aircrafts status like:
//
//HP: 5000, Aircraft count: 4, Ammo Storage: 2300, Total damage: 2280
//Aircrafts:
//Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
//Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
//Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
//Type F16, Ammo: 8, Base Damage: 30, All Damage: 240
//Type F16, Ammo: 8, Base Damage: 30, All Damage: 240
//If the health points are 0 than it should give back: It's dead Jim :(

public class AircraftCarrier {
  public static void main(String[] args) {

    Carrier myCarrier1 = new Carrier("Moby Dick", 100, 600);

    myCarrier1.printInfo();

    myCarrier1.addAircraft("F35");
    myCarrier1.addAircraft("F35");
    myCarrier1.addAircraft("F35");
    myCarrier1.addAircraft("F16");
    myCarrier1.addAircraft("F16");
    myCarrier1.addAircraft("F16");

    myCarrier1.printInfo();

    myCarrier1.fill();

    myCarrier1.printInfo();

    Carrier myCarrier2 = new Carrier("Titanic", 100, 400);


    myCarrier2.addAircraft("F35");
    myCarrier2.addAircraft("F35");
    myCarrier2.addAircraft("F35");
    myCarrier2.addAircraft("F16");
    myCarrier2.addAircraft("F16");
    myCarrier2.addAircraft("F16");

    myCarrier1.fight(myCarrier2);
    myCarrier1.fight(myCarrier2);

    myCarrier1.printInfo();
    myCarrier2.printInfo();

    myCarrier1.fill();

    myCarrier1.printInfo();

    //myCarrier1.
  }
}
