import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class CountLines {
    public static void main(String[] args)  {
        String filename = "filename.txt";
        try {
            numberOfLines(filename);
        } catch (IOException e) {
            System.out.println("oh well...");
        }

    }

    public static int numberOfLines(String filename) throws IOException {
        LineNumberReader reader = null;
        int lines = 0;
        try {
            reader = new LineNumberReader(new FileReader(filename));
            while (reader.readLine() != null) lines++;
            return reader.getLineNumber();

        } catch (IOException e) {
            return 0;
        }
    }
}
