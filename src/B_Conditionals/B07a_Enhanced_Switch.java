/*
 Demonstrates Enhanced switch (Java 14+):
 - Uses '->'
 - No need for break
 - Allows comma-separated labels
*/

package B_Conditionals;

import java.util.Scanner;

public class B07a_Enhanced_Switch {
    public static void main(String[] args){

        // Enhanced switches :- i) The enhanced switch uses -> instead of : and doesn't require break.
        //                      ii) in enhanced switches we use arrow symbol and in traditional switches we use ':' and 'break'

        String day;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a day of the week: ");
        day = scanner.nextLine();

        switch (day){

            case "Monday","Tuesday","Wednesday","Thursday","Friday" -> System.out.println("Its a weekday.");
            case "Saturday","Sunday" -> System.out.println("Its a weekend!");
            default -> System.out.println("Its not a day of the week.");
        }

        scanner.close();

    }
}
