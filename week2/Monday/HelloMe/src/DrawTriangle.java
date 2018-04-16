import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        System.out.println("How many lines should the triangle have? ");
        Scanner scan = new Scanner(System.in);
        int numberOfLines = scan.nextInt();
        for (int i = 0; i < numberOfLines; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }


    }
}
