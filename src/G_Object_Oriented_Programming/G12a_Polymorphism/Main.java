/*
 * This program demonstrates POLYMORPHISM in Java.

 * Car, Bike, and Boat are different subclasses that extend the Vehicle superclass.
 * Each subclass provides its own implementation of the go() method.

 * Using a Vehicle reference, different object types (Car, Bike, Boat) can be stored in a single array and their overridden go() methods
 * are called at runtime based on the actual object type.

 * This shows how one superclass reference can represent many forms.
 */

package G_Object_Oriented_Programming.G12a_Polymorphism;

public class Main {
    public static void main(String[] args){

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        car.go();
        bike.go();
        boat.go();
        // each of these objects have their own go() method

        // we are going to place all of these objects within an array - the car, boat and bike objects
        // what should be the data type of the array, lets attempt to create an array of Car objects and place our bike and boat objects within that array

        // let's create an array of Cars, the data type of the array is Car and its name is cars

        // Car[] cars = {car, bike, boat};

        // we will get an error :- Bike cannot be converted to Car
        // bikes and boats don't identify as cars, car identifies as cars, that's one of the shapes bikes and boats don't have, they don't identify as cars

        // if this were an array of bikes

        // Bike[] bikes = {car,bike,boat};

        // we will get an error :- Car cannot be converted to Bike
        //cars and boats don't identify as bikes, bike identifies as bikes, that's one of the shape cars and boats don't have, they don't identify as bikes

        // if this were an array of boats

        // Boat[] boats = {car,bike,boat};

        // we will get an error :- Car cannot be converted to Boat
        //cars and bikes don't identify as boats, boat identifies as boats, that's one of the shape cars and bikes don't have, they don't identify as boats

        // what we could do is declare our array of what they have in common, our Car, Bike and Boat they all extend Vehicle class. We can also that they all identify as vehicles in common
        // we are going to change the data type of our array to hold Vehicles

        Vehicle[] vehicles = {car, bike, boat};
        // we have an array of vehicles objects
        // car identifies as cars but also as vehicles, bike identifies as bikes and also as vehicles, boat identifies as boats and also as vehicles
        // That's the one thing they have in common, they all extend the superclass - Vehicle
        // They are considered as vehicles, that's another one of their forms

        for(Vehicle vehicle : vehicles){
            vehicle.go();
        }
        // using a for each loop to loop through vehicles array and call go() method for each
        // Vehicle - data type, vehicle - variable to iterate, vehicles - name of the array



    }
}

// Polymorphism is a Greek word where "POLY" = "MANY" and "MORPH" = "FORM" or "SHAPE"
// Together we get the concept of many shapes of forms
// Objects can identify as other objects.
// Objects can be treated as objects of a common superclass
// Eg:- A dog identifies as a dog, but it can also be identified as an animal, it can also be identified as an organism,
        // also as an object - hence it can be identified as more than one thing
