import java.nio.file.Files;
import java.nio.file.Path;
// Importing class
import java.io.IOException;
 
// Class
public class GFG {
 
  // Main driver method
    public static void main(String[] args) throws IOException
    {
        // Assign the content of the file
        String text  = "Welcome to geekforgeeks\nHappy Learning!";
 
        // Define the file name of the file
        Path fileName = Path.of("/Users/mayanksolanki/Desktop/demo.docx");
 
        // Write into the file
        Files.writeString(fileName, text);
 
        // Read the content of the file
        String file_content = Files.readString(fileName);
 
        // Print the content inside the file
        System.out.println(file_content);
    }
}
