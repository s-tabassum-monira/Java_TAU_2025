


package chapter2;
import java.util.Scanner;
/**
 * A function that will calculate gross pay of an employee.
 * User will input number of working hours and  employee pay rate
 * function will calculate from those inputs and print out a statement with total gross salary
 */
public class GrossPayCalculator {
    public static void main(String[] args) {
        // Get the number of hours worked
        System.out.println("Enter the number of hours worked:");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        // Get the hourly pay rate
        System.out.println("Enter the employee pay rate:");
        double rate = scanner.nextDouble();
        scanner.close();

        // Multiply hours and pay rate
        double grossPay = hours * rate;


        // Display result
        System.out.println("Total gross salary of the employee: $" + grossPay + "/");
    }
}
