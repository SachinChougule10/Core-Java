
package L_Mini_Projects.L04_Alarm_Clock;
import java.util.Scanner;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;

/*
 * AlarmClock
 * ----------
 * This class represents the core alarm functionality of the application.
 *
 * Responsibilities:
 * 1. Continuously checks the current system time in a separate thread.
 * 2. Displays a live digital clock in the console.
 * 3. Triggers an alarm sound when the current time reaches the user-defined alarm time.
 * 4. Plays a WAV audio file in a loop until the user presses ENTER to stop it.
 *
 * Design Notes:
 * - Implements Runnable so it can run independently without blocking main execution.
 * - Uses LocalTime for accurate, timezone-independent time comparison.
 * - Scanner is passed from Main to avoid creating multiple input streams.
 */

public class AlarmClock implements Runnable{
    // Time at which the alarm should trigger
    private final LocalTime alarmTime;
    // Path to the alarm sound file
    private final String filePath;
    // Scanner for user interaction (press ENTER to stop alarm)
    private final Scanner scanner;

    AlarmClock(LocalTime alarmTime, String filePath, Scanner scanner){
        this.alarmTime = alarmTime;
        this.filePath = filePath;
        this.scanner = scanner;
    }
    @Override
    public void run(){
        // Keep checking the current time until it reaches the alarm time
        while(LocalTime.now().isBefore(alarmTime)){
            try {
                // Pause execution for 1 second to avoid busy-waiting
                Thread.sleep(1000);
                // Get the current system time
                LocalTime now = LocalTime.now();
                // Print the current time in HH:MM:SS format on the same console line
                System.out.printf("\r%02d:%02d:%02d", now.getHour(), now.getMinute(), now.getSecond());

            } catch (InterruptedException e) {
                // Executes if the alarm thread is interrupted externally
                System.out.println("Thread was interrupted");
            }
        }
        // Executed once the current time reaches or passes the alarm time
        System.out.println("\n*ALARM NOISES*");
        // Start playing the alarm sound
        playSound(filePath);
    }

    private void playSound(String filePath){
        // Create a File object pointing to the alarm sound
        File audioFile = new File(filePath);

        try(AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile)){
            // Obtain a Clip instance for playing the audio
            Clip clip = AudioSystem.getClip();
            // Load the audio data into the clip
            clip.open(audioStream);
            // Start playing the alarm sound
            clip.start();

            // Wait for the user to press ENTER before stopping the alarm
            System.out.print("Press *Enter* to stop the alarm: ");
            scanner.nextLine();
            // Stop the audio playback
            clip.stop();
            // Close the scanner after use (also closes System.in)
            scanner.close();
        }
        catch(UnsupportedAudioFileException e){
            // Thrown if the audio file format is not supported
            System.out.println("Audio file format is not supported");
        }
        catch(LineUnavailableException e){
            // Thrown if the audio line cannot be opened
            System.out.println("Audio is unavailable");
        }
        catch(IOException e){
            // Thrown if an I/O error occurs while reading the audio file
            System.out.println("Error reading audio file");
        }
    }
}
