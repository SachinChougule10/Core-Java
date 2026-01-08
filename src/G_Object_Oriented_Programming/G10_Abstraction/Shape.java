package G_Object_Oriented_Programming.G10_Abstraction;

public abstract class Shape {
    abstract double area(); // abstract method

    void display(){         // concrete method
        System.out.println("This is a shape");
    }
}


// since Shape is an abstract class, we cannot create any objects form this class
// abstract classes can contain abstract D_Methods.methods and concrete D_Methods.methods, which are kind of the opposite
// concrete D_Methods.methods are defined and inherited within an abstract class
// in an abstract class a concrete method is inherited
// in our Circle, Rectangle, Triangle we don't need to implement this concrete method
// an Abstract class can contain abstract D_Methods.methods which needs to be implemented by the children classes or concrete D_Methods.methods which are inherited by the children classes


// Analogy :- Think of a car:
//You can drive it using the steering wheel and accelerator (public interface).
//You don’t need to know how the engine works internally — that’s abstraction.