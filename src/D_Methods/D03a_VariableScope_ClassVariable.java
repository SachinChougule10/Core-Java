/*
 * VARIABLE SCOPE — CLASS VARIABLE VS LOCAL VARIABLE
 *
 * This program demonstrates how Java resolves variables when
 * a class variable and local variables share the same name.
 *
 * 1. `x = 50` → Class variable (visible to all methods in this class)
 * 2. `x = 20` → Local variable inside main()
 * 3. `x = 70` → Local variable inside doSomething()
 *
 * When a local variable has the same name as a class variable,
 * Java ALWAYS uses the local variable first (local scope has priority).
 */

package D_Methods;

public class D03a_VariableScope_ClassVariable {

    static int x = 50;         // Class variable

    public static void main(String[] args){
        int x = 20;     // Local variable
        System.out.println(x);
        doSomething();
    }
    static void doSomething(){
        int x = 70;     // Local variable
        System.out.println(x);

    }
}

// ii) Class variable :-
//    - Declared inside a class, but not within any methods
//    - They are recognized throughout the class
// In our analogy of house, we can say that our x = 50 variable is out in the street and both the methods main and doSomething can see it form their window
// If there are variables in local scope and class scope with the same name, Java likes to use the local variable first, hence we get x=20 and x=70