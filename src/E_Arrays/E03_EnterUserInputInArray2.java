/**
 * This program allows the user to:
 *  - Specify the size of a String array at runtime
 *  - Enter values into the array using a loop
 *  - Display all stored values using an enhanced for-loop

 * Key Concepts Demonstrated:
 *  - Dynamic array creation using user input
 *  - Using Scanner for mixed input (nextInt + nextLine)
 *  - Iterating over arrays using for-loop and for-each loop
 */


package E_Arrays;

import java.util.Scanner;

public class E03_EnterUserInputInArray2 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int sizeOfArray = scanner.nextInt();
        scanner.nextLine();             // clears the newline buffer

        String[] places = new String[sizeOfArray];

        for (int i = 0; i < places.length; i++){
            System.out.println("Enter a name of place you want to visit: ");
            places[i] = scanner.nextLine();
        }

        for(String j : places){
            System.out.println(j);
        }

        scanner.close();

    }
}
