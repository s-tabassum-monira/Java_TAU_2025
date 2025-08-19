package chapter8;

import java.util.Scanner;

public class PasswordValidator {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter your user name: ");
        String userName = scanner.nextLine();

        System.out.println("Enter your old Password: ");
        String oldPassword = scanner.nextLine();

        System.out.println("Enter your new Password: ");
        String newPassword = scanner.nextLine();

        scanner.close();

        boolean passLength = isPasswordEightCharacterLong(newPassword);
        boolean checkUpperCaseLetter = containsUpperCaseLetter(newPassword);
        boolean checkSpecialCharacter = containsSpecialCharacter(newPassword);
        boolean checkUserName = containsUserName(newPassword, userName);
        boolean checkSameAsOldPass = sameAsOldPassword(newPassword, oldPassword);

        if (passLength && checkUpperCaseLetter && checkSpecialCharacter && !checkUserName && !checkSameAsOldPass)
            System.out.println("Password Changed Successfully");
        if (!passLength) System.out.println("Password should be eight character long");
        if (!checkUpperCaseLetter) System.out.println("Password must contain a upper case letter");
        if (!checkSpecialCharacter) System.out.println("Password must contain a upper case letter");
        if (checkUserName) System.out.println("Password must not contain user name");
        if (checkSameAsOldPass) System.out.println("Password should not be same as old password");


    }

    public static boolean isPasswordEightCharacterLong(String newPass) {
        if (newPass.length() >= 8) return true;
        else return false;
    }

    public static boolean containsUpperCaseLetter(String newPass) {
        for (char c : newPass.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsSpecialCharacter(String newPass) {
        for (char c : newPass.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) return true;
        }
        return false;
    }

    public static boolean containsUserName(String newPass, String userName) {
        if (newPass.toLowerCase().contains(userName.toLowerCase())) return true;
        return false;

    }


    public static boolean sameAsOldPassword(String newPass, String oldPass) {
        if (newPass.equals(oldPass)) return true;
        return false;
    }


}
