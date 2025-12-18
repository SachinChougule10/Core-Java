/*
 * This program demonstrates method overloading using a real-world example: baking pizza.
 *
 * It shows:
 *  - How multiple methods can share the same name but differ in their parameters.
 *  - How Java decides which overloaded method to call based on the number and type of arguments.
 *
 * Key Concept:
 *  - Compile-time polymorphism (method overloading)
 */

package D_Methods;

public class D02b_OverloadedMethodsExample1 {
    public static void main(String[] args){

        System.out.println(bakePizza("flatbread","mozerella","pepperoni"));
    }

    static String bakePizza(String bread){
        return bread + " " + "pizza";
    }

    static String bakePizza(String bread, String cheese){
        return cheese + " " + bread + " " + "pizza";
    }

    static String bakePizza(String bread, String cheese, String toppings){
        return bread  + " " + cheese + " " + toppings + " " + "pizza";
    }


}

// This is a form of compile-time polymorphism.
// if there are two or more methods with same name, we will end up using the method which match the number of parameters

// “The method that has the same number and type of parameters as the arguments passed in the method call will be used.”