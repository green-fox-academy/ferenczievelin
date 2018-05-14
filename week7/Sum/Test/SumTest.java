import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SumTest {

    @Test
    public void testWithMultipleElements() {
        Sum sum = new Sum();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        sum.setNumbers(numbers);
        int expectedSum = 8;
        assertEquals(expectedSum, sum.sum());
    }

    @Test
    public void testWithEmptyList () {
        Sum sum = new Sum();
        int expected = 0;
        assertEquals(expected,sum.sum());
    }

    @Test
    public void testWithOneElement () {
        Sum sum = new Sum();
       ArrayList <Integer> numbers = new ArrayList<>();
       numbers.add(2);
       sum.setNumbers(numbers);
       assertEquals(2,sum.sum());
    }

    @Test
    public void testWithNull () {
        // todo testwithnull 
    }
}