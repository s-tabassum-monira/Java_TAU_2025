package chapter2;

import java.util.Scanner;

/**
 * A function where user will input an adjective,
 * a name of a season and minimum number of coffee user drinks
 * and printout a statement based on those inputs
 */
public class exercise1 {
    public static void main(String[] args) {
        String adjective;
        String season;
        int minNumberCoffee;

        Scanner scanner = new Scanner(System.in);

        // Enter adjective
        System.out.println("Enter the adjective for the sentence: ");
        adjective = scanner.next();

        // Enter season
        System.out.println("Enter the season of the year for the sentence: ");
        season = scanner.next();

        // Enter minimum number of cups of coffee
        System.out.println("Enter minimum number of cups of coffee: ");
        minNumberCoffee = scanner.nextInt();

        System.out.println("System will generate: ");
        System.out.println("On a " + adjective + " " + season + " day," + " I drink a minimum of " + minNumberCoffee + " cups of coffee.");


    }
}
