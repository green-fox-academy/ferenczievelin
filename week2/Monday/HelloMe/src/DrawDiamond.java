import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        int c, i, space=1;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Number of Rows : ");
        int numberOfRows = scan.nextInt();


        space = numberOfRows-1;

        for(i=1; i<=numberOfRows; i++)
        {
            for(c=1; c<=space; c++)
            {
                System.out.print(" ");
            }
            space--;
            for(c=1; c<=(2*i-1); c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        space = 1;

        for(i=1; i<=(numberOfRows-1); i++)
        {
            for(c=1; c<=space; c++)
            {
                System.out.print(" ");
            }
            space++;
            for(c=1; c<=(2*(numberOfRows-i)-1); c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}