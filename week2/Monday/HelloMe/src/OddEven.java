import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a number");
        String oddOrEven="";
        int oddeven=scan.nextInt();
        if (oddeven%2==0) {
            oddOrEven="even";
        } else
        {oddOrEven="odd";}

        System.out.println("The number is " +oddOrEven);
    }
}
