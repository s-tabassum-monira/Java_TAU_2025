package chapter4;

import java.util.Random;

/**
 * A function that simulates a board game where the user has 5 dice rolls to land exactly on space 20.
 * Each roll generates a random number between 1–6 and advances the user accordingly.
 * After each roll, the function displays the current position and remaining spaces.
 * The game ends if the user reaches space 20 within 5 rolls (win) or fails to land exactly on 20 (lose).
 * The board has exactly 20 spaces — going beyond is considered a loss.
 */
public class RollTheDieGame {
    public static void main(String[] args) {
        int spaceLimit = 20;
        int roll_die_attempt = 5;

        Random random = new Random();
        int currentPosition = 0;

        System.out.println("Welcome to Roll the Die! Let's begin...");
        for (int i = 1 ; i <=roll_die_attempt; i++) {
            System.out.println("Roll the die");
            int die = random.nextInt(6) + 1;
            currentPosition += die;
            if (currentPosition == spaceLimit) {
                System.out.println("Roll #" + (i) + ".You rolled a " + die + ".You are on space " + currentPosition + ".Congrats, you win!");
                break;
            } else if (currentPosition > spaceLimit) {
                System.out.println("Roll #" + (i) + ".You rolled a " + die + ".You are on space " + currentPosition + ".Unfortunately that takes you past " + spaceLimit + " .Sorry you lose!");
                break;
            } else if (i == roll_die_attempt && currentPosition < spaceLimit) {
                System.out.println("Roll #" + (i) + ".You rolled a " + die + ".You are on space " + currentPosition + ".Unfortunately you did not make it to all " + spaceLimit + " .Sorry you lose!");


            } else {
                int spaceToGo = spaceLimit - currentPosition;
                System.out.println("Roll #" + (i) + ".You rolled a " + die + ".You are on space " + currentPosition + " and have " + spaceToGo + " blocks to go.");
            }

        }


    }
}
