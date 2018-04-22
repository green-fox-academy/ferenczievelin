import java.util.Scanner;

public class GuessTheNumber {
public static void main (String [] args){
    int number = 8;
    System.out.println("Try to guess the number:");
    Scanner scan = new Scanner( System.in);
    int guess = scan.nextInt();

    if (guess > number) {
        System.out.println("The stored number is lower");
    }
    else if (guess < number){
        System.out.println("The stored number is higher");
    }
    else {
        System.out.println("You found the stored number: " + guess);
    }
}
}
