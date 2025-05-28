package chapter3;

import java.util.Scanner;

public class DollarGame {
    public static void main(String[] args) {

        int cent = 1;
        int pennies = cent;
        int nickels = 5 * cent;
        int dime = 10 * cent;
        int quaters = 25 * cent;
        int dollar = 100 * cent;


        int user_pennies;
        int user_nickels;
        int user_dime;
        int user_quarters;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of pennies: ");
        user_pennies = scanner.nextInt();

        System.out.println("Enter the number of nickels: ");
        user_nickels = scanner.nextInt();

        System.out.println("Enter the number of dime: ");
        user_dime = scanner.nextInt();

        System.out.println("Enter the number of quaters: ");
        user_quarters = scanner.nextInt();

        int counter = user_pennies * pennies + user_nickels * nickels + user_dime * dime + user_quarters * quaters;

        if (counter == dollar) System.out.println("You win !");
        else if (counter > dollar) {
            int went_over = counter - dollar;
            System.out.println("You loose! You went over : " + String.format(String.valueOf(went_over)) + "cents");
        } else {
            int went_under = dollar - counter;
            System.out.println("You loose! You went under: " + String.format(String.valueOf(went_under)) + "cents");
        }

    }
}
