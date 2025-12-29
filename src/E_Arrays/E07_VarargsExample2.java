/**

 * Description:
 * This program demonstrates another use case of varargs in Java by calculating the average of a variable number of double values.
 * It also handles the edge case where no arguments are passed to prevent division by zero.

 */


package E_Arrays;

public class E07_VarargsExample2 {

    public static void main(String[] args){

        System.out.println(average(1,2,3,4,5));

    }

    static double average(double... integers){

        //Syntax of varargs :-
        // datatype_our_method_will_accept... name_of_array
        // Java internally converts varargs into an array


        // Check to avoid division by zero when no arguments are passed
        if(integers.length == 0){
            return 0;
        }

        double sum = 0;

        // Enhanced for loop to add all values
        for (double i : integers){
            sum += i;
        }

        return sum/integers.length;
    }
}
