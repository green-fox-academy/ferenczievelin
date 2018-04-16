import java.util.Scanner;
import java.util.stream.IntStream;

public class AverageOfInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int []intek=new int[5];
        System.out.println("Type in 5 integer numbers ");
        for (int i = 0; i < 5; i++) {
            intek[i]=scan.nextInt();

        }

        int sum=IntStream.of(intek).sum();
        double avg =sum/intek.length;
        System.out.println("The average is: "+ avg);


    }
}
