/*
 * Description:
 * This program demonstrates the use of **Wrapper Classes** in Java and explains how primitive data types can be converted into objects and vice versa.

 * Concepts Covered:
 * - Deprecated way of creating wrapper objects using constructors
 * - Autoboxing: automatic conversion of primitives into wrapper objects
 * - Unboxing: converting wrapper objects back into primitives
 * - Converting primitives to strings using wrapper class utility methods
 * - Parsing strings into primitive data types
 * - Common utility methods provided by wrapper classes (Character methods)

 * This example helps understand why wrapper classes are useful when working with collections, utility methods, and object-based APIs in Java.
 */


package G_Object_Oriented_Programming.G17_Wrapper_Classes;

public class Main {
    public static void main(String[] args){
    /*
        // depreciated method of declaring wrapper classes :- we should not use this, it's just for visualization

        // suppose we have an 'int a = 123', we can treat '123' as an object using a wrapper class
        // we will use a wrapper class on Integer for this, and pass in that number as an argument

        Integer a = new Integer(123);

        // 'a' is an object, we are passing in that primitive data type - int as an argument to the Integer class
        // so 'a' is an object, but it contains a primitive value

        // if you need a Double we will use a wrapper class of Double and pass in a double as an argument
        Double b = new Double(3.22);

        // Character wrapper class for char
        Character c = new Character('c');

        // Boolean wrapper class for boolean
        Boolean d = new Boolean(true);

     */

        // AUTOBOXING :- similar to wrapping up a gift
        // Modern way to use wrapper classes is actually just to assign them directly to their primitive values, this technique is called 'Autoboxing'

        Integer a = 123;
        Double b = 3.22;
        Character c = 'c';
        Boolean d = true;

        // we are directly assigning these primitives into an object using a wrapper class

        // UNBOXING :- similar to unboxing the gift
        // There is also a technique called unboxing to convert a wrapper class back to its primitive

        // let's say we want to convert our integer object 'a' back to its primitive

        int x = a;
        // this is unboxing, we are taking a primitive that's wrapped in an object and unboxing it, unwrapping it and setting it back it to its primitive

        double y = b;
        char z = c;
        boolean s = d;

        // if you ever need to convert a primitive data type into a string, there is a toString method of this wrapper classes

        String e = Integer.toString(123);
        // we can convert  an integer into a string using the integer wrapper class, its accessed statically so we type the name of the class - Integer,
        // call the toString() method, which is static and pass in an integer

        String f = Double.toString(3.22);
        // we will access the Double wrapper class, call the toString() method and pass in a double

        String g = Character.toString('c');
        // we will access the Character wrapper class, call the toString() method and pass a character

        String h = Boolean.toString(true);
        // we will access the Boolean wrapper class, call the toString() method and pass a boolean

        // strings can be concatenated
        String i = e + f + g + h;

        System.out.println(i);                              // output :- 1233.22ctrue  (one long string)

        // so if you need to convert a primitive data type to a string, use that primitive data type's wrapper class and call the toString() method and pass a value, then it will give you a string value


        // if you ever need to convert a string into a primitive data type, there is another useful utility method of wrapper classes

        int j = Integer.parseInt("123");
        // to convert a string value to an int, we are going to access the Integer wrapper class and call the parseInt() a static method and pass a string value

        double k = Double.parseDouble("456");
        // to convert a string value to a double, we are going to access the Double wrapper class and call the parseDouble() a static method and pass a string value

        char l = "Pizza".charAt(0);
        // characters don't have a parse() method. Instead if we have a string, Strings have a built in 'charAt()' method, which will give the index of the specified character

        boolean m = Boolean.parseBoolean("true");
        // to convert a string value to a boolean, we are going to access the Boolean wrapper class and call the parseBoolean() a static method and pass a string value

        // Some more miscellaneous D_Methods.methods

        char letters = 'b';
        char symbols = '@';
        System.out.println(Character.isLetter(letters));
        System.out.println(Character.isLetter(symbols));
        // let's say we have a character, we can check if it's actually a letter using built in utility 'isLetter()' method, we acn access the Character wrapper class, call the isLetter() method and pass in our character
        // this returns a boolean

        // there is utility method too, to check whether a character is uppercase or not - isUpperCase() method
        System.out.println(Character.isUpperCase(letters));

        // these methods can be useful to verify user details like username and password
    }
}

// Wrapper classes = Allow primitive values (int, char, double, boolean) to be used as objects.
// "Wrap them in an object"
// Generally, don't wrap primitives unless you need an object.
// Allows use of Collections Framework and static Utility Methods
