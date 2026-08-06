import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Month> listMonths = new ArrayList();

        addMonth(listMonths);
        System.out.println("Added months: " + listMonths);

        Month agost = new Month("Agost");
        listMonths.add(7, agost);

        System.out.println("\nThe missing month was added to its " +
                "corresponding position, and the list remains in order:\n" + listMonths);

        HashSet<Month> hSet = new HashSet<>(listMonths);
        System.out.println(checkDuplicateMonth(hSet));

        System.out.println("***** Displaying the months using a 'for loop':... *****\n");
        for(Month month : hSet) {
            System.out.println(month);
        }

        System.out.println("***** Displaying the months with 'Iterator':... *****");
        Iterator<Month> it = hSet.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void addMonth(ArrayList<Month>listMonths) {

        listMonths.add(new Month ("Gener"));
        listMonths.add(new Month ("Febrer"));
        listMonths.add(new Month ("Març"));
        listMonths.add(new Month ("Abril"));
        listMonths.add(new Month ("Maig"));
        listMonths.add(new Month ("Juny"));
        listMonths.add(new Month ("Juliol"));
        listMonths.add(new Month ("Septembre"));
        listMonths.add(new Month ("Octubre"));
        listMonths.add(new Month ("Novembre"));
        listMonths.add(new Month ("Decembre"));
    }

    public static String checkDuplicateMonth(HashSet<Month>hSet) {
        Month duplMonth = new Month("Febrer");
        hSet.add(duplMonth);
        return "Months without duplicates:\n" + hSet;
    }
}