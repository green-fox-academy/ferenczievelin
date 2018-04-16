import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        System.out.println("Type in a number");
        Scanner scan = new Scanner(System.in);
        int numberOne=scan.nextInt();
        System.out.println("Type in tha second number");
        int numberTwo=scan.nextInt();

        if (numberOne>numberTwo){
            System.out.println("The bigger number is " + numberOne);
        }
        else if (numberOne<numberTwo){
            System.out.println("The bigger number is " +numberTwo);
        }
        else {
            System.out.println("They are equals");
        }
    }
}
