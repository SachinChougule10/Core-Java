/*
 * This program demonstrates the concept of nested loops in Java.
 *
 * The outer loop runs 3 times, and for each iteration of the outer loop,
 * the inner loop prints the numbers 1 through 10.
 *
 * Key concepts demonstrated:
 * - Nested loops (a loop inside another loop)
 * - How inner loops execute fully for each outer loop iteration
 * - Useful for patterns, matrices, and many DSA problems
 */

package C_Loops;

public class C06_NestedLoopsExample1 {
    public static void main(String[] args){

        for(int i = 1; i <=3; i++){
            for(int j = 1; j <=10; j++){
                System.out.print(j+ " ");
            }

            System.out.println();
        }
    }
}


// nested loops :- A loop inside another loop.
//                 Used often with matrices or DSA.