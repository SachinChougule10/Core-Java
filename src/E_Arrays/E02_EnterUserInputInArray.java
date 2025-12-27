/**
 * This program demonstrates how to create an array with a fixed size
 * and assign values to it after declaration.

 * Key Points Covered:
 *  - Difference between an empty array and a fixed-size array
 *  - Why values cannot be assigned to an array of size 0
 *  - How to reserve memory for an array using `new`
 *  - Iterating through an array using an enhanced for-loop

 */


package E_Arrays;

public class E02_EnterUserInputInArray {
    public static void main(String[] args){

        /*

       String [] food = {};        // empty array
       food[0] = "vadapav";        // if we have an empty array, we can't assign any values to that array, it will give an ArrayIndexOutOfBoundsException exception

        */


        // before assigning values we need to set the size of the array, even if it is empty

        String [] food = new String[3];
        food[0] = "Pizza";
        food[1] = "Burger";
        food[2] = "Taco";

        for (String i : food){
            System.out.println(i);
        }

    }
}


/*

 1) String [] food = {} :-
    - This creates a completely empty array of size 0.
    - You cannot assign values
    - This will not store any values
    - Use case :- Truly empty result/data

2) String [] food = new String[3] :-
    - creates an empty array of size 3
    - It reserves space in memory for 3 String elements.
    - Initially, all values inside the array are null (because it's a reference type).
    - You can later assign values to food[0], food[1], and food[2].
    - Use Case :- Reserved space to be filled later


 */

