/*
    Program: If Statements in Java
    Description:
        This program demonstrates how 'if', 'else if', and 'else' statements work.
        It checks:
        - Whether the user entered a name
        - Age category (child, adult, senior, etc.)
        - Whether the user is a student
*/


package B_Conditionals;

import java.util.Scanner;

public class B01_IfStatements {
    public static void main(String[] args){

        // if statements :- performs a block of code if its condition is true

        Scanner scanner = new Scanner(System.in);

        String name;
        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        int age;
        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        boolean isStudent;
        System.out.print("Are you a student? (true/false): ");
        isStudent = scanner.nextBoolean();


        // Group 1 :- Check name

        if (name.isEmpty()){                                                                // '.isEmpty()' string method to check whether a string is empty or not
            System.out.println("You have not entered your name!");
        }
        else{
            System.out.println("Hello! "+name);
        }



        // Group 2 :- Check age category

        if (age > 60){
            System.out.println("You are a senior citizen!");
        }
        else if (age >= 18){
            System.out.println("You are an adult!");
        }

        else if(age < 0){
            System.out.println("You are not born yet!");
        }
        else if(age == 0){
            System.out.println("You are a baby yet!");
        }
        else{
            System.out.println("You are a child!");
        }


        // Group 3 :- Check whether you are a student or not

        if(isStudent){
            System.out.println("You are enrolled as a student!");
        }
        else{
            System.out.println("You are not enrolled as a student!");
        }

        scanner.close();
    }
}


/*
    we have to keep into consideration the order of the statements, if any one  of the statement is true, it will be executed
    and all other will be ignored even if other statements are also true

 */
