/* This program demonstrates the use of the toString() method in Java.
 A Car class is created with fields like make, model, year, and color.
 The default toString() from Object class is overridden to return
 a meaningful string representation of Car objects instead of hash code.
*/

package G_Object_Oriented_Programming.G09_ToString;

public class Main{
    public static void main(String[] args){

        Car car1 = new Car("Ford", "Mustang", 2025, "Red");
        Car car2 = new Car("Porsche", "911", 2023, "White");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car1.make + " " + car1.model + " " + car1.year + " " +  car1.color);

    }
}

// toString() = Method inherited from the Object class
// used to return a string representation of an object
// by default, it returns a hash code as a unique identifier
// it can be overridden to provide meaningful details
