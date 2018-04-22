import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppendLetter {
    public static void main (String... args) {
        List<String> far = Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk");
        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.

        System.out.println(appendA(far));
    }

    private static ArrayList<String> appendA(List<String> far) {
        ArrayList<String>animals = new ArrayList<>();
        for (int i = 0; i <far.size() ; i++) {
            animals.add(far.get(i)+"a");
        }
         return animals;

    }
}
