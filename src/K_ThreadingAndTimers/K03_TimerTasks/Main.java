/**
 * Description:
 * This program demonstrates the use of Java's Timer and TimerTask classes to schedule and execute a task periodically.

 * Functionality:
 * - Prints "Hello" to the console every 2 seconds
 * - Starts execution after an initial delay of 1 second
 * - Executes the task only 3 times
 * - Cancels the timer automatically after task completion

 * Concepts Covered:
 * - java.util.Timer
 * - java.util.TimerTask
 * - Anonymous inner classes
 * - Task scheduling and cancellation
 */


package K_ThreadingAndTimers.K03_TimerTasks;

import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args){
        Timer timer = new Timer();
        TimerTask task = new TimerTask(){

            int count = 3;                              // run only 3 times

            @Override
            public void run(){
                System.out.println("Hello");          //  task to be done
                count --;
                if(count <= 0){
                    System.out.println("Task Completed !");
                    timer.cancel();
                }
            }
        };
        // with TimerTask we have to implement the run() method, to override the run() method we could create a child class from the TimerTask class,
        // but it's better to create anonymous class rather than this
        // using the anonymous class we can update or change the behaviour of the TimerTask class object, using @Override

        // we will say hello after 3 seconds, to do that we will take the timer object and call the schedule method
        // pass 2 arguments to the method - 1) task (what we need to do), 2) delay (after how many milliseconds we are going to execute this task)
        // timer.schedule(task,3000);                  // after 3 seconds do the task

        // we can also schedule tasks at a fixed rate, out timer can do things periodically
        // so let's repeat our task of saying hello more than once

        timer.schedule(task,1000,2000);         // third argument is the period, delay between repetitions
        // after a delay of 1 second, print hello every 2 seconds
    }
}

// Timer = Class that schedules tasks at specific times or periodically
//         Useful for: sending notifications, schedules updates, repetitive actions

// TimerTask = Represents the task that will be executed by the Timer
//             You will extend the TimerTask class to define your task
//             Create a subclass of TimerTask and @Override run()