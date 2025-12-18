/*
 * This program demonstrates method overloading in Java.
 *
 * It shows:
 *  - How multiple methods can share the same name but have different parameter lists
 *  - How Java selects the correct method based on the method signature
 *  - Examples of overloaded 'add' methods with different numbers of parameters
 *
 * Key Concepts:
 *  - Method Overloading: Same method name, different parameters
 *  - Method Signature: Method name + parameter types (NOT the return type)
 */

package D_Methods;

public class D02a_OverloadedMethods {
    public static void main(String[] args){

        // overloaded methods :- methods that share the same name, but different parameters
        // method signature = method's name + parameters

        System.out.println(add(2,3,5,6));

    }

    static double add(double a, double b){
        return a + b;
    }

    static double add(double a, double b, double c){
        return a + b + c;
    }

    // when we try to pass 3 arguments in the up given method, which accepts only 2 arguments, we will get an error that 'Expected 2 arguments but found 3'.
    // solution for this is that we can create a method with same name 'add', having different parameters


    static double add(double a, double b, double c, double d){
        return a + b + c + d;
    }
}


/*

1) Two methods can have same name and different parameters,
   but two methods cannot have same name and same parameters.
-  Java gives an error of method is already defined in the specific file name.

2) No two methods can have same method signature

 */