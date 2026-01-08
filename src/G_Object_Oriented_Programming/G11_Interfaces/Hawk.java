package G_Object_Oriented_Programming.G11_Interfaces;

public class Hawk implements Predator{

    @Override
    public void hunt(){
        System.out.println("** The hawk is hunting! **");
    }
}

// Hawk will implement the Predator interface, we have to override hunt() method
// Its kind of a contract - the Predator interface is telling the Hawk class - hey if you are going to implement me you need to define the hunt() method,


// Hawk implements Predator, so it must define hunt().
//It represents a Predator (only hunts, doesn’t flee).

// Interface D_Methods.methods are always public and abstract — we can’t change their visibility.
//Abstract class D_Methods.methods, on the other hand, have default (package-private) visibility if not specified,
// and we can declare them as private, protected, or public as needed

// If I don’t specify public for a method in an interface, Java implicitly makes it public abstract.
// I still have to implement it as public in the class, or else I’ll get a compile-time visibility error.