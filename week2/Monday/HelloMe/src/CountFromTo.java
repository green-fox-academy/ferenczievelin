import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {

        System.out.println("Type in the first number");
        Scanner scan = new Scanner(System.in);
        int firstNumber = scan.nextInt();
        System.out.println("Type a bigger number than the previous one");
        int secondNumber = scan.nextInt();
        if (firstNumber > secondNumber) {
            System.out.println("The second number should be bigger");
        }
        for (int i = firstNumber; i < secondNumber; i++) {
            System.out.println(i);

        }

    }
}
