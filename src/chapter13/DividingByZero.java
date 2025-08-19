package chapter13;

public class DividingByZero {
    public static void main(String[] args) {
        int numberGiven = 30;
        int divideNumbGiven = 0;



        divideByZeroExceptionHandeling(numberGiven,divideNumbGiven);

    }

    public static  void divideByZeroExceptionHandeling(int numberGiven, int dividendGiven){


        try{
            int value = numberGiven/dividendGiven;

        }

        catch(ArithmeticException e){
            System.out.println("Can't divide by zero");
            e.printStackTrace();

        }
        finally {
            System.out.println("Division is fun");
        }




    }


}
