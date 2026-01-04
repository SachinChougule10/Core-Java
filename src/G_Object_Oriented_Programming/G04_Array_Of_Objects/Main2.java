package G_Object_Oriented_Programming.G04_Array_Of_Objects;

public class Main2 {
    public static void main(String[] args){

        Car[] cars = {new Car("Scorpio","Black"),
                      new Car("XUV","White"),
                      new Car("Thar","Black")};

        // for each element, we are going to call the Car object_oriented_programming.constructor with the new keyword and passing the necessary details,
        // the arguments


        for(Car car : cars){
            car.drive();
        }
    }
}

// when creating an array of objects, we can pass in anonymous objects, rather than first instantiating the objects
// and then assigning them to array
// We construct here objects, without giving the objects a unique identifier like car1, car2, car3.
// These are known as anonymous objects
