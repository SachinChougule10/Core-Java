/*
 * This program demonstrates the use of a do-while loop.
 *
 * The user is repeatedly asked to enter a number between 1 and 10.
 * A do-while loop is used to ensure that the code inside the loop
 * executes at least once before the condition is checked.
 *
 * Key concepts demonstrated:
 * - do-while loop behavior (runs at least once)
 * - Scanner input handling
 * - Input validation using logical OR (||)
 *
 * A commented alternative version using a standard while loop
 * is included at the bottom for comparison.
 */

package C_Loops;

import java.util.Scanner;

public class C03_DoWhileLoop {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int number;

        do{
            System.out.print("Enter a number between 1-10: ");
            number = scanner.nextInt();
        } while(number < 0 || number > 10);

        System.out.println("You picked number: "+number);
    }
}



//     do while loop :- In standard while loop, we may not enter the while loop at all, if the condition is false,
//                      but with do-while loop we always do this code at least once and then check condition at the end.


/*

----- SAME CODE EXECUTED USING 'WHILE LOOP' :-

import java.util.Scanner;

public class C_Loops.do_while_loop {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int number;
        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        while(number < 1 || number > 10){
            System.out.print("Enter a number between 1 and 10: ");
            number = scanner.nextInt();
        }

        System.out.println("You picked number: "+number);

        scanner.close();


    }
}
 */
