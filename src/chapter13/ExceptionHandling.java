package chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        //createNewFile();
        numberExceptionHandling();
       // createNewFileRethrow();
    }

    public static void createNewFile() {
        File file = new File("resources/nonexistent.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            // throw new RuntimeException(e);
            System.out.println("Directory does not exist");
            e.printStackTrace();
        }
    }

    public static void createNewFileRethrow() throws IOException {
        File file = new File("resources/nonexistent.txt");

    }

    public static void numberExceptionHandling() {
        File file = new File("resources/numbers.txt");
//        Scanner fileReader = null;
        try (Scanner fileReader = new Scanner(file)) {
//            fileReader = new Scanner(file);
            while (fileReader.hasNext()) {
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        } catch (FileNotFoundException | InputMismatchException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        }
//        catch (InputMismatchException e) {
//            e.printStackTrace();
//
//        }
//        catch (Exception e) {
//
//        }

//        finally {
//            fileReader.close();
//        }


    }

    public static void calculateSalary(double hours, double rate) throws IllegalAccessException {
        if(hours > 40){
            throw new IllegalAccessException(("We do not allow overtime"));
        }
    }
}
