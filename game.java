
import java.util.Scanner;

/**
 * The Guesser class allows the guesser to enter a secret number.
 */
class Guesser {

    int guessNum;

    /**
     * Takes input from the guesser.
     * 
     * @return the number guessed by the guesser
     */
    int guessNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guesser, please guess a number:");
        guessNum = sc.nextInt();
        return guessNum;
    }
}

/**
 * The Player class allows a player to guess the number.
 */
class Player {

    int playerGuess;

    /**
     * Takes input from the player.
     * 
     * @return the number guessed by the player
     */
    int guessNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Player, please guess the number:");
        playerGuess = sc.nextInt();
        return playerGuess;
    }
}

/**
 * The Umpire class manages the game logic.
 * It collects guesses and decides the winner.
 */
class Umpire {

    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    /**
     * Collects the number from the Guesser.
     */
    void collectNumFromGuesser() {
        Guesser g = new Guesser();
        numFromGuesser = g.guessNumber();
    }

    /**
     * Collects guesses from all players.
     */
    void collectNumFromPlayers() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        numFromPlayer1 = p1.guessNumber();
        numFromPlayer2 = p2.guessNumber();
        numFromPlayer3 = p3.guessNumber();
    }

    /**
     * Compares the guesses and declares the winner.
     */
    void compare() {

        if (numFromGuesser == numFromPlayer1)
            System.out.println("Player 1 wins!");

        if (numFromGuesser == numFromPlayer2)
            System.out.println("Player 2 wins!");

        if (numFromGuesser == numFromPlayer3)
            System.out.println("Player 3 wins!");

        if (numFromGuesser != numFromPlayer1 &&
            numFromGuesser != numFromPlayer2 &&
            numFromGuesser != numFromPlayer3)
            System.out.println("Game lost! No player guessed correctly.");
    }
}

/**
 * Main class to start the Guesser Game.
 */
public class game {

    /**
     * Main method where the program execution starts.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {

        Umpire u = new Umpire();

        u.collectNumFromGuesser();
        u.collectNumFromPlayers();
        u.compare();
    }
}