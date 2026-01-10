package G_Object_Oriented_Programming.G13_Runtime_Polymorphism;

public class Cat extends Animal{
    @Override
    void speak(){
        System.out.println("The cat goes *meow*");
    }
}
// The speak() method is abstract, so all subclasses must override it.

// Each subclass provides its own implementation of speak().
//Even though both are Animals, how they “speak” differs — this is polymorphism in action.