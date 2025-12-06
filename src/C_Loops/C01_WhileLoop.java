/*
 While Loop Example – Preventing Empty User Input
 ------------------------------------------------
 This program demonstrates how a while loop works in Java.

 Key ideas:
 1. A while loop repeats a block of code as long as a condition is true.
 2. Here, the loop keeps asking the user to enter their name until
    a non-empty input is provided.
 3. This prevents the user from skipping the prompt (unlike an if-statement,
    which checks the condition only once).
 4. Also explains the concept of infinite loops — when a loop's condition
    never becomes false.

 This example shows a practical use case where while loops ensure valid input.
*/

package C_Loops;

import java.util.Scanner;

public class C01_WhileLoop {
    public static void main(String[] args){

        // while loop :- repeats some code while some condition is true
        // At the end of the while loop, we go to the beginning of the while loop tochack whether the condition is true or false,
        // if true we will continue the while loop and if it is false we will escape the while loop

        Scanner scanner = new Scanner(System.in);

        String name = "";

       /* if(name.isEmpty()){
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        }
        System.out.println("Hello! "+name);


        Note:- This program will work, but what if I don't enter a name, it will still execute and print Hello!,
               but name will not be printed as we have not provided a name and program will end.
              - To prevent this, i.e. prevent users from skipping prompts we will use 'while loops'.

        */

        while(name.isEmpty()){
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello! "+name);

        // here we will prompt the user the same prompt until he enters his name, once he enters his name we will escape the while loop.


    }
}


// Infinite loop :- With our while loop, if we have a condition that we can't change within the loop, is called a Infinite loop.
// If we don't update a variable we will get stuck in an infinite loop