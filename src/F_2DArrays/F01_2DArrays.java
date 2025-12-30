/**
 * Description:

 * This program demonstrates the basics of 2D arrays in Java.
 * It shows two different ways to create a 2D array:
 *  1) By combining existing 1D arrays
 *  2) By directly initializing a 2D array

 * The program also demonstrates:
 *  - Accessing and updating elements using row and column indices
 *  - Traversing a 2D array using nested enhanced for loops
 */


package F_2DArrays;

public class F01_2DArrays {
    public static void main(String[] args){

        String[] fruits = {"apple","banana","pineapple"};
        String[] vegetables = {"potato","onion","carrot"};
        String[] fastfood = {"burger","pizza","taco"};

        // Way 1 :- To create a 2d array :- To add already existing arrays

        String[][] food = {fruits,vegetables,fastfood};

        // Accessing and updating elements in an array :-

        food[0][0] = "papaya";                              // we need two [] brackets, first one for 'row' and second one for 'column' (just like a matrix)
        food[2][2] = "pastry";


        for(String[] i : food){
            for(String j : i){
                System.out.print(j+" ");
            }
            System.out.println();
        }


        System.out.println();

        // Way 2 :- To create a 2d array :- To create an array into a 2d array

        String[][] cities = {{"Mumbai","Delhi","Pune"},{"New York","Los Angeles","Washington DC"},{"London","Birmingham","Manchester"}};

        for (String[] k : cities){
            for(String l : k){
                System.out.print(l+" ");
            }
            System.out.println();
        }


    }
}

/*

    - 2D array :- An array where each element is an array
              - Useful for storing a matrix of data

    - Syntax for updating elements :- array[row][column]

    - It's useful for structured data like tables, grids, or any row-column format.



 */
