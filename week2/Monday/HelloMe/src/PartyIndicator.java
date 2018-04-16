import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        System.out.println("How many girls are attending?");
        Scanner scan = new Scanner(System.in);
        int numberOfGirls = scan.nextInt();
        System.out.println("How many boys are attending?");
        int numberOfBoys=scan.nextInt();
        if (numberOfBoys==numberOfGirls && numberOfBoys+numberOfGirls>20){
            System.out.println("The party is excellent ;)");
        } else if (numberOfBoys+numberOfGirls>20 && numberOfGirls>0 ) {
            System.out.println("Quite cool party");
        } else if (numberOfBoys+numberOfGirls<=20 && numberOfGirls >0) {
            System.out.println("Average party...");
        }
        else {
            System.out.println("Sausage party");
        }

    }
}
