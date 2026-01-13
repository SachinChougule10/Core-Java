/*
 * Description:
 * This program demonstrates the concept of **Composition** in Java.
 * Composition represents a "part-of" relationship where one object completely owns another object.
 *
 * In this example:
 * - A `Car` object is composed of an `Engine` object.
 * - The `Engine` is created inside the `Car` constructor.
 * - The lifecycle of the `Engine` depends on the lifecycle of the `Car`.
 *
 * Key Points:
 * - The `Car` class does NOT receive an Engine object directly.
 * - Instead, it creates its own Engine using the provided engine type.
 * - When the Car starts, it automatically starts its Engine.

 * This demonstrates how composition differs from aggregation, where child objects can exist independently of the parent.
 */


package G_Object_Oriented_Programming.G16_Composition;

public class Main {
    public static void main(String[] args){

        Car car = new Car("Mustang", 2025, "V8");

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine);             // output :- Engine@5f184fc6
        // our engine is an object, it's a reference data type, so if we output it directly, we will get a hash id as an output

        // if we need the type of engine, we are going to access the 'type' attribute in the Engine class using the engine object
        System.out.println(car.engine.type);        // output :- V8

        // so it's like we have an object that's composed with another object - our 'engine' is part of our 'car'

        car.start();

    }
}

// Composition = Represents a "part-of" relationship between objects.
// for eg:- an Engine is a "part-of" a Car.
// Allows complex objects to be constructed from smaller objects.

// Now the key difference with composition is - if we delete car object, that will also delete our engine object, because our engine is part of the car

/*

Key Concept — Composition vs Aggregation :-

-----------------------------------------------------------------------------------------------------
Feature      |	         Composition	           |       Aggregation                              |
-----------------------------------------------------------------------------------------------------
Relationship |  Part-of	                           |    Has-a                                       |
Lifecycle	 |  Child object depends on parent	   |    Child object can exist independently        |
Example	     |  Car → Engine	                   |    Library → Book                              |
-----------------------------------------------------------------------------------------------------
So here, Car owns its Engine completely — that’s composition

*/