/*
   This file demonstrates the most commonly used String methods in Java:
   - length(), charAt(), indexOf(), lastIndexOf()
   - toUpperCase(), toLowerCase(), trim(), replace()
   - isEmpty(), contains(), equals(), equalsIgnoreCase()

   Strings in Java are immutable, so each method returns a new modified string
   without changing the original.
*/


package B_Conditionals;

public class B03_StringMethods {
    public static void main(String[] args){

        String name = "Sachin Chougule";
        String name2 = "    Rolex    ";
        String name3 = "Roorke";
        String name4 = "password";

        int length = name.length();
        char letter = name.charAt(3);
        int index = name.indexOf("c");
        int index2 = name.lastIndexOf("u");

        String upper_name = name.toUpperCase();
        String lower_name = name.toLowerCase();
        String trimmed_name = name2.trim();
        String replaced_name = name3.replace("o","e");

        System.out.printf("Length of the string: %s\n",length);
        System.out.printf("Char at your given index is: %c\n",letter);
        System.out.printf("Index of given character is: %d\n",index);
        System.out.printf("Last index of 'u' is: %d\n",index2);

        System.out.println("Uppercase: "+upper_name);
        System.out.println("Lowercase: "+lower_name);
        System.out.println("Trimmed name: "+trimmed_name);
        System.out.println("Replaced name is: "+replaced_name);

        // isEmpty() method :-

        if (name2.isEmpty()){
            System.out.println("Your string is empty.");
        }
        else{
            System.out.println("Your string is not empty.");
        }

        // .contains() method :-

        if(name.contains(" ")){
            System.out.println("Your string contain spaces.");
        }

        else{
            System.out.println("Your string doesn't contain any spaces.");
        }

        // .equals() method :-

        if(name4.equals("password")){
            System.out.println("Your name can't be your password.");
        }
        else{
            System.out.println("Hello! "+name4);
        }

        // .equalsIgnoreCase() method :-

        if (name4.equalsIgnoreCase("Password")){
            System.out.println("You name can't be your password.");
        }
        else{
            System.out.println("Hello! "+name4);
        }

    }
}


/*
    ===========================
    STRING METHODS EXPLAINED
    ===========================

    1. length()
       - Returns the total number of characters in the string.

    2. charAt(index)
       - Returns the character at the specified index.

    3. indexOf("text")
       - Returns the first occurrence index of the given character or substring.

    4. lastIndexOf("text")
       - Returns the last occurrence index of the character or substring.

    5. toUpperCase()
       - Converts the string to uppercase.

    6. toLowerCase()
       - Converts the string to lowercase.

    7. trim()
       - Removes leading and trailing spaces.

    8. replace(old, new)
       - Replaces characters or substrings with new ones.

    9. isEmpty()
       - Checks whether the string is empty.

    10. contains("text")
        - Checks if the string contains the given substring.

    11. equals("text")
        - Compares two strings for exact match (case-sensitive).

    12. equalsIgnoreCase("text")
        - Compares strings ignoring case differences.
*/

