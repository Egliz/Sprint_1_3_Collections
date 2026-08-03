import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Month> listMonths = new ArrayList();

        System.out.println(addMonth(listMonths));

        Month agost = new Month("Agost");
        listMonths.add(7, agost);

        System.out.println("The missing month was added to its " +
                "corresponding position, and the list remains in order: " + listMonths);

    }

    public static String addMonth(ArrayList<Month>listMonths) {

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

        return "Added months: " + listMonths;
    }
}