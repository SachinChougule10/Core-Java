/*
 * Description:
 * This program demonstrates Runtime Polymorphism (Dynamic Method Dispatch) in Java.

 * An abstract parent class `Animal` defines an abstract method `speak()`.
 * Concrete subclasses `Dog` and `Cat` provide their own implementations of `speak()`.

 * At runtime, based on user input, an `Animal` reference is assigned either a `Dog` or `Cat` object.
 * The JVM decides which `speak()` method to execute based on the actual object type, not the reference type.

 * This example highlights:
 * - Use of abstract classes and methods
 * - Parent class reference holding child class objects
 * - Method call resolution at runtime
 */


package G_Object_Oriented_Programming.G13_Runtime_Polymorphism;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // In this demonstration, user has to pick if they want a dog or cat, but we don't know which one they are going to pick

        Animal animal;
        // let's declare Animal object, but not instantiate it, as it is an abstract class it cannot be instantiated
        // we will assign our animal equal to a 'new Dog' or 'new Cat', based on the user input
        // so this would be - 'Animal animal = new Dog()' or 'Animal animal = new Cat()' based on the user input

        System.out.print("Would you like a dog or a cat? (1 = dog, 2 = cat): ");
        int choice = scanner.nextInt();

        if(choice == 1){
            animal = new Dog();
            animal.speak();
        }
        else if(choice == 2){
            animal = new Cat();
            animal.speak();
        }

        // if we select 1, we get dog and if we select 2 we get cat
        // the actual method that we call is determined at runtime after the program is already running
        // before the program runs we know that we are going to use the speak() method, but not sure which one - Dog or Cat - that's Runtime Polymorphism

        // Here, the type of reference (Animal) is the same.
        //But the object assigned (Dog or Cat) changes based on user input at runtime.
        //The JVM determines which speak() to call at runtime, not at compile time.

    }
}

// Runtime Polymorphism = When the method that gets executed is decided at runtime based on the actual type of the object

// Concept Summary:-
//-----------------------------------------------------------------------
//Concept	                |               Explanation
//-----------------------------------------------------------------------
//Compile-time type	        |               Animal
//Runtime type	            |               Dog or Cat
//Decision time	            |               Runtime
//Behavior	                |         Depends on actual object type
//----------------------------------------------------------------------


// Key Idea :- The method call animal.speak() looks the same, but its behavior depends on the object type created at runtime.
//That’s why this is called runtime polymorphism — the “many forms” (Dog, Cat, etc.) are decided when the program actually runs.


// Key Points:
//We cannot create an object of an abstract class (Animal).
//A parent class reference can hold a child class object:

//Animal animal = new Dog(); // ✅ Valid
// animal is a reference variable of the parent class (Animal),and it’s currently pointing to a child object (Dog).

//Dog dog = new Animal();    // ❌ Invalid


//The method call is resolved at runtime based on the object type, not the reference type.
//This is called Runtime Polymorphism or Dynamic Method Dispatch.

//You can only access D_Methods.methods and A_Basics.variables that are defined in the Animal class (the reference type).
//But the implementation of those D_Methods.methods depends on the actual object type (Dog or Cat).





/* What is a reference variable?

In Java, a reference variable is like a pointer that refers to an object in memory.

When you write:
Animal animal = new Dog();

you’re doing two things:
Creating a Dog object in memory (on the heap)
Storing its reference (address) in the animal variable, which is of type Animal

🔍 Visual Representation
[Stack]                           [Heap]
Animal animal  ───────────────▶   new Dog()
(reference var)                   (object created)


animal → a variable of type Animal
new Dog() → an object of the child class Dog

Together: the Animal reference points to a Dog object.

⚙️ What this allows

You can only access D_Methods.methods and A_Basics.variables that are defined in the Animal class (the reference type).
But the implementation of those D_Methods.methods depends on the actual object type (Dog or Cat).

Example:

Animal animal = new Dog();
animal.speak(); // ✅ Allowed (because Animal has speak())

But if Dog has a method like:
void fetch() {}

then this won’t work:
animal.fetch(); // ❌ Error! Animal reference doesn't know about fetch()


✅ So yes —
animal is a reference variable of the parent class (Animal),
and it’s currently pointing to a child object (Dog).*/