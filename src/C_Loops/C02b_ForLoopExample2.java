/*
 * This program performs a countdown starting from a number entered by the user.
 * It prints each number with a 1-second delay (1000 ms) using Thread.sleep().
 * When the countdown reaches zero, it prints "HAPPY NEW YEAR!".
 *
 * Demonstrates:
 * - Using Scanner to take user input
 * - Using a for loop with a decreasing counter
 * - Introducing delays using Thread.sleep()
 * - Basic countdown logic
 */

package C_Loops;

import java.util.Scanner;

public class C02b_ForLoopExample2 {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("From where do you want to start the counter: ");
        int start = scanner.nextInt();

        for (int i = start; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("HAPPY NEW YEAR!");

        scanner.close();
    }
}
