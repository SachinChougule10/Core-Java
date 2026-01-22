/**

 * Description:
 * This class implements the Runnable interface and represents
 * a task that can be executed by a thread.

 * Each instance prints a specific text ("PING" or "PONG")
 * five times with a one-second delay between prints.

 * Multiple instances of this class can run concurrently
 * in different threads.
 */

package K_ThreadingAndTimers.K02_Multithreading;

public class MyRunnable implements Runnable{

    private final String text;

    MyRunnable(String text){
        this.text = text;
    }

    @Override
    public void run(){
        // whatever is in the run() method, is the code that's going to perform when this thread is up and running

        for(int i = 1; i <= 5; i++){
            try{
                Thread.sleep(1000);
                // System.out.println(Thread.currentThread().getName() + " " + i);     // get Thread name along with 'i'
                System.out.println(text);
            }
            catch(InterruptedException e){
                System.out.println("Thread was interrupted!");
            }
        }
    }
}
