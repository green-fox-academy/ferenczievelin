import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user
        System.out.println("What's your name? ");
        Scanner scan=new Scanner(System.in);
        String userName = scan.nextLine();

        System.out.println("Hello, " +userName);
    }
}
