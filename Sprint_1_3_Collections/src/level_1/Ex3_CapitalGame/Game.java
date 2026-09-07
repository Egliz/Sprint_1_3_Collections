package level_1.Ex3_CapitalGame;

import java.io.*;
import java.util.*;

public class Game {

    public static HashMap<String, String> loadCountries() {
        HashMap<String, String> hMap = new HashMap<String, String>();
        try (BufferedReader archive = new BufferedReader(new FileReader("Sprint_1_3_Collections/src/resources/countries.txt"))) {
            String line = archive.readLine();
            String[] word;
            while (line != null) {
                word = line.split(" ");
                hMap.put(word[0], word[1]);
                line = archive.readLine();
            }
        } catch (IOException e) {
            System.out.println("The file could not be read: " + e.getMessage());
        }
        return hMap;
    }

    public static void play(HashMap<String, String> hMap, Scanner entry, Player player) {
        List<String> countries = new ArrayList<String>(hMap.keySet());
        Collections.shuffle(countries);
        for (int i = 0; i <= 9; i++) {
            System.out.println("What is the capital of " + countries.get(i) + "?");
            String capital = entry.next();
            String value = hMap.get(countries.get(i));
            if (value.equalsIgnoreCase(capital)) {
                incrementScore(player);
                System.out.println("Correct.");
            } else {
                System.out.println("Incorrect.");
            }
        }
    }

    public static void incrementScore(Player player) {
        player.setScore(player.getScore() + 1);
    }

    public static void saveScore(Player player) {
        String filePath = "Sprint_1_3_Collections/src/resources/classificacio.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write("User: " + player.getName() + "\nScore: " + player.getScore() + "\n");
        } catch (IOException e) {
            System.out.println("Error writing to the file." + e.getMessage());
        }
    }
}
