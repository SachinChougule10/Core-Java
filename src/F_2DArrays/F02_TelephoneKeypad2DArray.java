/**
 * Description:
 * This mini project demonstrates the use of a 2D array in Java by simulating a telephone keypad layout.

 * The program:
 *  - Creates a 2D char array representing a keypad
 *  - Uses nested enhanced for-loops to display the keypad in a row-column (grid) format
 */


package F_2DArrays;

public class F02_TelephoneKeypad2DArray {
    public static void main(String[] args){

        char[][] telephone= {{'1','2','3'},
                            {'4','5','6'},
                            {'7','8','9'},
                            {'*','0','#'}
        };


        // Printing the keypad using nested enhanced for loops
        for(char[] i : telephone){          // Iterates over each row
            for(char k : i){                // Iterates over each element in the row
                System.out.print(k+" ");
            }
            System.out.println();           // Moves to the next line after each row
        }

    }
}
