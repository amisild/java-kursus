package teinehomework;

import java.util.Scanner;
import java.util.Random;

public class homework02 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int numberToGuess = rand.nextInt(100001);
        String guess;
        int moneylost = -1;
        boolean isWon = false;

        System.out.println("Want to win a million dollars?");
        System.out.println("If so, guess the winning number (a number between 0 and 100,000");

        while (!isWon) {
            System.out.println("Insert $1.00 and enter your number or 'q' to quit:");
            guess = scanner.nextLine();
            moneylost++;

            if (guess.equals("q")) {
                System.out.println("You lost $" + moneylost + " . Thanks for playing. Come again!");
                break;
            } int numberguess = Integer.valueOf(guess);
                if (numberguess == numberToGuess) {
                    System.out.println("YOU WIN!");
                    isWon = true;
                } else {
                    System.out.println("Sorry, good guess, but not quite right. Do you want me to give you a hint (y/n)?");
                    guess = scanner.nextLine();

                    if (guess.equals("y")) {
                        moneylost = moneylost + 2;
                        if (numberguess < numberToGuess) {
                            System.out.println("Insert $2.00 for the hint!");
                            System.out.println("Your number is too low!");
                        } else {
                            System.out.println("Insert $2.00 for the hint!");
                            System.out.println("Your number is too high!");
                        }
                    }
                }

        }
    }
}