/*
 * A7_Shopping_Cart_Program
 * Demonstrates:
 *  - Taking user input (String, int, double)
 *  - Basic arithmetic operation (total = price * quantity)
 *  - String concatenation
 *  - Using Scanner class
 */

package A_Basics;

import java.util.Scanner;

public class A7_Shopping_Cart_Program {
    public static void main(String[] args){

       Scanner scanner = new Scanner(System.in);

       String item;
       int quantity;
       double price;
       char currency = '$';
       double total;

        // Ask for item name
        System.out.print("What would you like to buy?: ");
        item = scanner.nextLine();

        // Ask for price
        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();

        // Ask for quantity
        System.out.print("How many would you like?: ");
        quantity = scanner.nextInt();

        // Calculate total cost
        total = price * quantity;

        System.out.println("\nYou have brought "+ quantity + " " + item + "/s.");
        System.out.println("Your total is: " + total + currency);


       scanner.close();
    }
}
