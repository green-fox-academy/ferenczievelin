import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
        int kilometer=0;
        double mile=0;
        System.out.println("Kilometers to convert: ");
        Scanner scan = new Scanner(System.in);
        kilometer=scan.nextInt();
        mile=kilometer*0.621371192;
        System.out.println(kilometer+ " kms are " + mile + " miles");


    }
}
