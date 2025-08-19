package chapter9;

public class Cake {
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public double setPrice(double price) {
       return this.price = price;
    }

    public  String  flavor;
    public double price;

    public Cake(String flavor){
        this.flavor = flavor;
    }
}
