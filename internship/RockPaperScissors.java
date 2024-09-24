package internship;

import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors {
    // Method to get the computer's choice
    public static String getComputerChoice() {
        Random random = new Random();
        int choice = random.nextInt(3); // Generates a number between 0 and 2
        switch (choice) {
            case 0:
                return "rock";
            case 1:
                return "paper";
            case 2:
                return "scissors";
            default:
                return null; // Should never happen
        }
    }

    // Method to determine the winner
    public static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "It's a tie!";
        }
        switch (userChoice) {
            case "rock":
                return computerChoice.equals("scissors") ? "You win!" : "Computer wins!";
            case "paper":
                return computerChoice.equals("rock") ? "You win!" : "Computer wins!";
            case "scissors":
                return computerChoice.equals("paper") ? "You win!" : "Computer wins!";
            default:
                return "Invalid choice!";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userChoice;
        String computerChoice;
        String playAgain;

        System.out.println("Welcome to Rock, Paper, Scissors!");

        do {
            // User input
            System.out.print("Enter your choice (rock, paper, scissors): ");
            userChoice = scanner.nextLine().toLowerCase();

            // Computer's random choice
            computerChoice = getComputerChoice();
            System.out.println("Computer chose: " + computerChoice);

            // Determine and display the winner
            String result = determineWinner(userChoice, computerChoice);
            System.out.println(result);

            // Ask if the user wants to play again
            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();
        } while (playAgain.equals("yes"));

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
