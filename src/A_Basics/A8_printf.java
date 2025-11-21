package A_Basics;

public class A8_printf {
    public static void main(String[] args){

        // A_Basics.printf :- is a method used to format output
        // '%' :- placeholder for a variable
        // we can use [flags][width][.precision][specifier-character]
        // specifier characters for:-
            // 1) String = s
            // 2) char = c
            // 3) int = d
            // 4) double = f
            // 5) boolean = b

        // 1) specifier characters :-

        String name = "Sachin";
        char firstletter = 'S';
        int age = 23;
        double height = 5.7;
        boolean isEmployed = true;

        System.out.printf("Hello! %s. \n",name);
        System.out.printf("Your name starts with: %c. \n",firstletter);
        System.out.printf("You are %d years old.\n",age);
        System.out.printf("You are %.1f feet tall.\n",height);
        System.out.printf("Employed: %b\n",isEmployed);

        System.out.printf("%s is %d years old.\n",name,age);                                    // we can also use multiple placeholders in a single statement


        // 2) precision :- used to limit the no.of digits after decimal point (if we do not specify a precision, we will by default get 6 digits after decimal)

        double price1 = 90000.99;
        double price2 = 10000.15;
        double price3 = -54000.01;

        System.out.printf("%.1f\n",price1);
        System.out.printf("%.2f\n",price2);
        System.out.printf("%.3f\n",price3);

        // 3) flags :-

        // i) '+' = The + flag in Java's A_Basics.printf always shows the sign of the number:
                    //For positive numbers, it adds a + in front.
                    //For negative numbers, the - is displayed as usual (unchanged).

        System.out.printf("%+.2f\n",price1);
        System.out.printf("%+.2f\n",price2);
        System.out.printf("%+.2f\n",price3);

        // ii) ',' = Adds grouping separators (commas for thousands) to large numbers.


        System.out.printf("%,.1f\n",price1);
        System.out.printf("%,.1f\n",price2);
        System.out.printf("%,.1f\n",price3);

        // iii) '(' :- negative numbers are enclosed in ()

        System.out.printf("%(.1f\n",price1);
        System.out.printf("%(.1f\n",price2);
        System.out.printf("%(.1f\n",price3);

        // iv) space :- displays a minus if negative, space if positive


        System.out.printf("% .1f\n",price1);
        System.out.printf("% .1f\n",price2);
        System.out.printf("% .1f\n",price3);



        // 4. width :- The width flag in Java's A_Basics.printf is used to specify the minimum number of characters to be printed.
        // If the actual content is shorter, it is padded with spaces (by default, on the left) to meet the width requirement.


        // i) zero (0) padding :-

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%04d\n",id1);
        System.out.printf("%04d\n",id2);
        System.out.printf("%04d\n",id3);
        System.out.printf("%04d\n",id4);

        // ii) positive number :- used for right justified padding (adds spaces on the right)

        System.out.printf("%4d\n",id1);
        System.out.printf("%4d\n",id2);
        System.out.printf("%4d\n",id3);
        System.out.printf("%4d\n",id4);

        // iii) negative number :- used for left justified padding (adds spaces on then left)

        System.out.printf("%-4d\n",id1);
        System.out.printf("%-4d\n",id2);
        System.out.printf("%-4d\n",id3);
        System.out.printf("%-4d\n",id4);

    }
}
