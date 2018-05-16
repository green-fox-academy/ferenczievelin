import java.util.Arrays;

public class Anagram {


    public static boolean areAnagrams(String st1, String st2) {
        if (st1.length() != st2.length()) {
            return false;

        } else {
            st1.toLowerCase();
            st2.toLowerCase();
            char[] charsOFword1 = st1.toCharArray();
            char[] charsOfSecondWord = st2.toCharArray();
            Arrays.sort(charsOFword1);
            Arrays.sort(charsOfSecondWord);
            if (Arrays.equals(charsOFword1, charsOfSecondWord)) {
                return true;
            } else return false;
        }

    }

    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        System.out.println(areAnagrams("index kaszabol", "szabad lexikon"));
    }
}