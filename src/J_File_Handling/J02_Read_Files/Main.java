/*
 * Description:
 * This program demonstrates how to read a text file line by line in Java using FileReader combined with BufferedReader.

 * It uses try-with-resources to automatically close the file after reading and handles possible exceptions such as FileNotFoundException and IOException.

 * Key Concepts Covered:
 * - FileReader for reading character-based files
 * - BufferedReader for efficient reading and readLine() support
 * - try-with-resources for automatic resource management
 * - Exception handling while working with files
 */


package J_File_Handling.J02_Read_Files;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        // NOTE: Replace this path with your own local file path before running
        String filePath = "C:/path/to/your/file.txt";

        // we cannot create BufferedReader object unless we pass a Reader object to it. Hence, we will combine it with FileReader object
        // one of the way to read files - combining BufferedReader + FileReader
        // try{} with resources, when we use this we do not need to close 'reader', java will automatically close this when it is done with it
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
            // read each line, assign it to line, when we will run out of lines, we will get null assigned to line.
            // Run until we get a null, i.e.until we run out of lines. Once we will get null, we will exit the while() loop
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file");
            // if we cannot find the file
        }
        catch(IOException e){
            System.out.println("Something went wrong");
            // catch all block:- to handle all other input/output exceptions. Acts as a safety net
        }

    }
}

// BufferedReader + FileReader: Best for reading text files line by line
// FileInputStream: Best for binary files (eg:- audio files, images)
// RandomAccessFile: Best for read/write specific portions of a large file

// while reading and writing files, we will need try{} and catch{} blocks, else we will get a warning.
// while working with files its considered dangerous code, because we don't know whether we will locate the file or not, or reading or writing files can be unsuccessful for some reason


/*
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
1) What is FileReader?
    FileReader is a class in Java used to read characters from a file.
    It reads the file one character at a time.
    Works only with text files.
    It is a low-level and slower reader.

    Think of FileReader like:
     "A basic machine that can read characters from a file, but slowly and without any storage."
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
2) What is BufferedReader?
    BufferedReader is a class that adds a buffer (temporary storage) to make reading faster.
    Reads large chunks of data at once into memory.

    Gives us convenient D_Methods.methods like:
    readLine() → reads one full line at a time.

    Works on top of another Reader (e.g., FileReader).

    Think of BufferedReader like:
    "A fast reader that stores data temporarily so it doesn’t have to go to the file again and again."
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
3)  Why do we combine them?
    BufferedReader br = new BufferedReader(new FileReader("file.txt"));

    Because:
    FileReader → reads characters from the file.
    BufferedReader → reads efficiently and provides readLine().

    Together:
    FileReader = gets data from file
    BufferedReader = speeds it up and makes reading line-by-line easy
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
4)  Simple Real-Life Example
    Imagine reading a book:
    FileReader:
    You read one letter at a time → slow.
    BufferedReader:
    You read one whole sentence or paragraph at once → faster and easier.
*/