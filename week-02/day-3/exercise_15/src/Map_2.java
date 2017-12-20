import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Map_2 {

  public static void main(String[] args) {

    ArrayList<Map<String, Object>> mapArrayList = new ArrayList<Map<String, Object>>();

    // Given this list of hashmaps...

    Map<String, Object> row0 = new HashMap<String, Object>();
    row0.put("name", "Rezso");
    row0.put("age", 9.5);
    row0.put("candies", 2);
    mapArrayList.add(row0);

    Map<String, Object> row1 = new HashMap<String, Object>();
    row1.put("name", "Gerzson");
    row1.put("age", 10);
    row1.put("candies", 1);
    mapArrayList.add(row1);

    Map<String, Object> row2 = new HashMap<String, Object>();
    row2.put("name", "Aurel");
    row2.put("age", 7);
    row2.put("candies", 3);
    mapArrayList.add(row2);

    Map<String, Object> row3 = new HashMap<String, Object>();
    row3.put("name", "Zsombor");
    row3.put("age", 12);
    row3.put("candies", 5);
    mapArrayList.add(row3);

    Map<String, Object> row4 = new HashMap<String, Object>();
    row4.put("name", "Olaf");
    row4.put("age", 12);
    row4.put("candies", 7);
    mapArrayList.add(row4);

    Map<String, Object> row5 = new HashMap<String, Object>();
    row5.put("name", "Teodor");
    row5.put("age", 3);
    row5.put("candies", 2);
    mapArrayList.add(row5);

// String var= mapArrayList.get(row0);
//System.out.println("Value at index 1 is: "+var);
// Display the following things:
//  - Who has got more candies than 4 candies
//  - Sum the age of people who have lass than 5 candies
//arraylist
//Object code = mapArrayList.get(row0.get("candies"));
//System.out.println(code);

    double ageSum = 0;

    for (int i = 0; i < mapArrayList.size(); i++) {

      int row0Candy = (int) mapArrayList.get(i).get("candies");


      if (row0Candy > 4) {

        System.out.println("This guy has more than 4 candies:");

        String NameOfGuy = (String) mapArrayList.get(i).get("name");

        System.out.println(NameOfGuy);

      } else if (row0Candy < 5) {

        double specAge = Double.parseDouble(mapArrayList.get(i).get("age").toString());

        //parseDouble - beletesz doubleba olyan int dolgokat, amiket amúgy nem lehetne
        //parseDouble csak stringgel tud dolgozni szóval először stringgé kell tenni

        ageSum = ageSum + specAge;

      }
      //System.out.println(ageSum);
    }
    System.out.println(ageSum);
    //int row0Candy = (int)mapArrayList.get(0).get("candies");
    //System.out.println(row0Candy);
    //hashmap
    // Object code = row0.get("candies");
    //System.out.println(code);
  }
}
