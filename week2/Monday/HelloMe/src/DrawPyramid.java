import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        System.out.println("How many lines should the triangle have? ");
        Scanner scan = new Scanner(System.in);
        int numberOfLines = scan.nextInt();
        for (int i = 0; i <= numberOfLines ; i++) {
            for (int j = 0; j < numberOfLines - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("* ");

            }
            System.out.println();
        }

    }



    }

