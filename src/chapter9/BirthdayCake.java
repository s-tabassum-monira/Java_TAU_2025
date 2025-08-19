package chapter9;

public class BirthdayCake extends Cake{
    public String getCandles() {
        return candles;
    }

    public void setCandles(String candles) {
        this.candles = candles;
    }

    public String candles;
    public BirthdayCake(String flavor) {
        super(flavor);
        System.out.println("The birthday cake's flavor is: " + flavor);
    }
}
