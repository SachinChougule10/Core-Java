/*
    Demonstrates the use of the ternary operator in Java:
    - Provides a concise alternative to if-else
    - Evaluates a condition and returns one of two values
    - Examples include: pass/fail, even/odd, AM/PM, and tax rate selection
*/


package B_Conditionals;

public class B06_Ternary_Operator {

    public static void main(String[] args){

        // ternary operator (?) :- i) alternative to if-else statement
        //                         ii) return 1 of 2 values if a condition is true

        // variable = (condition) ? ifTrue : ifFalse ;

        int score = 33;
        int number = 4;
        int hours = 13;
        int salary = 60000;

        // 1) Pass or Fail :-

        String passOrFail = (score > 35) ? "Pass" : "Fail" ;
        System.out.println("Result: "+passOrFail);

        // 2) Even or Odd :-

        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("Number is: "+evenOrOdd);

        // 3) A.M. or P.M. :-

        String timeOfDay = (hours < 12) ? "A.M." : "P.M." ;
        System.out.println("Time of the day is: "+timeOfDay);

        // 4) taxRate :-

        String taxRate = (salary >= 40000) ? "0.25" : "0.15" ;
        System.out.println("Tax rate: "+taxRate);

    }
}
