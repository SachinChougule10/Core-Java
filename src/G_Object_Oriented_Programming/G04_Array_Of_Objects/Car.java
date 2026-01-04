package G_Object_Oriented_Programming.G04_Array_Of_Objects;

public class Car {
    String model;
    String color;

    Car(String model, String color){

        this.model = model;
        this.color = color;
    }

    void drive(){
        System.out.println("You drive a " + this.color + " " + this.model);
    }
}
