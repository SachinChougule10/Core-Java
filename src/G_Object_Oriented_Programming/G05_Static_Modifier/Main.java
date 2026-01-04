/*
 Description:
 This program demonstrates the use of the static keyword in Java.
 It shows how static variables are shared across all objects of a class and how static methods can be accessed using the class name.
 The Friend class keeps track of the total number of friends created using a static variable.
*/


package G_Object_Oriented_Programming.G05_Static_Modifier;

public class Main {
    public static void main(String[] args){

        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Squidward");
        Friend friend4 = new Friend("Sandy");

        System.out.println(friend1.name);
        System.out.println(friend1.noOfFriends);
        // we will get the no.of friends for friend1 as 1, as the no.of friends of friend1 is 0, and we are incrementing it by one

        System.out.println(friend2.name);
        System.out.println(friend2.noOfFriends);
        // we will get the no.of friends for friend2 as 1, as the no.of friends of friend2 is 0, and we are incrementing it by one

        System.out.println(friend3.name);
        System.out.println(friend3.noOfFriends);

        System.out.println(friend4.name);
        System.out.println(friend4.noOfFriends);

        // what if we want to keep track of the total amount of friends that we created and store it within one variable,
        // there is a way we can do that - using a STATIC modifier

        // when accessing a STATIC variable or calling a STATIC method it's actually best to do so through the class itself rather than any object created from that class

        //instead of using the friend1 object and then accessing the static member, we will instead use the name of the class

        System.out.println(Friend.noOfFriends);
        // total no.of friends = 4

        // it's better for clarity to access a static member by the name of the class itself, rather than any object
        // because you and other developers will know that this is a static attribute or method

        Friend.showFriends();
        // to call a static method, type the name of the class, in this case Friend followed by dot (.) and the name of the method

        // a place where you see the static method is the math class
        // lets say you would like to round a number, you will type the name of the math class followed by dot (.) and round, and you can now round a number

        Math.round(2.99);
        // we access it through class name of Math

        // we don't need to go ahead and create a math object - such as 'Math math1 = new Math();' and access it through this object - 'such as math1.round(2.99)', that would be silly

        // round() is a static method, it behaves like a utility method  - we can access it through the class name, and we don't need to create any Math's object
    }
}

// static = Makes a variable or method belong to the class rather than to any specific object. Commonly used for utility methods or shared resources
// Static variables share a single memory, so all objects access and modify the same value.

