/*
 * This program simulates a simple banking system using methods.
 *
 * Features:
 *  - Show current balance
 *  - Deposit money
 *  - Withdraw money with validation
 *  - Menu-driven loop using methods
 *
 * Key Concepts Demonstrated:
 *  - Method usage and return values
 *  - Passing parameters to methods
 *  - Using a static Scanner so all methods can access user input
 *  - While-loop based menu system
 */

package D_Methods;

import java.util.Scanner;

public class D04_BankingProgram {

    static Scanner scanner = new Scanner(System.in);        // we use static so that every static method can use it

    public static void main (String[] args){


        double balance = 0;
        boolean isRunning = true;
        int choice;

        while(isRunning){

            System.out.println("****************");
            System.out.println("BANKING PROGRAM");
            System.out.println("****************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("****************");

            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice){
                case 1 -> showBalance(balance);
                case 2 -> balance = balance + deposit();
                case 3 -> balance = balance - withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE!");
            }
        }

        System.out.println("Thankyou! Have a nice day!");

        scanner.close();

    }

    static void showBalance(double balance){
        System.out.printf("Your bank balance is: $%.2f\n",balance );
    }

    static double deposit(){

        double amount;
        System.out.print("Enter the amount you want to deposit: ");
        amount = scanner.nextDouble();

        // We can access `scanner` here because it is declared as `static` at the class level.
        // Static methods (like deposit()) cannot directly access non-static variables.
        // If `scanner` were non-static, this method would NOT be aware of it, since it is defined outside this method (in main or at class level).

        // In that case, we would have to create an object of this class like:
        // D04_BankingProgram obj = new D04_BankingProgram() and then access it using: obj.scanner

        // Declaring `scanner` as static allows all static methods
        // to share a single Scanner instance without creating objects repeatedly.

        if(amount < 0){
            System.out.println("Amount cannot be negative!");
            return 0;
        }
        else{
            return amount;
        }
    }

    static double withdraw(double balance){

        System.out.print("Enter the amount you want to withdraw: ");
        double amount = scanner.nextDouble();

        if(amount > balance){
            System.out.println("INSUFFICIENT FUNDS!");
            return 0;
        }
        else if(amount < 0){
            System.out.println("Amount can't be negative!");
            return 0;
        }
        else{
            return amount;
        }

    }
}




// FLOW OF PROGRAM :-

// Declare A_Basics.variables
// Display Menu
// Get and process users choice
// showBalance()
// deposit()
// withdraw()
// Exit message
