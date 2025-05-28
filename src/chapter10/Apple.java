package chapter10;

public class Apple extends Fruit {
    public void removeSeeds(){
        System.out.println("Seed should be removed before eating apple");
    }

    @Override
    public void makeJuice(){
        System.out.println("This is apple juice");
    }

    public Apple(int calories){
        calories = 10;

    }
}
