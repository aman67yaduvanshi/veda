
import java.util.*;

public class NumberGuessingGame {

    static final int MIN = 1;
    static final int MAX = 100;


    static int generateNumber() {
        Random random = new Random();
        return random.nextInt(MAX - MIN + 1) + MIN;
    }


    static int readGuess(Scanner sc) {
        while (true) {
            System.out.print("Enter your guess (" + MIN + "-" + MAX + "): ");
            if (!sc.hasNextInt()) {
                System.out.println("  Invalid input! Please enter a whole number.");
                sc.next();
                continue;
            }
            int guess = sc.nextInt();
            if (guess < MIN || guess > MAX) {
                System.out.println("  Out of range! Guess a no. between " + MIN + " and " + MAX + ".");
            } else {
                return guess;
            }
        }
    }


    static int playRound(Scanner sc) {
        int secret = generateNumber();
        int attempts = 0;
        boolean guessed = false;

        System.out.println("\nI have picked a number between " + MIN + " and " + MAX + ". Can you guess it?");

        while (!guessed) {
            int guess = readGuess(sc);
            attempts++;

            if (guess == secret) {
                guessed = true;
                System.out.println("Correct! You guessed the number " + secret + " in " + attempts + " attempt(s).");
            } else if (guess < secret) {
                System.out.println("  Too low! Try a higher number.");
            } else {
                System.out.println("  Too high! Try a lower number.");
            }
        }
        return attempts;
    }

    // another round??
    static boolean playAgain(Scanner sc) {
        while (true) {
            System.out.print("\nPlay again? (y/n): ");
            String answer = sc.next().trim().toLowerCase();
            if (answer.equals("y") || answer.equals("yes")) {
                return true;
            } else if (answer.equals("n") || answer.equals("no")) {
                return false;
            }
            System.out.println("  Please enter y or n.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bestScore = 0;

        System.out.println("===== Number Guessing Game ~ Aman =====");

        do {
            int attempts = playRound(sc);
            if (bestScore == 0 || attempts < bestScore) {
                bestScore = attempts;
            }
            System.out.println("Best score so far: " + bestScore + " attempt(s)");
        } while (playAgain(sc));

        System.out.println("\nThanks for playing!");
        sc.close();
    }
}
