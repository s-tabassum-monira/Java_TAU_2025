package chapter3;

import java.util.Scanner;

public class DayofAWeek {
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
            case "TUESDAY", "WEDNESDAY", "THURSDAY" -> "Mid week";
            case "SATURDAY", "SUNDAY" -> "Weekend";
            default -> "Unacceptable value. Please enter valid day of a week";
        };
        System.out.println(result);
    }
}
