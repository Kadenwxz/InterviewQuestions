package array.consecutiveSequenceSum;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConsecutiveSequenceSumTest {

    @Test
    public void test(){
        int[] A = {1, 3, 7, 8};
        ConsecutiveSequenceSum solution = new ConsecutiveSequenceSum();
        int[] res = solution.getConsequetiveSequence(A, 18);
        int[] expected = {1, 3};
        assertArrayEquals(expected, res);
    }
    
    @Test
    public void lengthOneTest(){
        int[] A = {9, 10, 7, 8};
        ConsecutiveSequenceSum solution = new ConsecutiveSequenceSum();
        int[] res = solution.getConsequetiveSequence(A, 10);
        int[] expected = {1, 1};
        assertArrayEquals(expected, res);
    }
}
