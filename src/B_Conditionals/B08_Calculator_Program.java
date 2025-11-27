/*
 Calculator Program using enhanced switch (Java 14):
 --------------------------------------------------
 This program works like a simple calculator. It:
 1. Takes two numbers from the user
 2. Takes an operator (+, -, *, /, ^)
 3. Uses an enhanced switch statement to perform the operation
 4. Handles division by zero and invalid operators
*/


package B_Conditionals;

import java.util.Scanner;

public class B08_Calculator_Program {
    public static void main(String[] rags){

        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result=0;
        boolean isValidOperator = true;

        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();

        switch (operator){

            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0){
                    System.out.println("A number cannot be divided by zero!");
                    isValidOperator = false;
                }
                else{
                    result = num1 / num2;
                }
            }

            case '^' -> result = Math.pow(num1,num2);
            default -> {
                System.out.println("Invalid operator!");
                isValidOperator = false;
            }
        }

        if (isValidOperator){
            System.out.printf("Result of %.0f %c %.0f is: %.0f", num1,operator,num2,result);
        }

        scanner.close();

    }
}
