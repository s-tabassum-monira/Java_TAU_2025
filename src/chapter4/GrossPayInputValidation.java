package chapter4;
/* WHILE LOOP
* Each store employee makes $15 an hour. Write a program that allows the employee
* to enter the number of hours worked for the week. Do not allow overtime
*/

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String[] args) {
        // Initialize known variable

        int rate = 15;
        int maxHours = 40;

        // Get input from unknown variables
        System.out.println("How many hours did you work this week? ");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        //Validate input
        while(hoursWorked > maxHours ||  hoursWorked < 1){
            System.out.println("Invalid. Your hours should be in between 1 to 40. Try again");
            hoursWorked = scanner.nextDouble();
        }

        scanner.close();

        //Calculate gross

        double gross = rate * hoursWorked;
        System.out.println("Gross Pay: $" + gross);

    }
}
