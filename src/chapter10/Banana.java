package chapter10;

public class Banana extends Fruit{
    public static void peel(){
        System.out.println("Peel banana. Peel Peel banana");
    }

    public Banana(int calories){
        calories = 12;

    }

    @Override
    public void makeJuice(){
        System.out.println("Can't make banana juice. How about banana milk shake?");
    }


}
