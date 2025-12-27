package E_Arrays;

import java.util.Arrays;

public class E01_Arrays {
    public static void main(String[] args){

        String [] fruits = {"apple","banana","chickoo","coconut"};      // these are called elements
        System.out.println(fruits);                                     // gives memory address
        System.out.println(fruits[0]);                                  // to access an element of an array we need to specify its index


        fruits[0] = "pineapple";                                        // change an element to an array

        int sizeOfArray = fruits.length;                                // gives size of an array
        System.out.println(sizeOfArray);


        // simple for loop

        for (int i = 0; i < fruits.length; i++){

            System.out.print(fruits[i] + " ");
        }

        System.out.println();


        // enhanced for loop (for-each loop) :- simplifies iterating through a collection such as array

        String [] watches = {"Rolex","Titan","Fastrack","Sonata"};

        for (String i : watches){
            System.out.println(i);
        }
        System.out.println();

        // String = datatype of all the elements in the array
        // i = iterator
        // watches = array we want to iterate through


        // sort() method :-

        String[] cars = {"Landrover","Mercedes","Audi","Lexus"};

        Arrays.sort(cars);                  // will be sorted alphabetically

        for (String j : cars){
            System.out.println(j);
        }

        System.out.println();

        // fill() method :- fills an array with the given value

        String[] movies = {"Ratchasan", "Vada Chennai", "Theeran", "D16"};

        Arrays.fill(movies, "Peaky Blinders");

        for(String k : movies){
            System.out.println(k);
        }




    }
}

// array :- a collection of values of the same data type
// array fall under 'REFERENCE' data type
// As a beginner, think of it as a variable that can store more than 1 value
// If we try to access an element that doesn't exist, we get an error:- ArrayIndexOutOfBound
