/*
 * A11_compound_interest_calculator
 * Demonstrates:
 *  - Taking user input using Scanner
 *  - Using Math.pow()
 *  - Compound interest formula:
 *        A = P (1 + r/n)^(nt)
 */

package A_Basics;

import java.util.Scanner;

public class A11_compound_interest_calculator {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        // Input principal amount
        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        // Input interest rate
        System.out.print("Enter the interest amount (in %): ");
        rate = scanner.nextDouble() / 100;

        // Input number of times interest is compounded each year
        System.out.print("Enter the no.of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        // Input number of years
        System.out.print("Enter the no.of years: ");
        years = scanner.nextInt();

        // Compound interest formula
        amount = principal * Math.pow(1 + rate/timesCompounded, timesCompounded * years);

        System.out.printf("Final amount after %d years is: %.2f $", years,amount);

        scanner.close();
    }
}
