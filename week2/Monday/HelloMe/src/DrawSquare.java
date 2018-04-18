import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the rows of the square: ");
        int rows = scan.nextInt();
        char[] spacesAndPercents = new char [rows];

        for (int i = 0; i <=rows ; i++) {
            System.out.print("%");
        }


        for (int i = 0; i <rows-2 ; i++) {
            System.out.println();
        }


    }
}
