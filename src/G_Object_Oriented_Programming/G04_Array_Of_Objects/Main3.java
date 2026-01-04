package G_Object_Oriented_Programming.G04_Array_Of_Objects;

public class Main3 {
    public static void main(String[] args){

        Car[] cars = {new Car("Scorpio","Black"),
                new Car("XUV","White"),
                new Car("Thar","Black")};

        // for each element, we are going to call the Car object_oriented_programming.constructor with the new keyword and passing the necessary details,
        // the arguments


        for(Car car : cars){
            car.color = "blue";
        }

        // we can also change attribute's values using an enhanced for loop

        for(Car car : cars){
            car.drive();
        }
    }
}