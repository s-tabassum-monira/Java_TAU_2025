package chapter10;

public class Market {
    public static void main(String[] args) {
        Apple apple1 = new Apple(30);
        apple1.removeSeeds();
        apple1.makeJuice();
        throwGarbage(apple1);

        Fruit fr1 = new Apple(40);
        fr1.makeJuice();
        throwGarbage(fr1);

        fr1 = new Banana(49);
        fr1.makeJuice();
        ((Banana) fr1).peel();
        throwGarbage(fr1);

        
        



    }

    public static void throwGarbage(Fruit fruit){
        if(fruit instanceof Apple){
            System.out.println("Throw away apple seeds in the garbage please");
        }

        else if(fruit instanceof  Banana){
            System.out.println("Throw away banana peel in the garbage please");
        }
    }
}
