/*
 * Number Guessing Game
 * --------------------
 * This program demonstrates the use of loops, user input, and random number generation.

 * Game Logic:
 *  - The computer randomly selects a number between a given range (1–100).
 *  - The user keeps guessing the number.
 *  - After each guess, the program provides feedback:
 *        * "TOO LOW!"   → guess is smaller than the number
 *        * "TOO HIGH!"  → guess is larger than the number
 *  - The loop continues until the user guesses the correct number.
 *  - The program then displays the correct number and total number of attempts.

 * Concepts Demonstrated:
 *  - do-while loop
 *  - Random number generation
 *  - User input handling
 *  - Conditional logic
 */
package C_Loops;

import java.util.Scanner;
import java.util.Random;

public class C07_NumberGuessingGame {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int guess;
        int attempts=0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min,max+1);

        System.out.println("NUMBER GUESSING GAME");
        System.out.printf("Guess a number between %d - %d: \n",min,max);

        do{
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts ++;

            if (guess < randomNumber){
                System.out.println("TOO LOW! Try again!");
            }
            else if(guess > randomNumber){
                System.out.println("TOO HIGH! Try again!");
            }
            else{
                System.out.println("CORRECT GUESS! Number was: "+randomNumber);
                System.out.println("No.of attempts: "+attempts);
            }


        }while (guess != randomNumber);

        scanner.close();
    }
}
