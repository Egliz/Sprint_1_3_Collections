package level_2.HashSetNoDuplicates;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<Restaurant> hSet = new HashSet<Restaurant>();

        hSet.add(new Restaurant("Lasarte", 5));
        Restaurant rest2 = new Restaurant("Disfrutar", 7);
        Restaurant rest3 = new Restaurant("Lasarte", 1);
        Restaurant rest4 = new Restaurant("Lasarte", 1);

        System.out.println(hSet);



    }
}