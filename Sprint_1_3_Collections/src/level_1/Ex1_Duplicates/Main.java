package level_1.Ex1_Duplicates;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Month> listMonths = new ArrayList();

        addMonth(listMonths);
        System.out.println("Added months: " + listMonths);

        Month august = new Month("August");
        listMonths.add(7, august);

        System.out.println("\nThe missing month was added to its " +
                "corresponding position, and the list remains in order:\n" + listMonths);

        HashSet<Month> hSet = new HashSet<>(listMonths);
        System.out.println("\nList size before verify duplicates: " + hSet.size());
        System.out.println(checkDuplicateMonth(hSet) + "List size: " + hSet.size());

        System.out.println("\nDisplaying the months using a 'for loop':\n");
        for (Month month : hSet) {
            System.out.println(month);
        }

        System.out.println("Displaying the months with 'Iterator': \n");
        Iterator<Month> it = hSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void addMonth(ArrayList<Month> listMonths) {

        listMonths.add(new Month("January"));
        listMonths.add(new Month("February"));
        listMonths.add(new Month("March"));
        listMonths.add(new Month("April"));
        listMonths.add(new Month("May"));
        listMonths.add(new Month("June"));
        listMonths.add(new Month("July"));
        listMonths.add(new Month("September"));
        listMonths.add(new Month("October"));
        listMonths.add(new Month("November"));
        listMonths.add(new Month("December"));
    }

    public static String checkDuplicateMonth(HashSet<Month> hSet) {
        Month duplMonth = new Month("February");
        hSet.add(duplMonth);
        return "Months without duplicates:\n" + hSet;
    }
}