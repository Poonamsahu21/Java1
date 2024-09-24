package internship;

import java.util.Random;
import java.util.Scanner;
public class PasswordGenerator {
    public static String generatePassword(int length, boolean includeUppercase, boolean includeLowercase, boolean includeNumbers, boolean includeSpecialChars) {
        StringBuilder password = new StringBuilder(length);
        Random random = new Random();

        String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialCharacters = "!@#$%^&*()-_=+<>?";

        // Construct a pool of characters based on user preferences
        String characterPool = "";
        if (includeUppercase) {
            characterPool += upperCaseLetters;
        }
        if (includeLowercase) {
            characterPool += lowerCaseLetters;
        }
        if (includeNumbers) {
            characterPool += numbers;
        }
        if (includeSpecialChars) {
            characterPool += specialCharacters;
        }
        // Ensure at least one type of character is selected
        if (characterPool.isEmpty()) {
            throw new IllegalArgumentException("At least one type of character must be selected.");
        }

        // Generate the random password
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characterPool.length());
            password.append(characterPool.charAt(randomIndex));
        }

        return password.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for password length
        System.out.print("Enter the desired password length: ");
        int length = scanner.nextInt();

        // Ask user about password complexity
        System.out.println("Do you want to include uppercase letters? (yes/no)");
        boolean includeUppercase = scanner.next().equalsIgnoreCase("yes");

        System.out.println("Do you want to include lowercase letters? (yes/no)");
        boolean includeLowercase = scanner.next().equalsIgnoreCase("yes");

        System.out.println("Do you want to include numbers? (yes/no)");
        boolean includeNumbers = scanner.next().equalsIgnoreCase("yes");

        System.out.println("Do you want to include special characters? (yes/no)");
        boolean includeSpecialChars = scanner.next().equalsIgnoreCase("yes");

        // Generate and display the password
        try {
            String password = generatePassword(length, includeUppercase, includeLowercase, includeNumbers, includeSpecialChars);
            System.out.println("Generated Password: " + password);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
