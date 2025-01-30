import java.util.Random;
import java.util.Scanner;

public class NumberGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Number Generator!");

        // Get the range from the user
        System.out.print("Enter the lower bound of the range: ");
        int lowerBound = scanner.nextInt();

        System.out.print("Enter the upper bound of the range: ");
        int upperBound = scanner.nextInt();

        // Validate the range
        if (lowerBound >= upperBound) {
            System.out.println("Invalid range. The lower bound must be less than the upper bound.");
            scanner.close();
            return;
        }

        // Get the number of random numbers to generate
        System.out.print("How many random numbers would you like to generate? ");
        int numberOfRandomNumbers = scanner.nextInt();

        // Generate and display the random numbers
        System.out.println("\nGenerated random numbers:");
        for (int i = 0; i < numberOfRandomNumbers; i++) {
            int randomNumber = lowerBound + random.nextInt(upperBound - lowerBound + 1);
            System.out.println(randomNumber);
        }

        scanner.close();
    }
}