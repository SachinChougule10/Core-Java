/*
 * This program asks the user how many times they want to loop.
 * It then prints numbers from 1 up to the number entered by the user.
 *
 * Example:
 * Input: 5
 * Output:
 * 1
 * 2
 * 3
 * 4
 * 5
 *
 * Demonstrates:
 * - Using Scanner for user input
 * - Using a for loop with user-defined limit
 */

package C_Loops;

import java.util.Scanner;

public class C02a_ForLoopExample1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many times you want to loop: ");
        int max = scanner.nextInt();

        for(int i = 1; i <= max; i++){
            System.out.println(i);
        }

        scanner.close();
    }
}

