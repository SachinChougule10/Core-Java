/**

 * Description:
 * This program demonstrates the use of varargs (variable-length arguments) in Java.
 * It shows how a method can accept any number of integer arguments and process them
 * as an array. The program calculates and prints the sum of all provided numbers.

 */


package E_Arrays;

public class E06_Varargs {
    public static void main(String[] args){

        int total = add(1,2,3,4,5);
        System.out.println(total);
    }

    static int add(int... numbers){

        // Java compiler is packing all the arguments into an array named numbers, when we send the arguments to the method 'add'

        int sum = 0;

        for (int i : numbers){
           sum += i;
        }

        return sum;
    }
}


/*

    1) varargs :- i) allow a method to accept varying no.of arguments
               ii) makes method more flexible, no need for overloaded D_Methods.methods
               iii) Java will pack the arguments into an array

    2) Instead of creating a no.of D_Methods.methods that do the same thing, we could create a method that could accept any no.of arguments using 'varargs'

    3) '...' = ellipsis


 */
