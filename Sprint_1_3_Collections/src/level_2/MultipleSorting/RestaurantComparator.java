package level_2.MultipleSorting;

import java.util.Comparator;

public class RestaurantComparator implements Comparator<Restaurant> {

    @Override
    public static int compare(Restaurant o1, Restaurant o2) {
        int result = o1.getName().compareTo(o2.getName());

        if (result < 0) {
            return -1;
        } else if (result > 0) {
            return 1;
        } else {
            if (o1.getScore() > o2.getScore()) {
                return -1;
            } else if (o1.getScore() < o2.getScore()) {
                return 1;
            } else {
                return 0;
            }
        }
}
