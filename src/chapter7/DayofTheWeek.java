package chapter7;

import java.util.Scanner;

public class DayofTheWeek {
    private static String[] daysOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};


    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a number in between 1 to 7 to know day.. 1 being Monday and 7 being Sunday");
        int dayStored = scanner.nextInt();
        scanner.close();

        if (dayStored >= 1 && dayStored <= 7) System.out.println("Your day of the week is: " + getDays(dayStored));
        else System.out.println("Invalid day..Enter a valid number");

    }

    public static String getDays(int dayEntered) {
        if (dayEntered == 1) {
            return daysOfTheWeek[0];
        } else if (dayEntered == 2) {
            return daysOfTheWeek[1];
        } else if (dayEntered == 3) {
            return daysOfTheWeek[2];
        } else if (dayEntered == 4) {
            return daysOfTheWeek[3];
        } else if (dayEntered == 5) {
            return daysOfTheWeek[4];
        } else if (dayEntered == 6) {
            return daysOfTheWeek[5];
        } else {
            return daysOfTheWeek[6];
        }


    }
}

