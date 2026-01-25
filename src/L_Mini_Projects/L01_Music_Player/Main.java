/**
 * Simple Music Player in Java

 * This program plays a .wav audio file using Java's javax.sound.sampled package.
 * It loads the audio file into a Clip and allows the user to control playback.

 * Available Controls:
 *   P - Play the audio
 *   S - Stop the audio
 *   R - Reset audio to the beginning
 *   Q - Quit the program

 * Supported Audio Formats:
 *   .wav, .aiff, .au

 * Description: A basic command-line music player demonstrating audio handling in Java.
 */


package L_Mini_Projects.L01_Music_Player;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // TODO: Replace the path below with the path to your own audio file (.wav, .au, .aiff)
        String filePath = "path/to/your/audio/file.wav";
        File file = new File(filePath);
        // create a File object and pass filePath to it

        // when handling files its considered dangerous code, because accessing files can be unpredictable, so we will use a try-catch block

        // we will create an input stream object, that's the first step to playing audio, type of object AudioInputStream
        // we will access the AudioSystem class, we will access it statically, so we type the name of the class and call the getAudioInputStream() method and pass our file object
        // when using try with resources we do not need to close the object, java will automatically close it, so we not need to use finally{} block
        // we can use try with resources if the object implements AutoClosable interface - scanner and audioStream will do, clip will not, so we keep the clip object in try{} block

        try(Scanner scanner = new Scanner(System.in); AudioInputStream audioStream =  AudioSystem.getAudioInputStream(file)){
            Clip clip = AudioSystem.getClip();
            // create a clip object
            // in simple terms clip is like a music/audio player, it allows you to load, play, pause or reset the audio

            // we will use the clip object to open the audiostream object
            clip.open(audioStream);

            // we wil use start() method to play the audio file. But we will encounter an issue - the audio will play for a few seconds and the code will exit executing  the finally block
           // clip.start();

            String response = "";
            while(!response.equals("Q")){
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.print("Enter your choice: ");

                response = scanner.next().toUpperCase();

                switch(response){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice!");
                }
            }

            // we will resolve the above issue by asking user to prompt from above options, while loop will run until user prompts 'Q', i.e, music will play until user prompts 'Q'


        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate the file!");
        }
        catch(UnsupportedAudioFileException e){
            // with the getAudioInputStream() method we have to add the catch clause for any UnsupportedAudioFileException
            // used when someone use an audio file that's not supported
            System.out.println("Audio file is not supported!");
        }
        catch(LineUnavailableException e){

            System.out.println("Unable to access audio resource");
            // with the getClip() method we need to add the catch block for LineUnavailableException
            // we will encounter this exception if another resource is trying to access that audio file, or if it's unplayable for some reason
        }
        catch(IOException e){
            // Safety Net
            System.out.println("Something went wrong!");
        }
        finally{
            System.out.println("Bye!");
        }
    }
}


// How to play audio with java (.wav, .au, .aiff)