package G_Object_Oriented_Programming.G10_Abstraction;

public class Triangle extends Shape{

    double base;
    double height;

    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    double area(){
        return 0.5 * base * height;
    }
}

// the concrete method of display() was inherited by Circle, Rectangle, Triangle form Shape class i.e. their parent class

// If you don’t specify any modifier for an abstract method, it becomes package-private.
//Only classes within the same package can override it.
//To make it accessible to subclasses in other packages, declare it as protected or public.