package level_1.Ex3_CapitalGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String userName = entry.next();

        Player player = new Player(userName);
        System.out.println("Let the game begin...");
        Game.play(Game.loadCountries(), entry, player);
        System.out.println(player.getName() + ", this is the score obtained: " + player.getScore());

        Game.saveScore(player);
        System.out.println("Your score has been saved in 'classificacio.txt'.");
    }
}
