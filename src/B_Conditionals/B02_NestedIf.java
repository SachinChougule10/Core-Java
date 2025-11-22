/*
    Program: Nested If Statements in Java
    Description:
        This program demonstrates how nested if-else statements work.
        It applies discounts based on:
        - Whether the person is a student
        - Whether the person is a senior citizen

        Discounts:
        - Student: 10%
        - Senior: 20%
        - Student + Senior: 30% (20% + 10%)
*/


package B_Conditionals;

public class B02_NestedIf {
    public static void main(String[] args){

        boolean isStudent = true;
        boolean isSenior = true;
        double price = 9.99;

        if(isStudent){
            if(isSenior){
                System.out.println("You get a senior discount of 20%.");
                System.out.println("You also get a student discount 0f  10%.");
                price *= 0.7;
            }
            else{
                System.out.println("You get a student discount of 10%");
                price *= 0.9;
            }

        }
        else{
            if (isSenior){
                System.out.println("You get a senior discount of 20%.");
                price *= 0.8;
            }
            else{
                price *= 1;
            }
        }


        System.out.printf("The price of ticket is: $ %.2f", price);
    }
}
