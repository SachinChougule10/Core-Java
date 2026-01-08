package G_Object_Oriented_Programming.G10_Abstraction;

public class Circle extends Shape{

    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    double area(){
        return Math.PI * radius * radius;
    }
}

// Circle is going to inherit abstract method area() from its parent class Shape
// we need to implement this method into Circle class else we will get an error - Class 'Circle' must either be declared abstract or implement abstract method 'area()' in 'Shape'
// this is going to be an overridden method, so we will need the annotation of @Override

// since we inherit from the Shape class and there is an abstract method of area, we need to implement this method, this helps to ensure consistency among the children classes

// the concrete method of display() was inherited by Circle, Rectangle, Triangle form Shape class i.e. their parent class
