/*
 While Loop Example – Exit Condition Using User Input
 ----------------------------------------------------
 This program demonstrates how a while loop can be used to keep a process
 running until the user decides to quit.

 Logic:
 1. The loop continues as long as the user does NOT type 'Q'.
 2. Each iteration displays a message and asks the user to press 'Q' to exit.
 3. User input is converted to uppercase to make the check case-insensitive.
 4. Once the user presses 'Q', the loop ends and the program exits gracefully.

 This is a common pattern used in games, menus, and long-running processes.
*/

package C_Loops;

import java.util.Scanner;

public class C01a_WhileLoopExample1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String response = "";

        while (!response.contains("Q")){
            System.out.println("You are playing a game.");
            System.out.print("Press 'Q' to exit: ");
            response = scanner.nextLine().toUpperCase();
        }

        System.out.println("You have quit the game!");

        scanner.close();
    }
}
