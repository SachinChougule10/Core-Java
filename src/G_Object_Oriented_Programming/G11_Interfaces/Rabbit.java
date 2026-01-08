package G_Object_Oriented_Programming.G11_Interfaces;

public class Rabbit implements Prey{

    @Override
    public void flee(){
        System.out.println("** The rabbit is running away **");
    }
}


// Rabbit class implements Prey interface
// Since the Rabbit class is implementing the Prey interface, we have to finish defining flee() method that's declared in the Prey interface in the Rabbit class,
// else we will get an error - Class 'Rabbit' must either be declared abstract or implement abstract method 'flee()' in 'Prey'
// Its kind of a contract - the Prey interface is telling the Rabbit class - hey if you are going to implement me you need to define the flee() method,
// we need to do this in order to create a Rabbit object. We will be overriding this method using @Override annotation


// Rabbit implements Prey, so it must define the flee() method.
//If not, the compiler throws an error.
//It represents a Prey in nature (it only flees, doesn’t hunt).