package level_1.ListIterator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int numsInList = 6;

        List<Integer> firstList = new ArrayList<Integer>();
        for(int i = 0; i < numsInList; i++){
            firstList.add(i);
        }
        System.out.println(firstList);

        List<Integer> scondList = new ArrayList<Integer>();
        for (int i = numsInList - 1; i >= 0; i--) {
            scondList.add(i);
        }
        System.out.println(scondList);


    }

}
