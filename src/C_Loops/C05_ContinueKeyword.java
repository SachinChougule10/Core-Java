/*
 * This program demonstrates the use of the 'break' keyword inside a loop.
 *
 * The for-loop counts from 1 to 10, but when the value reaches 5,
 * the 'break' statement is executed, which immediately stops the loop.
 *
 * Key concepts demonstrated:
 * - Using 'break' to exit a loop prematurely
 * - Loop control flow
 */

package C_Loops;

public class C05_ContinueKeyword {
    public static void main(String[] args){

        for(int i = 1; i <= 10; i++){
            if(i == 5){
                continue;
            }

            System.out.print(i+ " ");
        }
    }
}


// continue :- skip current iteration of a loop (SKIP)