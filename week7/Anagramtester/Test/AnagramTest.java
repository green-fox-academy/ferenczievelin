import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    @Test
    public void areAnagrams() {
        Anagram anagram = new Anagram();
        String st1 = "szabad lexikon";
        String st2 = "index kaszabol";
        assertTrue(anagram.areAnagrams(st1, st2));

    }
}