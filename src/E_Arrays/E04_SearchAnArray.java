/**
 * This program searches for a user-entered number in an integer array.
 * It iterates through the array and checks whether the target value exists.

 * If the number is found:
 *  - The index of the element is displayed

 * If the number is not found:
 *  - A message is shown indicating the element does not exist

 * Key Concepts Demonstrated:
 *  - Arrays
 *  - Linear search algorithm
 *  - for-loop traversal
 *  - Boolean flag usage
 *  - User input using Scanner
 */


package E_Arrays;

import java.util.Scanner;

public class E04_SearchAnArray {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int[] numbers = {3,8,5,4,1,6,7,2,9,10};
        boolean isFound = false;                    // Flag to track whether the target element is found

        // Taking the number to be searched from the user
        System.out.print("Enter a number between 1-10: ");
        int target = scanner.nextInt();

        for (int i = 0; i < numbers.length; i++){
            // Check if current array element matches the target
            if (numbers[i] == target){
                System.out.println("Target found at index: "+i);    // Target found, print its index
                isFound = true;       // Update flag since the element is found
                break;          // Exit loop early because search is complete
            }
        }

        // If target was not found after traversing the array
        if(!isFound){
            System.out.println("Given number doesn't exists in the array");
        }

    }
}
