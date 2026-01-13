package G_Object_Oriented_Programming.G16_Composition;

public class Car {
    String model;
    int year;
    Engine engine;

    // while constructing a Car object we will not pass an Engine object (engine), we will pass a String of engineType

    Car(String model, int year, String engineType){
        this.model = model;
        this.year = year;
        this.engine = new Engine(engineType);

        // for engine, we are going to call the constructor for a new Engine object and pass in our engineType
        // We create a new Engine object and pass the engineType to its constructor
        // when constructing a Car object, we will also be constructing a new Engine object

        // when you pass arguments, your parameter names can be different from the arguments name that you pass in,
        // we simply rename them when this constructor receives that argument
        // this.engine = new Engine(engineType) - here 'engineType' refers to 'type' in Engine class
    }

    void start(){
        // when we start our car we also start our engine
        this.engine.start();
        System.out.println("The " + this.model + " is running");
    }
}
