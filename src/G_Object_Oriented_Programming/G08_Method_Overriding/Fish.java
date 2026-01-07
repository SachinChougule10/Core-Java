package G_Object_Oriented_Programming.G08_Method_Overriding;

public class Fish extends Animal{

    @Override
    void move(){
        System.out.println("This animal is swimming!");
    }

    // it is a good practice to add this annotation of '@Override', so that you and other developers know that this method is being overridden
    // our Fish class do inherit move() method from its parent class of Animal
    // if we have same named method defined in a child class, you will use that one first (rather than that of parent class)
    // Not only is a good practice to add this annotation of @Override, but let's say that you misspell this overwritten move() method,
    // rather than move() you wrote moves(), we will receive a warning 'that this method does not override the method form its superclass'
    // if you didn't have this annotation, you may not notice that you've misspelled this method, and you are not actually overriding it
    // adding the @Override annotation provides a system of checks and balances
}
