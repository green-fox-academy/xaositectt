public class FleetOfThings {

  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch

    Thing getmilk = new Thing("get milk");
    getmilk.complete(false);

    Thing remove = new Thing("remove the obstacles");
    remove.complete(false);

    Thing stand = new Thing("stand up");
    stand.complete(true);

    Thing eat = new Thing("eat lunch");
    eat.complete(true);

    Fleet myFleet = new Fleet();
    myFleet.add(getmilk);
    myFleet.add(remove);
    myFleet.add(stand);
    myFleet.add(eat);

    System.out.println(myFleet.toString());
  }
}
