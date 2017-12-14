public class Animal {
  private String species;
  private int thirst;
  private int hunger;

  public Animal(){
    this.species = "unspecified";
    this.thirst = 40;
    this.hunger = 40;
  }

  public Animal (String name){
    this.species = name;
  }

  public void whatisit(){
    System.out.println("the thirst is: "+thirst);
    System.out.println("the hunger is: "+hunger);
  }

  public void eat(){
    hunger--;
  }

  public void drink(){
    thirst--;
  }

  public void play(){
    thirst++;
    hunger++;
  }

  public int getThirst() {
    return thirst;
  }

  public void setThirst(int thirst) {
    this.thirst = thirst;
  }

  public int getHunger() {
    return hunger;
  }

  public void setHunger(int hunger) {
    this.hunger = hunger;
  }

  public String getSpecies() {
    return species;
  }

  public void setName(String species) {
    this.species = species;
  }
}
