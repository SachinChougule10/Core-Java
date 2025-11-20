package A_Basics;

public class A2_variables
{
    public static void main(String[] args)
    {
        /* 1. variable :- a reusable container for a value.
                          a variable behaves as if it was the values it contains.
            - There are two types of data types :-
                1. Primitive :- simple value stored directly in the memory (stack)
                2. Reference :- memory address (stack) that points to the objects in the heap

            - Primitive vs Reference data types :-

              Primitive                       vs               Reference
              ----------                                       ---------
              int (whole numbers)                              String
              double (decimal)
              char (single character)
              boolean (T or F)



            2. Two steps to create a variable in java :-
                i. declaration
                ii. assignment


         */


        // 1. integer datatype (whole numbers) :-

        int age = 23;
        int year = 2025;
        int quantity = 1;

        System.out.println(age);
        System.out.println(year);
        System.out.println(quantity);

        System.out.println("Current year is : " + year);

        // 2. double data type (decimal numbers) :-

        double price = 19.99;
        double cgpa = 7.55;
        double temperature = 40.60;

        System.out.println("The price is : $ " + price);
        System.out.println("My cgpa is : " + cgpa);
        System.out.println("Today's temperature is : " + temperature + " C");

        // 3. char data type (can hold only one single character at a time) :-

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        System.out.println("I got a " + grade + " grade.");

        // 4. boolean data type (True or False) :-

        boolean isStudent = true;
        boolean isOnline = true;
        boolean forSale = false;

        System.out.println(isStudent);
        System.out.println(forSale);


        // 5. String data type (series of characters) :-

        String name = "Sachin Chougule";
        String email = "sachinchougule5762@gmail.com";
        String car = "Mustang";

        System.out.println("My name is " + name);
        System.out.println("I am " + age + " years old." );


        if (forSale)
        {
            System.out.println("There is a " + car + "for sale.");
        }
        else
        {
            System.out.println("The " + car + " is not for sale.");
        }


        if (isStudent){
            System.out.println("You are a student.");
        }
        else{
            System.out.println("You are not a student.");
        }
    }
}


// In Java, the term "reference" in reference data type means that the variable stores the memory address (or reference) of the actual data, rather than the data itself
// Reference = a pointer or link to the memory location where the actual data/object is stored.
