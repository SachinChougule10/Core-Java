/*
 Description:
 This program demonstrates how to create and use arrays of objects in Java.
 It shows different ways of initializing object arrays, including:
 1) Storing named objects in an array
 2) Using anonymous objects directly in an array
 3) Modifying object attributes using an enhanced for loop
 The example uses a Car class to illustrate object behavior.
*/

package G_Object_Oriented_Programming.G04_Array_Of_Objects;

public class Main1 {
    public static void main(String[] args){
        Car car1 = new Car("Mustang","Red");
        Car car2 = new Car("Volkswagen","White");
        Car car3 = new Car("LandRover","Black");




        Car[] cars = {car1, car2, car3};

        for(int i=0; i < cars.length; i++){
            cars[i].drive();
        }

        // enhanced for loop

        for(Car car : cars){
            car.drive();
        }

        // Syntax of enhanced for loop :- for(data_type_of_elements_in_array   iterator : name_of_the_array  )



        // we are creating an array of objects, for that we have to list the data type of what we are storing
        // we are going to store car objects, so the data type would be car objects - 'Car'
        // we would need a pair of straight brackets, followed by the name of the array
    }
}
