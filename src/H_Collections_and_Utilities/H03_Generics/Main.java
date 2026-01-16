/*
 * Description:
 * This file demonstrates the concept of Generics in Java.
 * It shows:
 *  - How to create a generic class using a type parameter (<T>)
 *  - How to use type arguments while creating objects
 *  - How a single class can work with multiple data types (String, Integer, Double)
 *  - How to use multiple type parameters in a generic class (Product<T, U>)
 *
 * The program creates generic Box and Product objects and performs basic set and get operations to ensure type safety at compile time.
 */


package H_Collections_and_Utilities.H03_Generics;

public class Main {
    public static void main(String[] args){

        Box<String> box = new Box<>();
        // we need to set up a type argument, while creating an object of Box class
        // we will use the angle brackets after the class name and specify data type in it,
        // we need the diamond operator after the second box, in modern Java we don't need to specify data type here
        // our box object will store String

        box.setItem("banana");
        System.out.println(box.getItem());

        // our Box class is compatible with all data types, so we will store Integer now
        Box <Integer> box1 = new Box<>();               // our box object will store integers now
        box1.setItem(12);
        System.out.println(box1.getItem());

        // our Box class is compatible with all data types, so we will store Double now
        Box <Double> box2 = new Box<>();                // our box object will store doubles now
        box2.setItem(3.14);
        System.out.println(box2.getItem());

        // creating a Product objects
        Product<String, Double> product = new Product<>("Apple",500.30);
        System.out.println(product.getItem());
        System.out.println(product.getPrice());

        Product<String, Integer> product1 = new Product<>("ticket",25);
        System.out.println(product1.getItem());
        System.out.println(product1.getPrice());


    }
}

// Generics = A concept where you can write a class, interface, or method that is compatible with different data types.
// <T> type parameter (placeholder that gets replaced with a real type)
// <String> type argument (specifies the type)
