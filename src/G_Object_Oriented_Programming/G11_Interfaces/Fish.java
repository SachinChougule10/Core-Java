package G_Object_Oriented_Programming.G11_Interfaces;

public class Fish implements Prey, Predator{

    @Override
    public void flee(){
        System.out.println("** The fish is running away! **");
    }

    @Override
    public void hunt(){
        System.out.println("** The fish is hunting! **");
    }
}

// one key difference with interfaces compared to abstract classes is that you can implement more than one interfaces
// so fish they hunt smaller fishes, and they flee larger fishes, they can be both prey and predators
// we will implement two interfaces Prey, Predator for Fish class, thus we have to finish defining both flee() and hunt() method in the Fish class
// again we will use the @Override annotation
// we will create publicly accessible D_Methods.methods flee() and hunt()

// Fish implements two interfaces — Prey and Predator.
// Hence, it must implement both flee() and hunt().
// This shows multiple inheritance-like behavior, which is not possible with classes in Java, but possible with interfaces.
