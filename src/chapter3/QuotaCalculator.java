package chapter3;
/* IF ELSE
* All salespeople are expected to make at least 10 sales each week
* For those who do, they receive a congratulatory message .
* For those who don't, they are informed of how many sales they were short
*/

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {
        //Initialize values we know
        int quota = 10;

        //Get unknown values
        System.out.println("Enter the number of sales you made this week");
        Scanner scanner =  new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();
        //Make a decision on the path to take -Output
        if(sales >= quota)
            System.out.println("Congratulation for fulfilling weekly sales quota!");

        else{
            int salesShort = quota - sales;
            System.out.println("You didn't meet your weekly quota. You were " + salesShort +" sales short this week" );
        }

    }
}
