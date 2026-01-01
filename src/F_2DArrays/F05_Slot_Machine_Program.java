/**
 * This program simulates a simple console-based slot machine game.
 * The player starts with an initial balance and places bets on each round.

 * For every spin:
 *  - Three random symbols are generated
 *  - The symbols are displayed in a slot-machine style format
 *  - Winnings are calculated based on matching symbols
 *  - The player's balance is updated accordingly

 * The game continues until the player chooses to stop or the balance reaches zero.

 * Key Concepts Demonstrated:
 *  - Arrays for storing symbols and results
 *  - Methods to break logic into reusable parts
 *  - Random number generation
 *  - Loops and conditional logic
 *  - Switch expressions for payout calculation
 *  - String comparison and user input handling
 */


package F_2DArrays;

import java.util.Scanner;
import java.util.Random;

public class F05_Slot_Machine_Program {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int balance = 10;   // Initial player balance
        int bet;            // Bet amount entered by user
        int payout;         // Amount won after each spin
        String[] row;       // Stores the result of a slot spin
        String playAgain;   // User choice to continue or stop

        System.out.println("----------------------------");
        System.out.println("WELCOME TO JAVA SLOT MACHINE");
        System.out.println("Symbols : 🍒,⭐,🍉,🍋,🔔");
        System.out.println("----------------------------");

        // Game runs until balance becomes zero or user exits
        while(balance > 0){

            System.out.println("Your current balance is: $"+balance);
            System.out.print("Enter the amount you want to bet: ");
            bet = scanner.nextInt();
            scanner.nextLine();                 // Consume leftover newline

            // Validate bet amount
            if(bet > balance){
                System.out.println("INSUFFICIENT FUNDS!");
                continue;
            }
            else if(bet < 0){
                System.out.println("Bet amount cannot be less than zero!");
                continue;
            }

            // Deduct bet from balance
            else{
                balance-=bet;
            }

            System.out.println("Spinning.......");
            row = spinRow();                    // Generate random symbols
            printRow(row);                      // Display slot row
            payout = getPayout(row,bet);        // Calculate winnings

            // Update balance based on payout
            if(payout > 0){
                System.out.println("You won $ "+payout);
                balance+=payout;
            }
            else{
                System.out.println("Sorry! You lost this round");
            }

            // Ask user whether to continue
            System.out.print("Do you want to play again?(Y/N): ");
            playAgain = scanner.nextLine().toUpperCase();

            if(!playAgain.equals("Y")){
                break;
            }

        }

        // Game end message
        System.out.println("\nGAME OVER!\nYour final balance is: $"+ balance);

        scanner.close();
    }

    // Generates a random row of 3 symbols for the slot machine
    static String[] spinRow(){

        String[] symbols = {"🍒","⭐","🍉","🍋","🔔"};           // Available symbols
        String[] rows = new String[3];                            // Slot row

        Random random = new Random();

        // Randomly select 3 symbols
        for(int i = 0; i < 3; i++){
            rows[i] = symbols[random.nextInt(symbols.length)];
        }

        return rows;

    }

    // Prints the slot row in a formatted manner.
    static void printRow(String[] row){

        System.out.println("-------------");
        System.out.println(String.join(" | ", row));        // Join symbols with separator
        System.out.println("-------------");
    }

    // Calculates payout based on matching symbols.
    static int getPayout(String[] row, int bet){

        // All three symbols match
        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch(row[0]){                                      // as all these elements will be same, we need to examine any one element in the switch statement
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🍋" -> bet * 5;
                case "🔔" -> bet * 10;
                case "⭐" -> bet * 20;
                default -> 0;
            };
        }
        // First two symbols match
        else if(row[0].equals(row[1])){
            return switch(row[0]){                                      // as these two elements will be same we need to examine any one of these elements
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }
        // Last two symbols match
        else if(row[1].equals(row[2])){
            return switch(row[1]){                                      // as these two elements will be same we need to examine any one of these elements
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }

        return 0;               // No matching symbols
    }
}


/*

    WORKFLOW OF THE PROGRAM :-
        1) Declare A_Basics.variables
        2) Display welcome message
        3) Play if balance > 0
        4) Enter bet amount
            - verify if bet < balance
            - verify if bet > 0
            - then, subtract bet from balance
        5) Spin row
        6) Print row
        7) Get payout
        8) Ask to play again
        9) Display Exit message



    String.join() Method :-

        - String.join() is a static method in Java that is used to concatenate (join together) elements of a String array (or any Iterable) into one single string,
          using a specified delimiter between each element.

        - Syntax :- 'String.join(delimiter, elements)'
                      - delimiter – the string that will appear between each element (e.g., ",", " | ", "-", etc.).
                      - elements – the strings (like from a String[] array) to be joined.


        - After using String.join(delimiter, elements), all elements are combined into one single String with the delimiter placed between them.

 */
