/*
 * This program demonstrates the use of Interfaces in Java to achieve abstraction and multiple inheritance-like behavior.

 * The Prey and Predator interfaces act as contracts that define behaviors (flee() and hunt()) without providing implementations.

 * Classes:
 * - Rabbit implements Prey (can flee)
 * - Hawk implements Predator (can hunt)
 * - Fish implements both Prey and Predator (can flee and hunt)

 * This shows that a class in Java can implement multiple interfaces, allowing it to inherit multiple behaviors — something not possible with classes alone.
 */


package G_Object_Oriented_Programming.G11_Interfaces;

public class Main {
    public static void main(String[] args){

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.flee();
        hawk.hunt();
        // rabbit don't have a hunt() and hawk don't have a flee() method
        fish.flee();
        fish.hunt();
        // fish will have both hunt() and flee() D_Methods.methods (multiple inheritance like behaviour)

    }
}


// Interface = A blueprint for a class that specifies a set of abstract D_Methods.methods that implementing classes must define.
// Supports multiple inheritance-like behaviour.
// Difference = Normally with inheritance a class can only have a single parent but by using interfaces, a class can have multiple parents


// Concept =
//Interface = a blueprint of a class that contains abstract D_Methods.methods (D_Methods.methods without implementation).
//Any class that implements the interface must define all of its abstract D_Methods.methods.
//It is a way to achieve abstraction and multiple inheritance in Java.

// Explanation :- In this program, I’ve implemented abstraction using interfaces.
// The Predator and Prey interfaces act as contracts — they only declare the behavior (hunt() and flee()), not the implementation.
// Classes like Rabbit, Hawk, and Fish provide their own implementation of these D_Methods.methods.
// The Fish class implements both interfaces, showing multiple inheritance-like behavior, since Java allows a class to implement multiple interfaces but only extend one class.