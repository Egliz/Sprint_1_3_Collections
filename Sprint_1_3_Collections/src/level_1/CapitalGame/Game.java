package level_1.CapitalGame;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Game {

    public static HashMap <String, String> loadCountries() {
        HashMap<String, String> hMap = new HashMap<>();
        try (BufferedReader archive = new BufferedReader(new FileReader("C:\\Users\\HP\\IdeaProjects\\Sprint_1_3_Collections\\Sprint_1_3_Collections\\src\\level_1\\CapitalGame\\countries.txt"))) {
            String line = archive.readLine();
            while (line != null) {
                String word[] = line.split(" ");
                hMap.put(word[0], word[1]);
                line = archive.readLine();
            }
        } catch (IOException e){
            System.out.println("The file could not be read: " + e.getMessage());
        }
        return hMap;
    }

        //leer el archivo con try witch resurces,
        // con bufferreader y sin close()
        //mientras el archivo no sea nulo, seguir leyendo y almcenando
        //para el hashMap

    }


//SCANNER

/*recibe Scanner (creado en main)
tendrá un hashMap con todos los datos de countries.txt
Almacenar países
método que tiene un bucle for para los 10 paises (antes de esto, shuffle, para que salgan desordenados y no haya
   chance a que se repitan)
 */