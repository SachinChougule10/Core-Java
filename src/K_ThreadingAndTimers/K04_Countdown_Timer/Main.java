/*
 * Description:
 * This program takes a number of seconds as input from the user and starts a countdown timer.
 * It prints the remaining seconds every second using Java's Timer and TimerTask classes.
 * Once the countdown reaches zero, the timer stops and prints "Happy New Year!".
 */


package K_ThreadingAndTimers.K04_Countdown_Timer;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of seconds to start the countdown from: ");
        int response = scanner.nextInt();

        Timer timer = new Timer();

        // for TimerTask we need to override the run() method.
        // We can do it using 2 D_Methods.methods - 1) create a new class and inherit from the TimerTask class, so it would be the parent class OR
        //                                2) use anonymous class

        TimerTask task = new TimerTask(){

            int count = response;

            @Override
            public void run(){
                System.out.println(count);
                count--;

                if(count < 0){
                    System.out.println("Happy New Year!");
                    timer.cancel();
                }

            }
        };

        timer.scheduleAtFixedRate(task, 0, 1000);           // (task, delay, period)
    }
}
