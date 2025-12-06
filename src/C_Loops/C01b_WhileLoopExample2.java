/*
 While Loop Example – Validating User Input (Age Check)
 -------------------------------------------------------
 This program demonstrates how a while loop is used to validate user input.

 Logic:
 1. The user is asked to enter their age.
 2. If the user enters a negative value, the while loop continues prompting
    them until a valid (non-negative) age is entered.
 3. Once a valid age is provided, the loop exits and the program prints it.

 This is a common validation pattern used in forms, sign-up processes,
 and any scenario requiring correct user input.
*/

package C_Loops;

import java.util.Scanner;

public class C01b_WhileLoopExample2 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int age = 0;
        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        while (age < 0){
            System.out.println("Age cannot be negative");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }

        System.out.println("Your are "+age + " years old.");

        scanner.close();
    }
}
