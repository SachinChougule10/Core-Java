/*
 * Description:
 * This program demonstrates the basic usage of the ArrayList class in Java.
 * It covers:
 * - Creating ArrayLists using Generics
 * - Adding elements of different wrapper types (Integer, Double, String)
 * - Removing elements using index
 * - Replacing elements using set()
 * - Accessing elements using get()
 * - Finding the size of the ArrayList
 * - Sorting an ArrayList using Collections.sort()
 * - Iterating through an ArrayList using an enhanced for loop

 * Key Concept:
 * ArrayList is a resizable array that stores objects and supports dynamic resizing, unlike traditional arrays which have a fixed size.
 */


package H_Collections_and_Utilities.H01_ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] mains){
        ArrayList<Integer> list = new ArrayList<>();
        // following the type of ArrayList, we are going to use the diamond operator
        // if we are storing integers, we would set the type to integer by using the Integer wrapper class

        list.add(10);
        list.add(20);
        list.add(30);
        // add integers to the list
        // to add elements to the ArrayList you can use the add() method, add() is an built in method of ArrayList

        ArrayList<Double> list1 = new ArrayList<>();
        // if we are storing doubles, we would set the type to double by using the Double wrapper class

        list1.add(11.2);
        list1.add(12.3);
        list1.add(15.30);

        System.out.println(list);
        System.out.println(list1);

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Papaya");
        fruits.add("Grapes");

        System.out.println(fruits);

        fruits.remove(0);
        // this will remove the element at zeroth index
        // we can remove elements of the ArrayList using the remove() method by specifying index

        System.out.println(fruits);

        fruits.set(1, "Pineapple");
        // we can also replace the elements of the ArrayList by specifying the index and element to replace
        // this will replace the element at first index with Pineapple

        System.out.println(fruits);

        System.out.println(fruits.get(0));
        // this tells to get the element at first index
        // to get an element at a certain index, we can use the get() method and specifying the index

        System.out.println(fruits.size());
        // we can get the length of the ArrayList using the size() method

        // to sort the ArrayList we will use the Collections framework and call the sort() method and pass in our ArrayList
        Collections.sort(fruits);

        // we can iterate through the ArrayList using an enhanced for loop

        for (String fruit : fruits){
            System.out.println(fruit);
        }


    }
}

// ArrayList = A resizable array that stores objects (autoboxing)
// Arrays are fixed in size, but ArrayLists can change
