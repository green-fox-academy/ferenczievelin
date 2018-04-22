import java.util.Scanner;

public class Factorial {
    public static void main(String... main) {
        // - Create a function called `factorio`
//   that returns it's input's factorial
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to see it's factorial: ");
        int numberToFact = scan.nextInt();
        int factorial = factorio(numberToFact);
        System.out.println(factorial);
    }

    private static int factorio(int numberToFact) {
        int factorial = 1;
        for (int i = 1; i < numberToFact; i++) {
            factorial = i * numberToFact;

        }
        return factorial;
    }
}
