import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int totalScore = 0;
        int roundsPlayed = 0;

        while (true) {
            roundsPlayed++;
            int numberToGuess = random.nextInt(100) + 1; // Generates a number between 1 and 100
            int attempts = 0;
            int maxAttempts = 7;
            boolean guessedCorrectly = false;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I'm thinking of a number between 1 and 100. You have " + maxAttempts + " attempts to guess it.");

            while (attempts < maxAttempts && !guessedCorrectly) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess < numberToGuess) {
                    System.out.println("Too low!");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high!");
                } else {
                    guessedCorrectly = true;
                    System.out.println("Congratulations! You've guessed the number " + numberToGuess + " in " + attempts + " attempts.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you've used all " + maxAttempts + " attempts. The number was " + numberToGuess + ".");
            }

            totalScore += Math.max(0, 10 - attempts); // Scoring: 10 points minus the number of attempts
            System.out.println("Your current score is: " + totalScore);

            System.out.print("Would you like to play again? (yes/no): ");
            String playAgain = scanner.next().trim().toLowerCase();
            if (!playAgain.equals("yes")) {
                break;
            }
        }

        System.out.println("Thank you for playing! You played " + roundsPlayed + " rounds with a total score of " + totalScore + ".");
        scanner.close();
    }
}


















































































