package A_Basics;

import java.util.Random;

public class A9_random_numbers {
    public static void main(String[] args){

        Random random = new Random();

        // 1) creating random integers

        int number1;
        int number2;
        int number3;

        number1 = random.nextInt();                                                     // integer range(limit) form -2,147,483,648 to 2,147,483,647
        number2 = random.nextInt(1,11);                                   // we can also specify origin(inclusive) and bound(exclusive)
        number3 = random.nextInt(100,200);

        System.out.println("First random number is: "+number1);
        System.out.println("Second random is: "+number2);
        System.out.println("Third random number is: "+number3);

        // 2) creating random double numbers

        double number4;

        number4 = random.nextDouble();                                                  // It returns a random double value between: 0.0 (inclusive) and 1.0 (exclusive)

        System.out.println("First random double number is: "+number4);

        // 3) creating random boolean values

        boolean isStudent;

        isStudent = random.nextBoolean();

        System.out.println("Random boolean value is: "+isStudent);

        // if 'true' then 'Heads', else 'Tails'

        if(isStudent){
            System.out.println("Heads!");
        }
        else{
            System.out.println("Tails!");
        }

    }
}
