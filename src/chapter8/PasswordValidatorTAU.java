package chapter8;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PasswordValidatorTAU {
    private String username;
    private String currentPassword;

    private boolean valid;
    private String errorMessage;
    private static Scanner scanner = new Scanner(System.in);

    public PasswordValidatorTAU(String username, String currentPassword){
        this.username = username;
        this.currentPassword = currentPassword;
    }

    public boolean isValid(){
        return valid;
    }

    public String getErrorMessage(){
        return  errorMessage;
    }

    public void closeScanner(){
        scanner.close();
    }

    public static void main(String[] args){
        var validator = login();
        validator.printPasswordRules();

        do{
            var proposedPassword = validator.getProposedPassword();
            validator.changePassword(proposedPassword);

            if(!validator.isValid()){
                System.out.println(validator.getErrorMessage());
            }
        }while(!validator.isValid());

        System.out.println("The proposed password is valid");
        validator.closeScanner();
    }

    public static PasswordValidatorTAU login(){
        System.out.println("Enter your username: ");
        String username = scanner.nextLine();

        System.out.println("Enter your password: ");
        String password = scanner.nextLine();

        return new PasswordValidatorTAU(username, password);
    }

    public void printPasswordRules(){
        System.out.println("Your new Password must meet the following requirements: ");
        System.out.println("* at least 8 character characters long");
        System.out.println("* contain an uppercase letter");
        System.out.println("* contains a special character");
        System.out.println("* not contain the username");
        System.out.println("* not the same as the old password");
        System.out.println();
    }
    public String getProposedPassword(){
        System.out.println("Enter your new password: ");
        return scanner.nextLine();

    }
    public void changePassword(String newPassword){
        valid = true;
        errorMessage = "";

        if(newPassword.equals(newPassword.toLowerCase())){
            valid = false;
            errorMessage += "\n Your password must include an uppercase letter.";
        }
        if(newPassword.matches("[a-zA-Z0-9]*")){
            valid = false;
            errorMessage +="\n Your password must include a special character (e.g.%,$[:).";
        }
        if(newPassword.toUpperCase().contains((username.toUpperCase()))){
            valid = false;
            errorMessage +="\n Your password cannot contain your username.";
        }
        if(newPassword.equals(currentPassword)){
            valid = false;
            errorMessage += "\n Your password must be different from your current password";
        }
    }
}
