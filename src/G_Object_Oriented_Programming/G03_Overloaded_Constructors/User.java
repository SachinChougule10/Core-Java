/*
 Description:
 This program demonstrates the concept of constructor overloading in Java.
 The User class contains multiple constructors with different parameter lists, allowing objects to be created with varying amounts of information.
 Default values are assigned when optional parameters are not provided.
*/

package G_Object_Oriented_Programming.G03_Overloaded_Constructors;

public class User {

    String username;
    String email;
    int age;

    User(String username){
        this.username = username;
        this.email = "Not Provided";
        this.age = 0;
    }
    // attributes 1)email and 2)age were optional, we assigned them some default values


    User(String username, String email){
        this.username = username;
        this.email = email;
        this.age = 0;
    }
    // we can create another object_oriented_programming.constructor with the same name, but we need a different set of parameters.
    // This is very similar to 'method overloading', we can have D_Methods.methods with the same name, but they need different parameters

    User(String username,String email, int age){
        this.username = username;
        this.email = email;
        this.age = age;
    }

    User(){
        this.username = "Guest";
        this.email = "Not provided";
        this.age = 0;
    }
    // we created a object_oriented_programming.constructor which takes no arguments


    // we can use either of the constructors depending on the arguments that are passed in
    // this would be useful in situation where some fields are optional
}
