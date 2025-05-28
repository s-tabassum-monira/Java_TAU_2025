package chapter14;

import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;

public class CoinTossGame {
    public static void main(String[] args) {
        Coin coinFlip = new Coin();
        Player player1 = new Player("Upoma");
        Player player2 = new Player("Aliza");

        String FirstPlayer = player1.getName();
        String SecondPlayer = player2.getName();

        System.out.println(FirstPlayer + " , what is your guess heads or tail? ");
        Scanner scanner = new Scanner(System.in);
        String guessWhat = scanner.next();
        String autoGuess;

        String player1Guessed;
        String player2Got;


        while (!guessWhat.equalsIgnoreCase(Coin.HEAD) && !guessWhat.equalsIgnoreCase(Coin.TAIL) ) {
            System.out.println("Invalid guess." + FirstPlayer + "Please guess in between 'Head' OR 'Tail'");
            guessWhat = scanner.next();
        }

        scanner.close();

        if (guessWhat.equals(Coin.HEAD)) {

            player1.setGuess(guessWhat);
            player1Guessed = player1.getGuess();
            System.out.println(FirstPlayer + ", you guessed " + player1Guessed);
            autoGuess = Coin.TAIL;
            player2.setGuess(autoGuess);
            player2Got = player2.getGuess();
            System.out.println(SecondPlayer + ", you get: " + player2Got);


        } else {

            player1.setGuess(guessWhat);
            player1Guessed = player1.getGuess();
            System.out.println(FirstPlayer + ", you guessed" + player1Guessed);
            autoGuess = Coin.HEAD;
            player2.setGuess(autoGuess);
            player2Got = player2.getGuess();
            System.out.println(SecondPlayer + ", you get: " + player2Got);
        }


        System.out.println("Let's flip the coin. Shall We?");

        String FlippedResult = coinFlip.flip(player1Guessed, player2Got);

        if (Objects.equals(FlippedResult, Coin.HEAD) && Objects.equals(player1Guessed, Coin.HEAD)) {
            System.out.println("The result is " + Coin.HEAD + " and " + FirstPlayer + ", you guessed " + Coin.HEAD);
            System.out.println(FirstPlayer + ", you won");
            System.out.println(SecondPlayer + ", you lose");
        } else if (Objects.equals(FlippedResult, Coin.HEAD) && Objects.equals(player1Guessed, Coin.TAIL)) {
            System.out.println("The result is " + Coin.HEAD + " and " + FirstPlayer + ", you guessed " + Coin.TAIL);
            System.out.println(FirstPlayer + ", you lose");
            System.out.println(SecondPlayer + ", you won");
        } else if (Objects.equals(FlippedResult, Coin.TAIL) && Objects.equals(player1Guessed, Coin.TAIL)) {
            System.out.println("The result is " + Coin.TAIL + " and " + FirstPlayer + ", you guessed " + Coin.TAIL);
            System.out.println(FirstPlayer + ", you won");
            System.out.println(SecondPlayer + ", you lose");
        } else {
            System.out.println("The result is " + Coin.TAIL + " and " + FirstPlayer + ", you guessed " + Coin.HEAD);
            System.out.println(FirstPlayer + ", you lose");
            System.out.println(SecondPlayer + ", you won");
        }


    }
}
