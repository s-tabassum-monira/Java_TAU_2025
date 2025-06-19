package chapter5;

import java.util.Scanner;

/*
 * VARIABLE SCOPE
 * Write an 'instant credit check' program that approves
 * anyone who makes more than $25,000 and has a credit score
 * of 700 or better. Reject all others.
 */
public class InstantCreditCheck {
    // Initialize what we know
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        // Get what we don't know
        double salaryStored = getSalary();
        int creditScoreStored = getCreditScore();
        scanner.close();

        // Check if the user is qualified
        boolean isUserQualifiedStore = isUserQualified(salaryStored, creditScoreStored);

        // Notify the user
        notifyUser(isUserQualifiedStore);
    }

    public static boolean isUserQualified(double salary, double creditScore) {
        if (salary >= requiredSalary && creditScore >= requiredCreditScore) return true;
        else return false;
    }

    public static int getCreditScore() {

        System.out.println("Enter your credit score: ");

        int creditScore = scanner.nextInt();
        return creditScore;
    }

    public static double getSalary() {
        System.out.println("Enter your salary: ");

        double salary = scanner.nextDouble();
        return salary;
    }

    public static void notifyUser(boolean isUserQualified){
        if(isUserQualified) System.out.println("Congrats. You are Eligible");
        else System.out.println("Sorry. You are not eligible");
    }
}
