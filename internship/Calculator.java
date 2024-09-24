package internship;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Display options to the user
        System.out.println("Basic Calculator");
        System.out.println("----------------");
        System.out.println("Choose an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Enter your choice (1/2/3/4): ");

        // Take the user's choice
        int choice = scanner.nextInt();

        // Input validation
        if (choice < 1 || choice > 4) {
            System.out.println("Invalid choice! Please choose a valid operation.");
            return;
        }

        // Take the numbers as input
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Perform the chosen operation
        double result = 0;
        switch (choice) {
            case 1: // Addition
                result = num1 + num2;
                System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                break;
            case 2: // Subtraction
                result = num1 - num2;
                System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                break;
            case 3: // Multiplication
                result = num1 * num2;
                System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                break;
            case 4: // Division
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                }
                break;
        }

        // Close the scanner
        scanner.close();
    }
}

