package chapter3;

import java.util.Scanner;

/**
 * Switch Case
 * A function where user will input a day of a week,
 * if user inputs 'Monday' then system will print out a statement saying "Start of the week",
 * if user inputs 'Friday' then system will print out a statement saying "End of the week" , and yield "The End"
 * if user inputs 'Tuesday' or 'Wednesday' or 'Thursday' then system will print out a statement saying "Midweek",
 * if user inputs  'Saturday' or 'Sunday' then system will print out a statement saying "Weekend"
 * For any other values other than valid days of a week system will print out a statement saying "Unacceptable value. Please enter valid day of a week"
 */
public class DaysOfAWeek {

    public static void main(String[] args) {
        String day;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your day ");
        day = scanner.next();
        day = day.toUpperCase();

        String result = switch (day) {
            case "MONDAY" -> "Start of the week";
            //case "FRIDAY" -> "End of the week";
            case "FRIDAY" -> {
                System.out.println("Almost weekend");
                yield "THE END";
            }
            case "TUESDAY", "WEDNESDAY", "THURSDAY" -> "Midweek";
            case "SATURDAY", "SUNDAY" -> "Weekend";
            default -> "Unacceptable value. Please enter valid day of a week";
        };
        System.out.println(result);
    }
}
