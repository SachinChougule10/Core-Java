package G_Object_Oriented_Programming.G13_Runtime_Polymorphism;

public abstract class Animal {
    abstract void speak();
}


// we will create an abstract Animal class, as we don't want anyone to create animal objects
// we will create an abstract method speak();
// The speak() method is abstract, so all subclasses must override it.