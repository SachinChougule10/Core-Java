/*
 * PROGRAM: Local Variable Scope Demonstration
 *
 * This program shows how local variable scope works in Java.
 * - A local variable is declared inside a method.
 * - It can only be accessed within that method.
 * - Different methods can have variables with the same name without conflict,
 *   because each method has its own separate scope.
 */

package D_Methods;

public class D03b_VariableScope_LocalVariable {

    public static void main(String[] args){

        int x = 10;     // Local variable

        doSomething();
    }

    static void doSomething(){
        int x = 20;                     // Local variable                // we can have variables with same name in different methods
        System.out.println(x);          // this will not print x=10, as x = 20 in context of doSomething() method and  this method isn't aware of existence of 'x' in the upper method

    }
}

/*

 variable scope : - where a variable can be accessed
 Two levels of scope :- i) Local ii) Class

i) Local variable :-
     - A variable declared inside a method has a 'local scope'
     - Local variable is only recognized inside the method it is declared, other methods aren't aware of its existence
     - 'x' in main method and 'x' in doSomething method are like neighbours, they can't see inside each other's house


✅ Why We Pass Local Variables as Arguments:
- Local variables only live within the method where they’re declared. If you want to use their values in another method,
 you need to pass them as arguments — because that’s the only way to make their data available elsewhere
- Each method is its own little world, and arguments are like a bridge between them.

 */
