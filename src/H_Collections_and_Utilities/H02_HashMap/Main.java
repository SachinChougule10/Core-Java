package H_Collections_and_Utilities.H02_HashMap;

/**
 * This program demonstrates the basic operations of a HashMap in Java.
 * It shows how to:
 *  - Create a HashMap with String keys and Double values
 *  - Add key–value pairs using put()
 *  - Overwrite values for duplicate keys
 *  - Remove entries using remove()
 *  - Retrieve values using get()
 *  - Check if a key or value exists using containsKey() and containsValue()
 *  - Get the size of the HashMap using size()
 *  - Iterate through keys using keySet()
 *  - Print the HashMap (unordered output)

 * HashMap is a data structure that stores unique keys mapped to values,
 * providing fast access using hashing.
 */


import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        HashMap<String, Double> map= new HashMap<>();   // we are going to store String as the key and Double as a value

        // to put things in the HashMap we are going to take our map and use the .put() method
        map.put("apple", 0.50);
        map.put("orange", 0.75);
        map.put("banana", 0.25);
        map.put("coconut", 1.25);
        // HashMaps cannot have duplicate keys, if we put key - value pairs that already exists, the previous key - value pair is overwritten
        // now our apple will have value of 100.0
        map.put("apple", 100.0);

        // to remove items from HapMap we use the .remove() method and pass in the 'Key'
        map.remove("coconut");

        // to get the value associated with the key, we will use the .get() method
        System.out.println(map.get("banana"));

        // we can also check if a key or value exists in a HashMap
        System.out.println(map.containsKey("banana"));   // check whether a key exists in the HashMap. It will return a boolean value

        // we can use .containsKey() method in if-else statements :-
        if(map.containsKey("banana")){
            System.out.println(map.get("banana"));          // print the price if the key exists
        }
        else{
            System.out.println("Key not found");
        }

        // we can check if HashMap contains a certain value
        System.out.println(map.containsValue(0.75));    // returns a boolean value

        // we can get the size of the HashMap using .size() method
        System.out.println(map.size());

        // we can enhance the format of HashMap being displayed using a for loop
        for(String key : map.keySet()){             // .keySet() method gets all the keys present in the HashMap, and it is iterable
            System.out.println(key + " : $ " + map.get(key));
        }

        System.out.println(map);        // key-value pairs will be printed, order will not be maintained
    }
}

// HashMap = A data structure that stores key-value pairs.
// Keys are unique, but values can be duplicated.
// Does not maintain any order, but is memory efficient
// HashMap does not maintain order because it stores keys using hashing.
// It is efficient in terms of time (O(1) operations), not specifically memory.
// HashMap<Key, Value> - we have to set up the type parameters
