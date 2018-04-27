import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful
public class CopyFile {
    public static void main(String[] args) {
        Path file1 = Paths.get("copy.txt");
        Path file2 = Paths.get("paste.txt");

    }
    public static boolean copy (String file1, String file2)  {
        try {
            Files.copy(Paths.get(file1),Paths.get(file2),StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException e) {
            return false;}

    }
}
