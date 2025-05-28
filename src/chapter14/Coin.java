package chapter14;

import java.util.Objects;
import java.util.Random;

public class Coin {
    private String side;
    public  static final String HEAD = "Head";
    public  static final String TAIL = "Tail";

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }



    public String flip(String head, String tail){

        Random chooseSide = new Random();
        String sideTossed = chooseSide.nextBoolean() ? head : tail;

        if (Objects.equals(sideTossed, Coin.HEAD)) {
            setSide(HEAD);
        }
        else{
            setSide(TAIL);
        }

        return getSide();

    }

}
