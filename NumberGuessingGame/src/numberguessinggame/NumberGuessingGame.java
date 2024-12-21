/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numberguessinggame;

/**
 *
 * @author xps
 */
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // Initialize variables
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int generatedNumber = random.nextInt(100) + 1; // Generate a random number between 1 and 100
        int attempts = 0;
        int maxAttempts = 5; // Predefined limit for attempts
        boolean isGuessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("You have " + maxAttempts + " attempts to guess it. Good luck!");

        // Game loop
        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == generatedNumber) {
                System.out.println("Congratulations! You guessed the number correctly in " + attempts + " attempts.");
                isGuessedCorrectly = true;
                break;
            } else if (userGuess < generatedNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }

            System.out.println("Attempts remaining: " + (maxAttempts - attempts));
        }

        // If the user didn't guess correctly
        if (!isGuessedCorrectly) {
            System.out.println("Sorry! You've used all your attempts. The number was: " + generatedNumber);
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}

