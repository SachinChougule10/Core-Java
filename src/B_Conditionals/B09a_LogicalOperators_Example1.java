/*
 Logical Operators Example – Username Validation
 ------------------------------------------------
 This program demonstrates the use of logical operators (|| and &&)
 to validate a username based on the following rules:

 1. Username must be between 4 and 12 characters.
 2. Username must NOT contain spaces or underscores.

 It uses OR (||) to check invalid conditions and ensures clean input handling.
*/


package B_Conditionals;

import java.util.Scanner;

public class B09a_LogicalOperators_Example1 {
    public static void main(String[] args){

        // username must be between 4 - 12 characters
        // username must not contain underscores or spaces


        Scanner scanner = new Scanner(System.in);

        String username;

        System.out.print("Enter your username: ");
        username = scanner.nextLine();

        if(username.length() < 4 || username.length() > 12){
            System.out.println("Username must be between 4-12 characters.");
        }
        else if(username.contains(" ") || username.contains("_")){
            System.out.println("Username should not contain underscores or spaces.");
        }
        else{
            System.out.println("Hello! "+ username);
        }


        scanner.close();
    }
}
