package chapter4;

import java.util.Scanner;

/*
 * NESTED LOOPS:
 * Find the average of each student's test scores
 */
public class AverageTestScores {
    public static void main(String[] args) {
        //Initialize what we know
        int numberOfStudents = 24;
        int numberofSubject = 4;

        Scanner scanner = new Scanner(System.in);
        //Process all Students
        for(int i = 0; i<numberOfStudents ; i++){
            double total = 0;

            for (int j = 0; j<numberofSubject; j ++){
                System.out.println("Enter score of Test#: " + (j+1) );
                double score = scanner.nextDouble();
                total += score;
            }
            double testAverage = total/numberofSubject;
            System.out.println("The average test score of the student#" + (i+1) + "is = " + testAverage);
        }
        scanner.close();

    }
}
