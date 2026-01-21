/**
 * Program Name: User Input Timer using Multithreading

 * Description:
 * This program demonstrates the use of multithreading in Java.
 * A background thread runs a 5-second countdown timer while the
 * main thread waits for user input.

 * If the user does not enter their name within 5 seconds,
 * the program prints "Time's up!" and terminates.

 * Concepts Used:
 * - Multithreading
 * - Runnable interface
 * - Thread lifecycle
 * - Blocking I/O (Scanner)
 *
 */

package K_ThreadingAndTimers.K01_Threading;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        MyRunnable myRunnable = new MyRunnable();

        // we will take this runnable object and pass it into the Constructor of the Thread class
        Thread thread = new Thread(myRunnable);

        // if your Main Thread is done you can end all other but you'll want to set those threads to Daemon threads
        // a Daemon Thread will end once the Main Thread is over
        // for that we will call the .setDaemon() method, this Thread is going to end as soon as our Main Thread is finished
        thread.setDaemon(true);

        // we will start this thread using .start() method
        thread.start();

        System.out.println("You have 5 seconds to enter your name");

        // normally we would use a for loop to make the user enter their name in 5 seconds

        /** for(int i = 0; i <= 5; i++){
            try{
                // Thread refers to the Thread we are working with - its Main Thread here now
                Thread.sleep(1000);
                // this is placed in try block, as it is a dangerous code as sleep may have interruptions
            }
            catch(InterruptedException e){
                System.out.println("Thread was interrupted!");
            }

            if(i == 5){
                System.out.println("Time's up!");
            }
        }
         */

        // but this will not work as we intended, the program will wait till the loop is completed i.e. for 5 secs
        // and then we will be prompted to enter our name, because all of our code in running on the same single Thread - Main

        // so what we can do is create a separate Thread where we are counting till 5
        // and our Main  Thread will be in charge of expecting of user input
        // we will create another Thread by extending the Runnable interface to create a runnable object
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
        scanner.close();
    }
}

// Threading = Threading allows a program to run multiple tasks simultaneously
// Helps improve performance with time-consuming operations (File I/O, network communications, or any background tasks)

// How to create a Thread :-
// Option 1. Extend the Thread class (simpler)
// Option 2. Implement the Runnable interface (better)

