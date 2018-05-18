import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;

public class Excercise2 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

       OptionalDouble oddAverage = numbers.stream()
                .filter(number -> number % 2 != 0)
                .mapToInt(number -> number)
               .average();
        System.out.println(oddAverage.getAsDouble());

    }
}
