/**
 * Description:
        * This program searches for a user-entered fruit name in a String array.
        * It uses a linear search technique and compares strings using the `.equals()` method.
        * If the fruit is found, the program displays the index where it exists.
        * If not found, it displays an appropriate message.
 */

package E_Arrays;

import java.util.Scanner;

public class E05_SearchAnArray2 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String[] fruits = {"apple","pineapple","kiwi","watermelon"};        // Array of fruits to search from
        boolean isFound = false;                // Flag variable to track whether the target fruit is found

        System.out.print("Enter a fruit: ");
        String target = scanner.nextLine();

        for(int i=0; i< fruits.length; i++){
            if (fruits[i].equals(target)){                  // Use .equals() to compare string values instead of '=='
                System.out.printf("%s is available at index: %d\n",target,i);   // Print the index where the fruit is found
                isFound = true;         // Update flag and stop further searching
                break;
            }
        }

        // If the fruit was not found in the array
        if(!isFound){
            System.out.printf("%s doesn't exists in the given array",target);
        }


        scanner.close();

    }
}


/*

    - We use '.equals()' method for strings because :-
        1) Strings are reference data types and if we use target == fruits[i], we would end up comparing their memory address
        2) "If we use '==' to compare strings, it may return false even if the content is the same, because '==' checks whether the two string objects
            refer to the same memory location, not whether their values are equal."
           - So if we use '== ', even if the strings are same as target it will return false, as they have different memory locations
        3) '.equals()' method checks the actual sequence of characters inside the string, not where it's stored in memory.



       - In Java, the term "reference" in reference data type means that the variable stores the memory address (or reference) of the actual data, rather than the data itself
       - Reference = a pointer or link to the memory location where the actual data/object is stored.



 */
