package A_Basics;

public class A10_math_class {
    public static void main(String[] args){

        // 1) Maths constants :-

        System.out.println(Math.PI);            // pi value
        System.out.println(Math.E);             // euler's number / exponential constant


        // 2) 'Math.pow()' method :-

                // Math.pow(base, exponent)
                // base: the number you want to raise.
                // exponent: the power to which you want to raise the base.

        double result;
        result = Math.pow(2,4);
        System.out.println("2 to the power 4 is: "+result);

        // 3) 'Math.abs()' method :-

            // Math.abs(x) returns the absolute (positive) value


        double result1;
        result1 = Math.abs(-10);
        System.out.println("Absolute value of -10 is: "+result1);

        // 4) 'Math.sqrt()' method :-

        double result2;
        result2 = Math.sqrt(25);
        System.out.println("Square root of 25 is: "+result2);


        // 5) 'Math.round()' method :- Rounds the number to the nearest integer.
                                        // If the fractional part is ≥ 0.5, it rounds up.
                                        // If the fractional part is < 0.5, it rounds down.

        double result3;
        result3 = Math.round(34.567);
        System.out.println("Round of 34.567 is: "+result3);

        // 6) 'Math.ceil()' method :- Always rounds up to the nearest whole number.

        double result4;
        result4 = Math.ceil(3.14);
        System.out.println("Ceil of 3.14: "+result4);

        // 7) 'Math.floor()' method :- Always rounds down to the nearest whole number.

        double result5;
        result5 = Math.floor(3.14);
        System.out.println("Floor of 3.14 is: "+result5);

        // 8) 'Math.max()' method :- Finds max between two numbers.

        double result6;
        result6 = Math.max(10,20);
        System.out.println("Maximun number is: "+result6);

        // 9) 'Math.min()' method :- Finds min between two numbers.

        double result7;
        result7 = Math.min(10,20);
        System.out.println("Minimum number is: "+result7);
    }
}
