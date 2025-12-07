// This program demonstrates various types of for loops,
// including incrementing, decrementing, and stepping by custom values.


package C_Loops;

public class C02_ForLoop {
    public static void main(String[] args){

        // for loop = execute some code a CERTAIN number of times
        // while loop = while loop executes a code infinite number of times until its condition is false

        // for loop includes :- i) initialization ii) condition iii) update

        // increment by 1 :-

        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }

        // decrement by 1 :-

        for (int j = 10; j > 0; j--){
            System.out.println(j);
        }

        // increment by a certain number :-

        for (int k = 0; k < 10; k+=2){
            System.out.println(k);
        }

        // decrement by a certain number :-

        for (int l = 10; l > 0; l-=3 ){
            System.out.println(l);
        }



    }
}
