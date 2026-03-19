import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    static int generateGuess(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max - min + 1) + min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 1, max = 100;
        String feedback = "";

        System.out.println("Think of a number between 1 and 100, I will try to guess it.");

        while (!feedback.equalsIgnoreCase("correct")) {
            int guess = generateGuess(min, max);
            System.out.println("Is your number " + guess + "? (high/low/correct)");
            feedback = scanner.nextLine();

            if (feedback.equalsIgnoreCase("high")) {
                max = guess - 1;
            } else if (feedback.equalsIgnoreCase("low")) {
                min = guess + 1;
            } else if (!feedback.equalsIgnoreCase("correct")) {
                System.out.println("Invalid input. Please type high, low, or correct.");
            }
        }

        System.out.println("Hurray! I guessed your number.");
    }
}
