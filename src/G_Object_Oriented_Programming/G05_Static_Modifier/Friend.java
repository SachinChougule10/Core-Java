package G_Object_Oriented_Programming.G05_Static_Modifier;

/*
-- Code without STATIC modifier

public class Friend {
    String name;
    int noOfFriends;

    Friend(String name){
        this.name = name;
        noOfFriends++;
    }
}

*/


public class Friend {
    String name;
    static int noOfFriends;             //precede data type of this attribute with STATIC modifier

    Friend(String name){
        this.name = name;
        noOfFriends++;
    }

    // methods can also be modified by the static keyword

    static void showFriends(){
        System.out.println("You have " + noOfFriends+ " total friends." );
        // normally when you access an attribute, we write 'this.name_of_attribute'
        // when you are working with a static attribute, you don't need 'this', 'this' refers to the object you are currently working with
        // but this attribute belongs to the class, we don't need 'this'
    }
}

// why static modifier :- rather than all objects all friend objects, having their own copy of number of friends, they are going to share one
// it's as if all these objects are sharing the same variable, rather than any one object having ownership rather the Friend class owns it and all objects have access to it