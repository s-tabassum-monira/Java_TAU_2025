package chapter4;

import java.util.Scanner;

/*
 * LOOP BREAK
 * Search a String to determine if it contains the letter ‘A’.
 */
public class LetterSearch {
    public static void main(String[] args) {
        // Get text
        System.out.println("Enter some text: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();


        int len = text.length();
        boolean foundA = false;
        String lower = text.toLowerCase();
        // Search text for letter 'A'
        for (int i = 0; i < len; i++) {
            char currentLetter = lower.charAt(i);
            if (currentLetter== 'a') {
                System.out.println("Found an 'A' in the text");
                foundA = true;
                break;
            }
            else{
                continue;
            }
        }
        if (!foundA){
            System.out.println("Could not find an 'A' in the text");
        }

    }


}
