/**
 * Class Name: MyRunnable

 * Description:
 * This class implements the Runnable interface and runs
 * a countdown timer in a separate thread.

 * The timer counts down from 5 seconds and notifies the
 * user when the time is up.

 * This thread runs concurrently with the main thread.
 */

package K_ThreadingAndTimers.K01_Threading;

public class MyRunnable implements Runnable{

    @Override
    public void run(){
    // within this method we are going to add any code we want to run in the background, on a separate Thread
    // within our run() method we'll have this countdown timer running in the background on a separate Thread
    // any code you want to  run in a separate Thread, put it in the run() method
        for(int i = 1; i <= 5; i++){
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
                System.exit(0);
                // we will exit the program
            }
        }
    }
}
