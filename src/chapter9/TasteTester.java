package chapter9;

public class TasteTester {
    public static void main(String[] args) {
        BirthdayCake bCake = new BirthdayCake("Chocolate");
        bCake.price = 3.99;
        double bCakePrice = bCake.price;
        System.out.println("Price of Birthday cake: " + bCakePrice);

        BirthdayCake wCake = new BirthdayCake("Vanilla");
        wCake.price = 4.99;
        double wCakePrice = wCake.price;
        System.out.println("Price of Birthday cake: " + wCakePrice);


    }
}
