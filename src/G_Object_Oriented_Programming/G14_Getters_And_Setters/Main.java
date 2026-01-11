/*
 * Demonstration of Getters and Setters in Java

 * This program explains why getters and setters are used instead of directly accessing class variables.

 * Key concepts demonstrated:
 * 1. Public attributes can be accessed and modified directly.
 * 2. Private attributes cannot be accessed outside the class.
 * 3. Getters allow controlled READ access to private variables.
 * 4. Setters allow controlled WRITE access with validation logic.
 * 5. 'final' keyword is used to prevent modification of certain fields (e.g., registration_number).

 * Example validations:
 * - Price cannot be less than zero (handled using setter logic).

 * This follows the principle of Encapsulation in Object-Oriented Programming.
 */


package G_Object_Oriented_Programming.G14_Getters_And_Setters;

public class Main {
    public static void main(String[] args){
        Car car = new Car("Range Rover","Defender","Sachin",8055,"Maharashtra", "White",50000);
        System.out.println(car.brand + " " + car.color + " " + car.state); // output :- Range Rover White Maharashtra
        // with Car objects its attributes are publicly accessible, meaning we can view and change them easily
        // to demonstrate let's say the brand of the car is now - Ferrari

        car.brand = "Ferrari";
        System.out.println(car.color + " " + car.brand+ " " + car.state); // White Ferrari Maharashtra

        // once we assign a model of a car, we do not want to change it, we can do it by making the attributes - private
        // if we try to directly access the private attributes, then we get an error
        // since the attributes are private, we can't access them outside the class. But there is a way to do so using GETTERS and SETTERS D_Methods.methods

        // rather than accessing the private A_Basics.variables directly because we can't, we are going to call the getter() D_Methods.methods
        // car.getName_of_owner()- for name of the owner, car.getModel() - for the model name and car.getPrice() - for the price

        System.out.println(car.getName_of_owner() + "'s " + car.getModel() + " " + car.getPrice());                     // output:- Sachin's Defender $50000, we are able to access the private A_Basics.variables
        // we can now access the private attributes using getters

        // if we try to modify private A_Basics.variables directly, we will get an error :
        // car.name_of_owner = "Sunil" ..............(we will get an error, as name_of_owner is private variable)

        // instead we will call the setter D_Methods.methods and pass in the desired parameter, rather than assign it directly
        // for name of the owner, we will call the setName_of_owner method and pass in the new name of the owner
        car.setName_of_owner("Sunil");

        // to set a new price, we will call the setPrice method and pass in the new price
        car.setPrice(30000);

        // using the getter method to print these attributes
        System.out.println(car.getName_of_owner() + "'s " + car.getPrice() + " car");               // output:- Sunil's $30000 car, we have modified the private A_Basics.variables using setter method

        car.setName_of_owner("Satish");
        car.setPrice(-500);

        System.out.println(car.getName_of_owner() + "'s " + car.getPrice() + " car");

        // Since newPrice is -500, if part executes, and it prints:
        //Price of the car cannot be less than zero.
        // because the previous valid price (30000) was never overwritten (since you didn’t assign the invalid one).
        // output:- Price of the car cannot be less than zero. Satish's $30000 car

    }
}

// They help protect object data and add rules for accessing or modifying them
// GETTERS = Methods that make a file READABLE and you can add additional logic when retrieving one of the attributes
// SETTERS = Methods that make a file WRITEABLE