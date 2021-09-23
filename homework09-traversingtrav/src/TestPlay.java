/* Travis Crowell
SWEN-601
homework 09
09/22/2021
 */

import java.util.Random;
import java.util.Scanner;

/**
 * initiates TestPlau
 */
public class TestPlay {

    /**
     * initiates random numbers.
     */
    private static final Random RNG = new Random();

    /**
     * uses RNG to produce a random Pokemon with names of the players choosing until we have two pokemon.
     * then sends the two Pokemon to the arena and prints the outcome.
     * then asks the player if theyed like to play again
     */
    public static void main(String[] args) {
        String play = "yes";
        while (play.equals("yes")) {
            int count = 0;
            Pokemon one = new Pokemon("name","type",0,0);
            Pokemon two = new Pokemon("name","type",0,0);

            while (count < 2) {

                int a = RNG.nextInt(3);
                System.out.println(a);
                String type="";
                switch (a) {
                    case 0:
                        type = "normal";
                        break;
                    case 1:
                        type = "fire";
                        break;
                    case 2:
                        type = "water";
                        break;
                    case 3:
                        type = "grass";
                        break;
                }

                int Attack = 0;
                while (Attack < 50) {
                    Attack = RNG.nextInt(100);
                }
                int Health = 0;
                while (Health < 500) {
                    Health = RNG.nextInt(1000);
                }

                Scanner input = new Scanner(System.in);

                System.out.print("Enter yur pokemon name");

                String name = input.nextLine();

                if (count == 0) {
                    one = new Pokemon(name, type, Attack, Health);
                } else {
                    two = new Pokemon(name, type, Attack, Health);
                }
                count++;
            }
            Arena end= new Arena(one, two);
            String result = end.battle();
            System.out.println(result);

            Scanner input = new Scanner(System.in);

            System.out.print("Would you like to watch another battle");

            play = input.nextLine();

        }

    }
}