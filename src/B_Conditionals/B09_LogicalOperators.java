/*
 Logical Operators in Java:
 --------------------------
 This program demonstrates the use of logical operators:
 1. AND (&&)  - returns true only if all conditions are true
 2. OR  (||)  - returns true if at least one condition is true
 3. NOT (!)   - reverses a boolean value

 The program checks weather conditions using these operators.
*/


package B_Conditionals;

public class B09_LogicalOperators {
    public static void main(String[] args){

        /*
         1) The logical operators AND, OR, and NOT are used to combine or negate boolean expressions.
         2) Logical operators are used to check multiple conditions at the same time.

         i)  AND (&&) :-
              - Returns true only if both conditions are true.
         ii) OR (||) :-
              - Returns true if at least one condition is true.
         iii) NOT (!) :-
              - Negates (make something opposite) a boolean value — true becomes false, and vice versa.

         */


        double temperature = 30;
        boolean isSunny = true;

        if(temperature <= 30 && temperature >= 0 && isSunny){
            System.out.println("The weather is good 😄");
            System.out.println("It is sunny outside 🌞");
        }
        else if(temperature <= 30 && temperature >=0 && !isSunny){
            System.out.println("Weather is good 😄");
            System.out.println("It is cloudy outside ☁️");
        }
        else if(temperature > 30 || temperature < 0){
            System.out.println("The weather is bad 😑");
        }


    }
}
