package A_Basics;

import java.util.Scanner;

// a SCANNER is an object which allows us to accept user input in Java
// to use SCANNER we need to import it from certain package called as 'utilities'

public class A3_user_input {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


        // Scanner class has many next methods.
        //We create a Scanner object and access these methods using the dot operator.


        System.out.println("Enter your name: ");                    // if we use 'println' the prompt displayed and the string we type will not be on the same line
        String name = scanner.nextLine();                           // 'nextLine()' and 'next()' are the methods used to read string in java

        System.out.print("Enter your country: ");                   // if we use 'print' the prompt displayed and the string we type will be in the same line
        String country = scanner.next();                            // 'next()' doesn't read spaces, if you type spaces it will only display the string before the space.

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();                                // 'nextInt()' is a method to read integers


        System.out.println("Enter your cgpa: ");
        double cgpa = scanner.nextDouble();                         // 'nextDouble()' is a  method used to read decimal numbers


        System.out.println("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();                      // 'nextBoolean() is a method to read boolean values'


        System.out.println("Hello " + name + ".How are you?");
        System.out.println("You belong to " + country + ".");
        System.out.println("You are " + age + " years old.");
        System.out.println("You have a " + cgpa + " cgpa.");

        if (isStudent){
            System.out.println("You are enrolled as a student!");
        }
        else{
            System.out.println("You are not a student.");
        }

        scanner.close();
    }
}


/*

PART1 :- Scanner scanner = new Scanner (System.in)

    1. Scanner :- is a class in Java, used to take input from the user (like from keyboard, files, etc.).

    2. scanner :- i) scanner is the object that we created from the Scanner class.
                  ii) scanner is a variable (object reference variable.)
                  iii) scanner doesn't directly store the whole object.
                  It just stores the address (reference) where the object is located in memory.

    3. new :-     i) new is a keyword in Java used to create a new object from a class.
                  ii) After writing new, we specify which class's object we want to create — in this case, a Scanner object.

    4. new Scanner(System.in) :-  means you are creating a new Scanner object that takes input from the keyboard (System.in).





    Summary :-

    Part	                                                What it is
    ---------------------------                             --------------------------
    1.Scanner	                                            Data type (like int, String, but here it’s a class type)
    2.scanner	                                            Variable (specifically an object reference variable)
    3.new Scanner(System.in)	                            Actual object being created


    In short:
    You are telling Java:
    "Hey, create a new Scanner object that takes input from the keyboard and call it scanner!"




PART 2 :-

String name = scanner.nextLine();

    1) String :- Data type
    2) name :- Variable name (to hold the user input).
    3) = :- 	Assignment operator (store the result into name).
    4) scanner :- Your Scanner object (which holds the reference to the Scanner in memory).
    5) . :- Dot operator (to call a method of the Scanner object).
    6) nextLine() :- i. reads a string of characters including spaces
                        (if we don't want any spaces, we use only 'next' instead of 'nextline')
                    ii. Method that waits for the user to enter a full line of text, and then returns it as a String.


What happens in this line? :-

    1) You use your scanner object to call the nextLine() method.

    2) Java waits for the user to type something and press Enter.

    3) The full text that the user entered gets returned.

    4) That returned text is stored into the name variable.


So:

    1) scanner.nextLine() → reads what the user typed.

    2) String name = → saves the text into the variable name.


PART 3 :- scanner.close() :-

-What does scanner.close() do?
    1. scanner.close() closes the Scanner object.
    2. It releases the resources that were being used for input (like the connection to the keyboard input, System.in).
    3. After closing, you cannot use that Scanner object again.
       (If you try, Java will throw an exception.)




  - Explanation of contents of the SCANNER class :-
    The Scanner object is a perfect example of a reference data type.

  - When you write:-

    Scanner scanner = new Scanner(System.in);

    Here's what happens:-

    ✅ System.in
    This is a predefined input stream in Java that represents standard input (typically the keyboard).

    ✅ new Scanner(System.in)
    This creates a new Scanner object in memory, and it’s set up to read from the keyboard (System.in).

    ✅ Scanner scanner
    scanner is a reference variable.

    It doesn't store the Scanner object itself, but instead stores the reference (memory address) pointing to that Scanner object.
 */