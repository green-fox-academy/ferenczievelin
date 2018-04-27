import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteSingleLine {
    public static void main(String[] args) {
        // Open a file called "my-file.txt"
        // Write your name in it as a single line
        // If the program is unable to write the file,
        // then it should print an error message like: "Unable to write file: my-file.txt"
        writeYourName();


    }

    public static void writeYourName() {
        Path myFile = Paths.get("my-file.txt");
        ArrayList<String> nev = new ArrayList<>(Arrays.asList(
                "Saját becses nevem: Ferenczi Evelin")
        );

        try {
            Files.write(myFile,nev);
        }
        catch (IOException e) {
            System.out.println("unble to write file: my-file");
        }

    }
}