package A_Basics;

public class A5_arithmetic_operators {
    public static void main(String[] args){

        // 1. Arithmetic Operators (+, -, *, /, %)

        int x = 10;
        int y = 3;
        int z;
        int w;
        int a;
        int b;
        int c;

        z = x + y;              // addition
        w = x - y;              // subtraction
        a = x * y;              // multiplication
        b = x / y;              // integer division
        c = x % y;              // modulus (remainder)


        System.out.println("z = "+z);
        System.out.println("w = "+w);
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);

        // 2. Augmented (shortcut) assignment operators (+=, -=, *=, /=, %=) :-

        int e = 20;
        int f = 10;

        int g = 15;
        int h = 25;

        int i = 40;
        int j = 20;

        int k = 30;
        int l = 5;

        int m = 20;
        int n= 4;

        e += f;               // e = e + f
        g -= h;               // g = g - h
        i *= j;               // i = i * j
        k /= l;               // k = k / l
        m %= n;               // m = m % n

        System.out.println("e = "+e);
        System.out.println("g = "+g);
        System.out.println("i = "+i);
        System.out.println("k = "+k);
        System.out.println("m = "+m);


    }
}
