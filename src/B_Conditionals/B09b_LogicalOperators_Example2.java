/*
 Logical Operators Example – Alternative Username Validation
 -----------------------------------------------------------
 This program demonstrates another way of using logical operators
 (OR, NOT, and AND) to validate a username.

 Validation rules:
 1. Username must be between 4 and 12 characters.
 2. Username must NOT contain spaces or underscores.

 This version shows how the same logic can be implemented using:
    - NOT (!) to invert a condition
    - OR (||) to detect invalid characters
    - AND (&&) as an alternative cleaner approach
*/


package B_Conditionals;

import java.util.Scanner;

public class B09b_LogicalOperators_Example2 {
    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);

        String username;

        System.out.println("Enter your username: ");
        username = scanner.nextLine();

        if(username.length() < 4 || username.length() > 12){
            System.out.println("Username must be between 4-12 characters.");
        }
        else if(!(username.contains(" ") || username.contains("_"))){
            System.out.println("Hello! "+ username);

        }

        else{
            System.out.println("Username should not contain underscores or spaces");
        }

        scanner.close();

    }
}



/*
Yes, you can write the same logic using && without the NOT operator:

else if (!username.contains(" ") && !username.contains("_")) {
    System.out.println("Hello! " + username);
}
 */
