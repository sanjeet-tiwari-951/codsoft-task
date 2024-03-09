import java.util.*;
public class Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int lowerBound = 1;
        int upperBound = 100;
        int numberToGuess = rand.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int numberOfTries = 0;
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between " + lowerBound + " and " + upperBound + ".");
        while (true) {
            System.out.print("Guess the number: ");
            int userGuess = input.nextInt();
            numberOfTries++;
            if (userGuess == numberToGuess) {
                System.out.println("Congratulations! You guessed the number in " + numberOfTries + " tries.");
                break;
            } else if (userGuess < numberToGuess) {
                System.out.println("Try a higher number.");
            } else {
                System.out.println("Try a lower number.");
            }
        }
        input.close();
    }
}