package I_Exception_Handling;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Example {
    public static void main(String[] args){

        // when we don't use try with resources, we need to take the input outside the try{} block, if we use it, it will be placed in the try{} block

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println(number);
        } catch (InputMismatchException i) {
            // InputMismatchException occurs when we expect a  specific data type, but get another data type as input rather than the specified one
            System.out.println("That wasn't a number: ");
            // we can use multiple catch blocks to handle more than one exception
        } catch (Exception j) {
            // there is also a catch all statement you can add
            // we can catch all the exceptions using the 'Exception'
            // catching all exceptions act as a safety net
            System.out.println("Something went wrong!");
        } finally {
            // finally{} block will always execute whether there is an exception or not
            // this is where we can clean up any resources, for eg:- if we forgot to close the scanner object, we can actually close it within the finally{} block
            System.out.println("This always executes");                                 // whether we get an exception or not this finally{} block will always execute
        }
    }
}


/* ----------------------------------------------------------------------------------------------------------------
Keyword                        |                            Purpose                                                |
-------------------------------------------------------------------------------------------------------------------
try	                           |                Place dangerous code inside this block                             |
catch	                       |                  Handle a specific type of exception                              |
finally	                       |                  Always executes (clean up resources)                             |
try-with-resources	           |            Automatically closes resources (Scanner, FileReader, etc.)             |
-------------------------------------------------------------------------------------------------------------------
 */
