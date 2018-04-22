import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String... args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type the first word: ");
        String word1 = scan.nextLine();

        System.out.println("Type the second word: ");
        String word2 = scan.nextLine();
        System.out.println(AreAnagrams(word1, word2));
    }

    public static boolean AreAnagrams(String st1, String st2) {
        if (st1.length() != st2.length()) {
            return false;

        } else {
            st1.toLowerCase();
            st2.toLowerCase();
            char[] charsOFword1 = st1.toCharArray();
            char[] charsOfSecondWord = st2.toCharArray();
            Arrays.sort(charsOFword1);
            Arrays.sort(charsOfSecondWord);
            return Arrays.equals(charsOFword1, charsOfSecondWord);
        }
    }
}
