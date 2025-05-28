package chapter3;

import java.util.Scanner;

/* IF Statement.
All salesperson get a salary of $1000.00 a week.
Salespeople who exceeds 10 sales get an additional bonus of $250.00
*/
public class SalaryCalculator {
    public static void main(String[] args) {
        //Initialize know values
        int salary = 1000;
        int bonus = 250;
        int qouta = 10;

        //Get values of unknown
        System.out.println("How many sales did the empoloyee make this week? ");
        Scanner scanner = new Scanner (System.in);
        int sales = scanner.nextInt();
        scanner.close();


        //Quick detour for bonus earners
        if(sales > qouta){
            salary = salary + bonus;
        }
       //Output
        System.out.println("The employee's pay is $" + salary);

    }
}
