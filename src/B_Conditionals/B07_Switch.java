/*
    Demonstrates the traditional switch statement in Java:
    - Used to execute different blocks based on a variable's value
    - Works with int, byte, short, char, String, and enums
    - Uses 'case', ':', and 'break' to control flow
    - Example: prints message based on the day of the week
*/


package B_Conditionals;

public class B07_Switch {
    public static void main(String[] args){

        /*
        switch statement :- 1) In Java, a switch statement is used to execute one block of code among many alternatives
                               based on the value of a variable.
                            2) It works with:
                               i) int, byte, short, char, String, enum types
                            3) Uses ':' and 'break'

        Enhanced switch :- A replacement to many else if statements (Java 14 feature)

        */

        String day = "Sunday";

        switch (day){

            case "Monday" :
                System.out.println("It is Monday today!");
                break;
            case "Tuesday" :
                System.out.println("It is Tuesday today!");
                break;
            case "Wednesday" :
                System.out.println("It is Wednesday today!");
                break;
            case "Thursday" :
                System.out.println("It is Thursday today!");
                break;
            case "Friday" :
                System.out.println("It is Friday today!");
                break;
            case "Saturday" :
                System.out.println("It is Saturday today!");
                break;
            case "Sunday" :
                System.out.println("It is Sunday today!");
                break;
            default :
                System.out.println("This day doesn't exists!");


        }


    }
}
