import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

public class PrintEachLine {
    public static void main(String[] args) {
        // Write a program that opens a file called "my-file.txt", then prints
        // each of lines form the file.
        // If the program is unable to read the file (for example it does not exists),
        // then it should print an error message like: "Unable to read file: my-file.txt"
        List<String> getStuff = null;
        try {
            getStuff = getLines();

        } catch (IOException sh_thappens) {
            System.out.println("Unable to read file.");
        } finally {
            if (getStuff != null) {
                for (String lines : getStuff) {
                    System.out.println(lines);
                }
            }
        }

    }

    public static List<String> getLines() throws IOException {
        Path myfile = Paths.get("my-file.txt");
        return Files.readAllLines(myfile);
    }
}