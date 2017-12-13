/*The task is to create a garden application, so in your main method you should
create a garden with flowers and trees. The program should demonstrate an example
garden with two flowers (yellow and blue) and two trees (purple and orange). In the
example after creating them you should show the user, how the garden looks like. After
that the program should water the garden twice, first with the amount of 40 then with 70.
And after every watering the user should see the state of the garden as you can see in the output.
The output should look like this:

The yellow Flower needs water
The blue Flower needs water
The purple Tree needs water
The orange Tree needs water

Watering with 40
The yellow Flower doesnt need water
The blue Flower doesnt need water
The purple Tree needs water
The orange Tree needs water

Watering with 70
The yellow Flower doesnt need water
The blue Flower doesnt need water
The purple Tree doesnt need water
The orange Tree doesnt need water

The Garden
is able to hold unlimited amount of flowers or trees
when watering it should only water those what needs water with equally divided amount amongst them
eg. watering with 40 and 4 of them need water then each gets watered with 10
*/

import java.util.List;
import java.util.ArrayList;

public class GardeningApp {

  public static void main(String[] args) {
    Plant daisy = new Flower("daisy", "yellow");
    Plant lily = new Flower("lily", "blue");
    Plant tulip = new Flower("tulip", "red");
    Plant pine = new Tree("pine", "purple");
    Plant oak = new Tree("oak", "orange");
    Plant cedar = new Tree("cedar", "beige");

    Garden Paradise = new Garden("Paradise");
    Paradise.addToList(daisy);
    Paradise.addToList(lily);
    Paradise.addToList(tulip);
    Paradise.addToList(pine);
    Paradise.addToList(oak);
    Paradise.addToList(cedar);

    //Paradise.getinfo();

    Paradise.getinfo();

    System.out.println(Paradise.thirstCounter());

    Paradise.waterPlants(20);

    Paradise.getinfo();

    Paradise.thirstCounter();
  }
}
