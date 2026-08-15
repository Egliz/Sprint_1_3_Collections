package level_1.CapitalGame;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.*;


public class Game {

    public static HashMap <String, String> loadCountries() {
        HashMap<String, String> hMap = new HashMap<String, String>();
        try (BufferedReader archive = new BufferedReader(new FileReader("C:\\Users\\HP\\IdeaProjects\\Sprint_1_3_Collections\\Sprint_1_3_Collections\\src\\level_1\\CapitalGame\\countries.txt"))) {
            String line = archive.readLine();
            String[] word;
            while (line != null) {
                word = line.split(" ");
                hMap.put(word[0], word[1]);
                line = archive.readLine();
            }
        } catch (IOException e){
            System.out.println("The file could not be read: " + e.getMessage());
        }
        return hMap;
    }

    //bucle que muestre los 10 paises
    public static void play (HashMap <String, String> hMap, Scanner entry, Player userName) {
        List<String> countries = new ArrayList<String>(hMap.keySet());
        Collections.shuffle(countries);
        int country = 0;
        for(int i = 0; i <= 3; i++ ) {
            System.out.println("What is the capital of " + countries.get(country) + "?");
            String capital = entry.next();
            System.out.println("Introdujo el usuario: " + capital);
            String value = hMap.get(countries.get(country));
            System.out.println("Value: " + value);
            if(value.equalsIgnoreCase(capital)) {
                userName.setScore(userName.getScore() + 1);
                System.out.println("Correct.");
            } else {
                System.out.println("Incorrect.");
            }
            country ++;
            System.out.println("Llego hasta aqui");
            System.out.println(userName.getScore());
        }
    }
}


 /*poner los paises en una lista, luego desordenar esa lista,////
        preguntar al usuario la capital de esa lista, esa
        capital que introduce el usuario guardarla,
        hacer hMap.get(clave); que esto me da el valor
        ese valor compararlo con lo que dio el usuario
        *  */


//mi hashMap ponerlo en una list para aplicar la aleatoriedad
//luego un bucle for, que muestra un pais de la list
//se pide al usuario que introduzca la capital
//se comprara con la que ya esta
//puntuacion incrementa si es == sino, no incrementa
//al finak del bucle esa puntuacion se pone en el archivo

//SCANNER

/*recibe Scanner (creado en main)
tendrá un hashMap con todos los datos de countries.txt
Almacenar países
método que tiene un bucle for para los 10 paises (antes de esto, shuffle, para que salgan desordenados y no haya
   chance a que se repitan)
 */