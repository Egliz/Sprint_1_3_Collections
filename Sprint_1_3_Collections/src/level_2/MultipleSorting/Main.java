package level_2.MultipleSorting;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.sort;

public class Main {
    public static void main(String[] args) {

        List<Restaurant> restaurants = new ArrayList<Restaurant>();

        restaurants.add(new Restaurant("McDon", 7));
        restaurants.add(new Restaurant("Burger King", 8));
        restaurants.add(new Restaurant("McDon", 9));
        restaurants.add(new Restaurant("KFC", 6));

        System.out.println("Original list: " + restaurants);
        RestaurantComparator comparator = new RestaurantComparator();
        sort(restaurants, comparator);

        System.out.println("Ordered list: " + restaurants);
    }
}