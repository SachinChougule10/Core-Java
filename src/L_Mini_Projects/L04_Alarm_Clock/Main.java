package L_Mini_Projects.L04_Alarm_Clock;
import java.time.DateTimeException;
import java.time.LocalTime;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

// Part1: set an alarm time

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Formatter to enforce HH:MM:SS time format (24-hour clock)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        // Will store the validated alarm time entered by the user
        LocalTime alarmTime = null;

        // Path to the alarm sound file
        // TODO: Replace this path with the absolute or relative path to a valid WAV audio file on your system
        String filePath = "path/to/alarm-sound.wav";

        // Keep asking for input until a valid time is provided
        while (alarmTime == null) {
            try {
                // Prompt user to enter alarm time
                System.out.print("Enter an alarm time (HH:MM:SS): ");
                String inputTime = scanner.nextLine();
                // Parse the input string into a LocalTime object
                alarmTime = LocalTime.parse(inputTime, formatter);
                // Confirm that the alarm has been successfully set
                System.out.println("Alarm set for " + alarmTime);
            }
            catch (DateTimeException e) {
                // Handles invalid time formats or impossible time values
                System.out.println("Invalid format. Please use HH:MM:SS");
            }
        }
        // Create the AlarmClock runnable with alarm time, sound path, and scanner
        AlarmClock alarmClock = new AlarmClock(alarmTime, filePath, scanner);
        // Run the alarm logic on a separate thread so main doesn't block
        Thread alarmThread = new Thread(alarmClock);
        // Start the alarm thread
        alarmThread.start();

    }
}
