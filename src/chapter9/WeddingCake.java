package chapter9;

public class WeddingCake extends Cake{
    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }

    public int tiers;
    public WeddingCake(String flavor) {
        super(flavor);
        System.out.println("The wedding cake's flavor is:  " + flavor);
    }
}
