package day7;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Player[] players = new Player[6];
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player(90 + rnd.nextInt(11));
            System.out.print(players[i].getStamina() + ", ");
        }
        System.out.println();

        while (players[0].getStamina() > 0) {
            players[0].run();
        }
        Player.info();
    }
}
