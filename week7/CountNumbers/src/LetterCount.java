import java.util.HashMap;

public class LetterCount {
    public HashMap<Character, Integer> charCounter;

    LetterCount () {
        this.charCounter = new HashMap<>();
    }

    public HashMap<Character, Integer> charCounter(String wordToCountTheLetters) {
        charCounter = new HashMap <Character, Integer> ();
        char[] char_array = wordToCountTheLetters.toCharArray();
        int count = 0;

        for (int i = 0; i < wordToCountTheLetters.length(); i++) {
            char letter = char_array[i];
            if (charCounter.containsKey(char_array[i])) {
                charCounter.put(letter, charCounter.get(letter) + 1);
            } else {
                charCounter.put(letter, 1);
            }
        }
        for (Character key : charCounter.keySet()) {
            System.out.println(key + "" + charCounter.get(key));
        }

        return charCounter;
    }

}


