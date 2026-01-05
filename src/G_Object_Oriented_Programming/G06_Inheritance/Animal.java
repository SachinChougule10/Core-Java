package G_Object_Oriented_Programming.G06_Inheritance;

public class Animal extends Organism {

    boolean isAlive;

    Animal(){
        isAlive = true;
    }

    void eat(){
        System.out.println("The animal is eating");
    }
}

// Animal class inherits from Organism. Represents common behavior shared by all animals.


