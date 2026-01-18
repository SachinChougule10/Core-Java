/*
 * Description:
 * This program demonstrates basic exception handling in Java using try-catch blocks.
 * It handles ArithmeticException that occurs when dividing a number by zero, preventing the program from crashing and allowing graceful error handling.
 */


package I_Exception_Handling;

public class Main {
    public static void main(String[] args){

        // System.out.println(1/0);           // this causes an Arithmetic Exception error, because we cannot divide numbers by 0
        // this is a dangerous code i.e. cause an exception and will interrupt our normal flow of a program

        // any dangerous code that may cause exception, we are going to surround it by try{} block

        try{
            System.out.println(1/0);
        }
        // we will catch IF any exceptions, we need to mention the specific kind of exception we are going to catch, we will catch the Arithmetic Exception - this is the type
        // we will give this exception a nickname - e
        // if we encounter this exception, we will take a different course of action, instead of interrupting the program
        catch(ArithmeticException e){
            System.out.println("YOU CAN'T DIVIDE BY ZERO!");
            // instead of interrupting the program, we will get this as output after encountering an Arithmetic Exception
        }
    }
}

// Exception = An event that interrupts the normal flow of a program
// (Dividing by zero, file not found, mismatch input type)
// Surround  any dangerous code with a try{} block
// try{} - try any dangerous code, catch{} - catch any exceptions, finally{} - optionally we can add finally{} to do any resource cleanup
