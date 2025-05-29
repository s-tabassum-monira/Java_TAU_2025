package chapter3;

import java.util.Scanner;

/* The If-Else-If _Statement

 * If situation A occurs, do something.

 * Else if situation B occurs, do something else.

 * Else if situation C occurs, do something else. */
public class TestResults {
    public static void main(String[] args) {
        // Get the test score
        System.out.println("Enter your test grade: ");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        // Determine the letter grade
        char grade;

        if (score < 60) grade = 'F';
        else if (score < 70) grade = 'D';
        else if (score < 80) grade = 'C';
        else if (score < 90) grade = 'B';
        else grade = 'A';

        System.out.println("Your grade is : " + grade);
    }
}
