/*
 Description:
 This program demonstrates the concept of inheritance in Java.
 It shows how child classes inherit attributes and methods from parent classes using the 'extends' keyword.

 The example includes:
 - Multilevel inheritance (Organism → Animal → Dog/Cat)
 - Hierarchical inheritance (Animal → Dog and Cat)
 - Separate inheritance hierarchy for Plants

 The program illustrates code reuse, polymorphic behavior, and the DRY (Don't Repeat Yourself) principle.
*/


package G_Object_Oriented_Programming.G06_Inheritance;

public class Main {
    public static void main(String[] args){

        Dog dog = new Dog();
        Cat cat = new Cat();
        Plants plant = new Plants();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);

        dog.eat();
        cat.eat();

        System.out.println(dog.lives);
        System.out.println(cat.lives);

        dog.speak();
        cat.speak();

        System.out.println(dog.hasCells);
        System.out.println(cat.hasCells);

        System.out.println(plant.hasCells);
        plant.photosynthesize();

        // dog.photosynthesize();
        // we checked whether our dog has photosynthesize method,
        // this will give error, bcoz there is no photosynthesize method for dogs, they do not inherit this method, as they are not related to plants

    }
}


// Inheritance = One class inherits the attributes and D_Methods.methods from another class
// Same as child inherits traits from parents (Child <- Parent)

// Single Inheritance - One child inherits from one parent - eg:- Animal → Dog
// Multilevel Inheritance - Chain of inheritance - eg:- Organism → Animal → Dog
//Hierarchical Inheritance - Multiple children from one parent - eg:- Animal → Dog and Animal → Cat
// Multiple Inheritance - One child inherits from multiple parents - Not directly supported in Java (class-wise), but it does allow it with interfaces.
// Hybrid Inheritance - Combination of multiple types - Mix of hierarchical + multiple
// As Java doesn't allow multiple inheritance, it also don't allow multipath inheritance (as multiple is necessary for multipath )

// The class which inherits the properties of other is known as child class (derived class, subclass)
// and the class whose properties are inherited is known as parent class (base class, superclass class).

// Inheritance isn't such useful when we have only a few classes such as 2, because you know you could just copy and paste this code within each
// but imagine if we had 100s of classes, hundreds of child classes, you'd have to do that for hundreds of classes,
// not only that, if we had to make any changes to the output, we have to make it for hundreds of classes, and we are repeating ourselves a lot
// it would be lot easier if we can just make that change in one place. We will also follow the DRY principle. We are writing the code once and reusing it.
// Any changes made to the parent class will be updated in the child classes too.