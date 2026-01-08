/*
 * This program demonstrates the concept of Abstraction in Java.

 * An abstract class `Shape` defines a common structure for all shapes by declaring an abstract method `area()` and a concrete method `display()`.

 * Subclasses such as Circle, Rectangle, and Triangle extend the Shape class and provide their own implementation of the `area()` method.

 * The main method creates objects of these subclasses and calls their inherited and overridden methods, showing how abstraction allows us
 * to interact with different objects using a common interface without knowing their internal implementation details.
 */


package G_Object_Oriented_Programming.G10_Abstraction;

public class Main {
    public static void main(String[] args){

        // Shape shape = new Shape();           error :- 'Shape' is abstract; cannot be instantiated
        // we cannot create an object for Shape class, because it is an abstract class

        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(6,7);
        Triangle triangle = new Triangle(4,5);

        circle.display();
        triangle.display();
        rectangle.display();

        System.out.println(circle.area());
        System.out.println(rectangle.area());
        System.out.println(triangle.area());

    }
}

// abstract = used to define abstract classes and D_Methods.methods
// Abstraction is the process of hiding implementation details and showing only the essential features
// Abstract classes can't be instantiated directly
// Can contain 'abstract' D_Methods.methods (which must be implemented)
// Can contain 'concrete' D_Methods.methods (which are inherited)


// “In my example, abstraction is achieved using an abstract class called Shape.
//The Shape class defines a common structure for all shapes — it has an abstract method area() and a concrete method display().
//The area() method is declared abstract, meaning it does not contain any implementation in the Shape class. This enforces that every subclass, like Circle, Rectangle, or Triangle, must provide its own implementation of how the area is calculated.
//So, when I call shape.area() in the main program, I don’t need to know how the area is actually computed — whether it’s πr² for a circle or ½bh for a triangle.
//I just know that every shape object can calculate its area.
//That’s the essence of abstraction — hiding the internal implementation and showing only the necessary interface or functionality to the user.”

// “In short, abstraction is achieved by defining the area() method in the abstract class Shape (what to do) and implementing it differently in each subclass (how to do it is hidden).”

// “Abstraction is achieved by using an abstract class Shape that defines the method area() without implementation, and the subclasses implement it — hiding the details of how the area is actually calculated.”
