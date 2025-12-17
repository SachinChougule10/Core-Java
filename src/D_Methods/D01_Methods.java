/*
 * This program demonstrates how to create and call methods in Java.
 * It shows:
 *  - How to pass arguments to a method
 *  - How parameters work
 *  - How to print formatted output using printf
 *  - The concept of variable scope between methods
 */

package D_Methods;

public class D01_Methods {
    public static void main(String[] args){

        String name = "Sachin";
        int age = 23;
        happyBirthday(name,age);                                        // variable in method call are called arguments

    }

    static void happyBirthday(String name, int age){                    // these are called parameters, it is not compulsory for arguments and parameters to have same name, only the data type must be same
        System.out.println("Happy Birthday!");
        System.out.printf("Happy Birthday Dear %s.\n",name);
        System.out.printf("You are %d years old.\n",age);
        System.out.println("Happy Birthday to you!");
    }
}



// method = a block of reusable code that is executed when called ()
// methods are totally unfamiliar of the variables defined in other methods

//parameters are in the method definition.
//Arguments are what you pass in during the method call.

//Variable Scope: Methods don’t know variables from other methods unless passed as parameters.