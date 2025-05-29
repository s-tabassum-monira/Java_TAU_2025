package chapter3;

import java.util.Scanner;

/**
 * A function where program asks user to enter the quantities for the following coins:
 * pennies, nickels, dime and quarters. The program should count up the value of all the change.
 * If the sum is exactly $1, user wins.
 * If the sum is more than $1, program tells user by how much the user went over
 * If the sum is less than $1, program tells user by how much  the user went under.
 *
 */
public class DollarGame {
    public static void main(String[] args) {

        int cent = 1;
        int penny = cent;
        int nickel = 5 * cent;
        int dime = 10 * cent;
        int quarters = 25 * cent;
        int dollar = 100 * cent;


        int user_pennies;
        int user_nickels;
        int user_dimes;
        int user_quarters;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of pennies: ");
        user_pennies = scanner.nextInt();

        System.out.println("Enter the number of nickels: ");
        user_nickels = scanner.nextInt();

        System.out.println("Enter the number of dime: ");
        user_dimes = scanner.nextInt();

        System.out.println("Enter the number of quarters: ");
        user_quarters = scanner.nextInt();

        int counter = user_pennies * penny + user_nickels * nickel + user_dimes * dime + user_quarters * quarters;

        if (counter == dollar) System.out.println("You win !");
        else if (counter > dollar) {
            int went_over = counter - dollar;
            System.out.println("You lose! You went over : " + String.format(String.valueOf(went_over)) + "cents");
        } else {
            int went_under = dollar - counter;
            System.out.println("You lose! You went under: " + String.format(String.valueOf(went_under)) + "cents");
        }

    }
}
