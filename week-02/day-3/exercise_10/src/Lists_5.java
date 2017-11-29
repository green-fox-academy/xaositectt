import java.util.*;

public class Lists_5 {

    public static void main(String[] args) {


        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));

        // Check if the arrayList contains "7" if it contains print "Hoorray" otherwise print "Noooooo"
        // Do this again with a different solution using different list functions!

        //System.out.println(arrayList.get(1));

        for (int i =0; i < arrayList.size(); i++)
        {
            if (arrayList.get(i) == 7)
            {
                System.out.println("Hooray");

            }
            else
            {
                System.out.println("Nooooooooo");
            }

        }


    }

}
