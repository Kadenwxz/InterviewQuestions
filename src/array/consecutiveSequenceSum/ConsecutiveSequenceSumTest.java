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
    
    @Test
    public void positiveFunctionTest(){
        int[] A = {15, 2, 4, 8, 9, 5, 10, 23};
        ConsecutiveSequenceSum solution = new ConsecutiveSequenceSum();
        int[] res = solution.getConsequetiveSequenceFromPositive(A, 23);
        int[] expected = {1, 4};
        assertArrayEquals(expected, res);
    }
}
