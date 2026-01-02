package G_Object_Oriented_Programming.G01_OOP_Basics;

public class Car {
        public String make = "Ford";
        public String model = "Mustang";
        public int year = 2025;
        public double price = 58000.99;
        public boolean isRunning = false;

        // objects have the ability to hold data , and the entity that hold data are called 'attributes'
        // all these are the things objects (here car) have called as 'attributes'

        public void start(){
                isRunning = true;
                System.out.println("You started the engine!");
        }

        // void because we do not return anything

        public void stop(){
                isRunning = false;
                System.out.println("You stopped the engine!");
        }

        public void drive(){
                System.out.println("You drive a "+ model);
        }

        public void brake(){
                System.out.println("You brake the " + model);
        }

        // not only objects have the capability of holding data, they can also perform actions, have their own methods
        // car can do the following actions :- 1) start 2) stop
}


// object :- An object is a real world entity that holds data (attributes) and can perform actions (methods).
//           - Objects can have things (attributes) and do things (methods)
//           - Some attributes a person can have are :- 1)String name 2)int age 3)double height 4) double weight
//           - Some actions (methods) a person can do :- 1) eat() , 2) sleep()
// Objects are 'reference data types' (we store the data for an object in a location known as 'Heap')

// Class :- A class can serve as a blueprint to create an object



/*
 * NOTE:
 * All attributes and methods are declared public so they can be accessed from the demo class (Main) for learning and demonstration purposes.

 * In real-world applications, attributes should be private and accessed using constructors, getters, and setters.
 */