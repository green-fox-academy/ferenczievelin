import java.util.Scanner;

public class DivideByZero {
    public static void main (String... args){
        Scanner scan = new Scanner(System.in);

        try {
            int divider = scan.nextInt();

            int resultOfDivide = 10 / divider;
        } catch (Throwable throwable) {
            System.out.println("Fail - Something terrible happened here");
        }

    }
}
