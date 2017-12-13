/*Aircrafts

Create a class that represents an aircraft
There are 2 types of aircrafts: F16 and F35
Both aircraft should track how many ammo it has

All the aircrafts should be created with empty ammo store
fight
It should use all the ammos (set it to 0) and it should return the damage it deals
The damage is the multiplication of the base damage and the ammos
refill
It should take a number as parameter and substract as much ammo as possibe
It can't have more ammo than the number or the max ammo
It should return the remaining ammo
Eg. Filling an empty F35 with 300 would completely fill the storage of the aircraft and would return the remaining 28
*/


public class Plane {
  private String Type;
  private int maxAmmo;
  private int baseDamage;
  private int ammo;

  public Plane() {
    this.ammo=0;
  }

  public Plane(int maxAmmo, int baseDamage) {
    this.maxAmmo = maxAmmo;
    this.baseDamage = baseDamage;
  }

  public int damage() {
    ammo=0;
    return this.ammo*this.baseDamage;
  }

  //refill
  //It should take a number as parameter and substract as much ammo as possibe
  //It can't have more ammo than the number or the max ammo
  //It should return the remaining ammo
  //Eg. Filling an empty F35 with 300 would completely fill the storage of the aircraft and would
  // return the remaining 28

  public int refill(int refill) {
    int ammoToFill = this.maxAmmo-this.ammo;
    if (refill >= ammoToFill) {
      this.ammo = this.maxAmmo;
    } else { this.ammo = this.ammo+refill;}
    return refill-ammoToFill;
  }

  //getType
  //It should return it's type as a string
  //getStatus
  //It should return a string like: Type F35, Ammo: 10, Base Damage: 50, All Damage: 500

  public String getType(){
    return (String)this.getClass().toString().replace("class ","");
  }

  public int getMaxAmmo() {
    return maxAmmo;
  }

  public int getBaseDamage() {
    return baseDamage;
  }

  public int getAmmo() {
    return ammo;
  }

  public String getStatus(){
    String status= "Type: " + this.getType() + ", Ammo: " + this.getAmmo() + ", Base Damage:" +
            this.getBaseDamage() + ", All Damage:" + this.getBaseDamage()*this.getAmmo();
    return status;
  }
}
