package G_Object_Oriented_Programming.G10_Abstraction;

public class Rectangle extends Shape{

    double length;
    double width;

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    double area(){
        return length * width;
    }
}

// the concrete method of display() was inherited by Circle, Rectangle, Triangle form Shape class i.e. their parent class
