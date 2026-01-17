/*
 This program demonstrates the use of Enums in Java by representing days of the week.
 The user is asked to input any day (e.g., Monday, Tuesday).
 The input is converted to uppercase and matched with the corresponding enum constant.

 If the input matches a valid day from the Day enum, the program checks whether the day
 is a weekday or a weekend using a switch expression and prints the result.

 If the user enters an invalid day (anything not defined in the Day enum),
 an IllegalArgumentException is thrown, which we handle to display a friendly error message.

 The enum 'Day' also stores a day number (1 to 7), showing how enums can hold additional data
 using constructors and fields.
*/


package H_Collections_and_Utilities.H04_Enums;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner =  new Scanner(System.in);
        System.out.print("Enter a day: ");
        String response = scanner.nextLine().toUpperCase();

        try{
            // Day day = new Day();
            // instead of doing this, we write this-
            Day day = Day.valueOf(response);

           // valueOf() turns a String → enum constant. If the string matches → success. If it doesn’t match → throws exception

            // System.out.println(day);    // get the Day of the week
            // System.out.println(day.getDayNumber());     // get the number associated with the day

            switch(day){
                case MONDAY,
                     TUESDAY,
                     WEDNESDAY,
                     THURSDAY,
                     FRIDAY -> System.out.println("It is a weekday");
                case SATURDAY,
                     SUNDAY -> System.out.println("It is a weekend!!");
            }
        }
        catch(IllegalArgumentException e){
            System.out.println("Please enter a valid day!");
        }

    }
}

// Enums = (Enumerations) A special kind of class that represents a fixed set of constants.
// They improve code readability and are easy to maintain.
// More efficient with switches rather than comparing Strings


/*
 We use a try–catch block because an invalid input never reaches the switch statement.

 When the user enters a day, we convert it to an enum using:
     Day day = Day.valueOf(response);

 The valueOf() method will throw an IllegalArgumentException if the input
 does not exactly match any of the defined enum constants (MONDAY, TUESDAY, etc.).

 For example:
     "MONDDAY", "friyay", "abc"
 are not valid enum names, so valueOf() fails immediately.

 This means:
     - The switch(day) block is never executed for invalid input.
     - A default case in the switch cannot run, because the switch is skipped entirely.
     - The program would crash without a try–catch.

 Therefore, we use try–catch to safely handle invalid input before the switch,
 and to display a friendly message like "Please enter a valid day!" instead of crashing.
*/
