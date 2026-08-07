package level_1.ListIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        System.out.println("First List:\n" + OriginalList());

       /*
        List<Integer> secondList = new ArrayList<Integer>();
        ListIterator<Integer> it = firstList.listIterator(firstList.size());

        while (it.hasPrevious()) {
            secondList.add(it.previous());
        }
        System.out.println("Second List:\n" + secondList);
    }
*/
}
    public static List<Integer> OriginalList(){
        List<Integer> firstList = new ArrayList<Integer>();
        int numsInList = 6;
        for (int i = 0; i < numsInList; i++) {
            firstList.add(i);
        }
        return firstList;
    }
}