package internship;

import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        // Create a Random object to generate a random number between 1 and 100
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1; // Generates a number between 1 and 100

        Scanner scanner = new Scanner(System.in);
        int userGuess = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");

        // Loop until the user guesses the correct number
        while (userGuess != targetNumber) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();

            if (userGuess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the correct number.");
            }
            if (userGuess == targetNumber){
                return;
            }
        }

        scanner.close();
    }
}

