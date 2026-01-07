/*
 Description:
 This program demonstrates method overriding in Java.

 The example includes:
 - Animal superclass with default move() implementation
 - Dog, Cat, and Fish subclasses extending Animal
 - Fish class overriding move() to provide swim behavior
 - Use of @Override annotation for compile-time safety

 The program illustrates polymorphism, dynamic method dispatch, and how subclasses can provide specific implementations of inherited methods
 while reusing parent behavior in other child classes.
*/

package G_Object_Oriented_Programming.G08_Method_Overriding;

public class Main {
    public static void main(String[] args){

        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        dog.move();
        cat.move();
        fish.move();

        // we get the output - 'This animal is running!' for dog, cat, and fish
        // but this output is wrong for fish class, as fish do not have legs, they swim rather than run.
        // For the fish class we will create a unique move() method, only for this class
        // We will define a new move() method, where we will say 'This animal is swimming'
        // After using method overriding we will see output for fish.move() as 'The animal is swimming'. move() method has being overridden
        // within the Fish class we have overridden the move() method, we have given a specific implementation for this method, just for this one class
        // the Dog and Cat class will use what inherited from the parent class.

    }
}

// Method overriding = When a subclass provides its own implementation of a method that is already defined.
// Allows for code reusability and give  specific implementations.
