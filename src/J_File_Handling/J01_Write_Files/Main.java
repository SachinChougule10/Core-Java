/**
 * Description:
 * This program demonstrates how to write text content to a file in Java using the FileWriter class.
 * It creates (or overwrites) a text file at the specified file path and writes a simple string into it.

 * Concepts Covered:
 * - File handling in Java
 * - FileWriter for writing text files
 * - Try-with-resources for automatic resource management
 * - Exception handling using IOException and FileNotFoundException

 * Note:
 * - If the file does not exist, it will be created.
 * - If the file already exists, its content will be overwritten.
 */


package J_File_Handling.J01_Write_Files;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args){

        String filePath = "C:\\Users\\Sachin Chougule\\OneDrive\\Desktop\\test.txt";
        String fileContent = "I like pizza";

        try(FileWriter writer = new FileWriter(filePath)){
            writer.write(fileContent);
            System.out.println("File has been written");
        }
        catch(FileNotFoundException e){
            // this is when we can't locate a file or file path is invalid
            System.out.println("Could not locate file location");
        }
        catch(IOException e){
            System.out.println("Could not write file");
        }
    }
}

// FileWriter = Good for small or medium-sized text files
// BufferedWriter = Better performance for large amount of text
// PrintWriter = Best for structured data, like reports or logs
// FileOutputStream = Best for binary files (eg:- images, audio files)



// to write small or medium size text files we use 'FileWriter', we will need a try{} and catch{} block for this
// if we do not specify the path for the file, it will be created in the src file
// secondly we have specified the path for desktop, so our test.txt file should be on desktop
