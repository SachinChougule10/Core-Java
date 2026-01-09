/*
 Demonstrates POLYMORPHISM using an INTERFACE in Java.

 - Vehicle is an interface with a common method: go()
 - Car, Bike, and Boat implement the Vehicle interface
 - Each class provides its own implementation of go()

 In main():
 - Different objects (Car, Bike, Boat) are stored in a Vehicle reference array
 - The same method call (vehicle.go()) behaves differently based on the actual object type at runtime

 This shows runtime polymorphism: one interface → many implementations → different behaviors
*/

package G_Object_Oriented_Programming.G12b_Polymorphism;

public class Main {
    public static void main(String[] args){

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle[] vehicles = {car, bike, boat};
        // creating an array consisting of all the objects

        for(Vehicle vehicle : vehicles){
            vehicle.go();
        }

    }
}

// we can also achieve POLYMORPHISM using interfaces

// Polymorphism = “poly” (many) + “morph” (forms)
//It means the same action (method call) behaves differently depending on which object it acts upon.

/* Simple Analogy =
    Imagine “Vehicle” as a remote control —
    the button (method go()) is the same,
    but the machine (Car/Bike/Boat) reacts differently.

    Pressing the same button → drives a car,

                            ...rides a bike,

                            ...or sails a boat.

    Same interface, different behavior → that’s polymorphism.*/

/*Summary Line for Interviews

“Polymorphism here means that a single interface (Vehicle) defines a common method (go()), but each implementing class provides its own behavior.
So the same method call — vehicle.go() — takes different forms depending on the object type, which is why it’s called polymorphism.”*/