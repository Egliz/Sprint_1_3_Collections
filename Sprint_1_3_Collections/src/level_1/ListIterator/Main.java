package level_1.ListIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        System.out.println("First List:\n" + originalList());
        System.out.println("Second List:\n" + reverseList(originalList()));

    }

    public static List<Integer> originalList() {
        List<Integer> firstList = new ArrayList<Integer>();
        int numsInList = 6;
        for (int i = 0; i < numsInList; i++) {
            firstList.add(i);
        }
        return firstList;
    }

    public static List<Integer> reverseList(List<Integer> originalList) {

        List<Integer> secondList = new ArrayList<Integer>();
        ListIterator<Integer> it = originalList.listIterator(originalList.size());

        while (it.hasPrevious()) {
            secondList.add(it.previous());
        }
        return secondList;

    }
}