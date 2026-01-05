package G_Object_Oriented_Programming.G06_Inheritance;

public class Dog extends Animal {

    int lives = 1;

    void speak(){
        System.out.println("The dog goes *woof*");
    }

}


// In order for a class to inherit all the attributes and methods from another class,
// after the class name you will use the 'extends' keyword then specify the 'parent class'
// Here, Animal is the parent class and Dog is the child class
// our Dog class will inherit all these traits (attributes and methods) from the animal class

// Each child class can have their own unique attributes and methods too