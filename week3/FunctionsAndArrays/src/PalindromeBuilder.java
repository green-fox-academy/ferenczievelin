import java.util.Scanner;

public class PalindromeBuilder {
    public static void main (String ... args){
        System.out.println("Enter a word: ");
        Scanner scan = new Scanner(System.in);
        String wordpali= scan.nextLine();
        System.out.println(palindromeBuilder(wordpali));

    }
    public static String palindromeBuilder (String word) {
        StringBuilder str = new StringBuilder();

        for(int i=word.length()-1; i>0; i--){
            str.append(word.charAt(i-1));}
        String pala =word+ str.toString();
        return pala;
    }
}
