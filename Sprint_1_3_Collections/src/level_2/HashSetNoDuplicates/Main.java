package level_2.HashSetNoDuplicates;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<Restaurant> hSet = new HashSet<Restaurant>();

        hSet.add(new Restaurant("Lasarte", 5));
        hSet.add(new Restaurant("Lasarte", 5));
        hSet.add(new Restaurant("Lasarte", 8));
        hSet.add(new Restaurant("Disfrutar", 5));
        hSet.add(new Restaurant("Disfrutar", 7));

        System.out.println(hSet);
        System.out.println("Size: " + hSet.size());
    }
}
