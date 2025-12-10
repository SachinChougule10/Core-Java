/*
 * This program demonstrates nested loops by generating a custom pattern.

 * The user enters:
 *  - Number of rows
 *  - Number of columns
 *  - A symbol to print

 * The outer loop prints each row.
 * The inner loop prints the symbol repeatedly for each column.

 * This is a common use-case of nested loops in pattern printing.
 */

package C_Loops;

import java.util.Scanner;

public class C06a_NestedLoopsExample2 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        char symbol;

        System.out.print("Enter the number of rows: ");
        rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        columns = scanner.nextInt();

        System.out.print("Enter the symbol you want to display: ");
        symbol = scanner.next().charAt(0);

        for(int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                System.out.print(symbol);
            }

            System.out.println();
        }

        scanner.close();

    }
}
