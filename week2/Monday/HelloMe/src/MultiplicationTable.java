import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Type the number");
        Scanner scan = new Scanner(System.in);
        int multiplicand = scan.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "*" + multiplicand + "=" + i * multiplicand);

        }
    }
}
