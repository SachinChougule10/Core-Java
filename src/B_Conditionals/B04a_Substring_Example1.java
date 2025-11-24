/*
    This program takes an email as input and extracts:
    - The username (everything before '@')
    - The domain (everything after '@')

    It uses:
    - substring() to cut specific parts of the string
    - indexOf("@") to locate the split point
    - contains("@") to validate the email format

    If '@' is missing, it prints an error message.
*/


package B_Conditionals;

import java.util.Scanner;

public class B04a_Substring_Example1 {
    public static void main(String[] args){

       Scanner scanner = new Scanner(System.in);

       String email;
       String username;
       String domain;

       System.out.print("Enter your email: ");
       email = scanner.nextLine();

       if(email.contains("@")){

           username = email.substring(0,email.indexOf("@"));
           domain = email.substring(email.indexOf("@")+1);

           System.out.printf("Your username is: %s\n",username);
           System.out.printf("Your domain is: %s\n",domain);
       }
       else{
           System.out.println("Invalid email,\nEmail must contain '@'. ");
       }

        scanner.close();
    }
}
