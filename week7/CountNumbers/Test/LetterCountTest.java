import com.sun.jdi.Value;
import org.junit.Test;

import java.security.Key;
import java.util.HashMap;

import static org.junit.Assert.*;

public class LetterCountTest {

    @Test
    public void charCounter() {
        LetterCount letterCount = new LetterCount();
        HashMap<Character, Integer> charCounter =  letterCount.charCounter("apple");
        charCounter.get('a');
       assertTrue(charCounter.containsKey('a'));
       Object value = charCounter.get('a');
       assertEquals(1, value);

    }
}