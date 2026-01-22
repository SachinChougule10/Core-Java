/**
 * Description:
 * This program demonstrates true multithreading in Java.
 * Two separate threads are created using the Runnable interface.

 * One thread repeatedly prints "PING" and the other prints "PONG"
 * at one-second intervals. Both threads run concurrently.

 * The main thread waits for both worker threads to complete
 * execution using the join() method before printing "GAME OVER!".

 * Concepts Used:
 * - Multithreading
 * - Runnable interface
 * - Thread lifecycle
 * - Thread synchronization using join()
 */

package K_ThreadingAndTimers.K02_Multithreading;

public class Main {
    public static void main(String[] args){
    /**    MyRunnable myRunnable = new MyRunnable();
        // we have to pass this myRunnable object to a Thread object

        Thread thread = new Thread(myRunnable);
    */

        // instead of creating a named runnable object, we can pass in an anonymous runnable object, to the thread constructor
        // this too will work the same way
        Thread thread1 = new Thread(new MyRunnable("PING"));
        Thread thread2 = new Thread(new MyRunnable("PONG"));

        System.out.println("GAME START!");
        thread1.start();     // to start the thread we will use the .start() method
        thread2.start();
        // both these threads will run concurrently

        // we can have our Main Thread wait for thread1 and thread2 to finish, by calling the join method of each thread
        try{
            thread1.join();
            thread2.join();
        }
        catch(InterruptedException e){
            System.out.println("Main thread was interrupted");
        }

        // before we display GAME OVER, we are going to wait for our two Threads to finish
        System.out.println("GAME OVER!");

    }
}

// Multithreading = Enables a program to run multiple threads concurrently
//                  (Thread = A set of instructions that run independently)
//                  Useful for background tasks or time-consuming operations
