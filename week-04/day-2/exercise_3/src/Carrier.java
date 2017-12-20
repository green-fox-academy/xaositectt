//Create a class that represents an aircraft-carrier
//The carrier should be able to store aircrafts
//Each carrier should have a store of ammo represented as number
//The inital ammo should be given by a parameter in it's constructor
//The carrier also has a health point given in it's constructor as well


import java.util.ArrayList;
import java.util.List;

public class Carrier {
  private List<Plane> carrier;
  private String name;
  private int ammoStorage;
  private int health;

  public Carrier(String name, int ammoStorage, int health) {
    this.name = name;
    carrier = new ArrayList<>();
    this.ammoStorage = ammoStorage;
    this.health = health;
  }
  //addAircraft
  //It should take a string as the type of the aircraft (F16 / F35) and add a new aircraft to its store

  public void addAircraft(String type) {
    if (type.equals("F16")) {
      F16 F16 = new F16();
      this.getCarrier().add(F16);
    }
    if (type.equals("F35")) {
      F35 F35 = new F35();
      this.getCarrier().add(F35);
    }
  }

//  fight
//  It should take another carrier as a refrence parameter and fire all the ammo from the aircrafts to it,
//  than substract all the damage from it's health points
//  getStatus
//  It should give back a string about it's and all of its aircrafts status like:
//  HP: 5000, Aircraft count: 4, Ammo Storage: 2300, Total damage: 2280
//  Aircrafts:
//  Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
//  Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
//  Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
//  Type F16, Ammo: 8, Base Damage: 30, All Damage: 240
//  Type F16, Ammo: 8, Base Damage: 30, All Damage: 240
//  If the health points are 0 than it should give back: It's dead Jim :(

  public void fight(Carrier enemy) {
    int enemyHealth = enemy.getHealth();
    if (enemyHealth <= 0) {
      System.out.println(enemy.getName() + " is already destroyed.");
      System.out.println("");
    } else {
      for (Plane plane : this.getCarrier()) {
        enemyHealth = enemyHealth - plane.getAmmo() * plane.getBaseDamage();
        plane.setAmmo(0);
      }
      System.out.println(this.name + " attacked " + enemy.name + " and dealt " + (enemy.getHealth() - enemyHealth) + " damage.");
      if (enemyHealth <= 0) {
        System.out.println(this.name + " destroyed " + enemy.name + " !");
        System.out.println("");
        enemy.setHealth(0);
      } else {
        enemy.setHealth(enemyHealth);
      }
    }
  }

  //fill
  //It should fill all the aircraft with ammo and substract the needed ammo from the ammo storage
  //If there is not enough ammo than it should start to fill the F35 types first
  //If there is no ammo when this method is called it should throw an exception

  public void fill() {
    for (Plane plane : this.getCarrier()) {
      if (plane instanceof F35) {
        this.ammoStorage = plane.refill(this.ammoStorage);
      }
    }
    for (Plane plane : this.getCarrier()) {
      if (plane instanceof F16) {
        this.ammoStorage = plane.refill(this.ammoStorage);
      }
    }
  }

  public void printInfo() {
    System.out.println("This carrier " + this.getName() + " carries these planes: ");
    for (Plane plane : this.getCarrier()) {
      System.out.println("Type: " + plane.getType() + ", base damage: " + plane.getBaseDamage() + ", ammo: " + plane.getAmmo());
    }
    System.out.println("Current ammo storage is: " + this.ammoStorage);
    System.out.println("Current health is: " + this.health);
    System.out.println("");
  }

  public List<Plane> getCarrier() {
    return carrier;
  }

  public void setCarrier(List<Plane> carrier) {
    this.carrier = carrier;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAmmoStorage() {
    return ammoStorage;
  }

  public void setAmmoStorage(int ammoStorage) {
    this.ammoStorage = ammoStorage;
  }

  public int getHealth() {
    return health;
  }

  public void setHealth(int health) {
    this.health = health;
  }
}
