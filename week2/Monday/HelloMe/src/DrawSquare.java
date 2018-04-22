import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the rows of the square: ");
        int rows = scan.nextInt();
        System.out.println("%%%%%%");
        for (int i = 0; i <rows-2 ; i++) {
            System.out.println("%    %");
        }
        System.out.println("%%%%%%");
    }
}
