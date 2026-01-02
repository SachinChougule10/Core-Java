package G_Object_Oriented_Programming.G01_OOP_Basics;

public class Main {
    public static void main(String[] args){
        Car car = new Car();
        // 'car' will now have all the attributes of 'class OOP.object.Car'

        System.out.println(car);
        // since objects are 'reference data types', when we try to print car object directly, we will get a 'memory address (OOP.object.Car@6acbcfc0)'

        System.out.println(car.make);
        System.out.println(car.year);
        System.out.println(car.model);
        System.out.println(car.isRunning);
        // if we want to access one of the attributes we need to use the 'DOT OPERATOR'

        car.isRunning = true;
        // we can modify and change these attributes too
        // we will turn the car 'ON'
        System.out.println(car.isRunning);

        car.stop();
        System.out.println(car.isRunning);
        car.start();
        System.out.println(car.isRunning);

        car.drive();
        car.brake();

        Car car1 = new Car();
        // we have created another object for the 'object.Car class'

        System.out.println(car.make + " " + car.model);
        System.out.println(car1.make + " " + car1.model);
        // There is one issue now here, for every object we make for the 'Car class' will have the same attributes and methods
        // Both these cars 'car and car1' have same attributes, it would be great if we could customize these attributes, so that each car would be unique
        // We will now learn about CONSTRUCTORS, by passing in arguments, we can create unique objects



    }
}
