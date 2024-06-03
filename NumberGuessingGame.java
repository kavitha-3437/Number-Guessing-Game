import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;
        int maxRange = 100;
        int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
        int maxAttempts = 5;
        int attempts = 0;

        System.out.println("Welcome to Guess Number Game");
        System.out.println("You Will Be Asked To Guess A Number To Win The Game");
        System.out.println("You have Maximum " + maxAttempts + " Attempt Limit");
        System.out.println("Enter a guess number between " + minRange + " to " + maxRange);

        while (attempts < maxAttempts) {
            System.out.print("Enter a guess number: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess < targetNumber) {
                System.out.println("Your Guess Number is Smaller.");
            } else if (guess > targetNumber) {
                System.out.println("Your Guess Number is Greater.");
            } else {
                System.out.println("OohhOO!, Your Number is Correct. You Win the Game!");
                return;
            }
        }

        System.out.println("Sorry, you've run out of attempts! The number I was thinking of was " + targetNumber + ".");
    }
}
