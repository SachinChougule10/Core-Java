/*
 * DICE ROLLER PROGRAM 🎲
 *
 * This program allows the user to enter how many dice they want to roll.
 * For each die:
 *   - A random value between 1 and 6 is generated
 *   - The value is printed as a number
 *   - An ASCII dice shape is displayed
 *
 * After rolling all dice, the total sum of all dice rolls is displayed.
 *
 * Concepts Demonstrated:
 *   - Methods
 *   - Random number generation
 *   - ASCII art using multiline strings
 *   - Loops and input validation
 */

package D_Methods;

import java.util.Scanner;
import java.util.Random;

public class D05_DiceRollerProgram {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int noOfDice;
        int total = 0;

        System.out.print("Enter the no.of dice to roll: ");
        noOfDice = scanner.nextInt();

        if(noOfDice > 0){

            for(int i = 0; i < noOfDice; i++){

                int roll = random.nextInt(1,7);
                System.out.printf("\nYou rolled: %d\n",roll);
                printDie(roll);
                total += roll;
            }

            System.out.println("Total: "+total);

        }
        else{
            System.out.println("No of dice cannot be negative!");
        }


        scanner.close();

    }

    static void printDie(int roll){

        String dice1 = """                                                                  
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;
        // multiline string

        String dice2 = """
                 -------
                |  ●    |
                |       |
                |    ●  |
                 -------
                """;
        String dice3 = """
                 -------
                |  ●    |
                |   ●   |
                |    ●  |
                 -------
                """;

        String dice4 = """
                 -------
                |  ●  ● |
                |       |
                |  ●  ● |
                 -------
                """;

        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;
        String dice6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;

        switch (roll){

            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid Choice!");
        }

    }
}


// FLOW OF PROGRAM :-
// 1. Declare variable
// 2. Get number of dice from the user
// 3. Check if no.of dice < 0
// 4. Roll all the dice
// 5. Get the total
// 6. Display ASCII of dice
