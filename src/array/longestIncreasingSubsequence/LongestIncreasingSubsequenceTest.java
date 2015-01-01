package array.longestIncreasingSubsequence;

import static org.junit.Assert.*;

import org.junit.Test;

public class LongestIncreasingSubsequenceTest {

    @Test
    public void test() {
        LongestIncreasingSubsequence solution = new LongestIncreasingSubsequence();
        int[] A = {2, 1, 5, 3, 6, 4, 8, 9, 7};
        System.out.println(solution.getSize(A));
    }

}
