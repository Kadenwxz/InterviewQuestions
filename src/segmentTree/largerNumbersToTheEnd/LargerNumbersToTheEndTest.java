package segmentTree.largerNumbersToTheEnd;

import static org.junit.Assert.*;

import org.junit.Test;

public class LargerNumbersToTheEndTest {

    @Test
    public void test() {
        int[] A = {4, 1, 3, 2};
        int[] expecteds = {3, 0, 1, 0};
        LargerNumbersToTheEnd solution = new LargerNumbersToTheEnd();
        int[] res = solution.getLargerNumbersToTheEnd(A);
        for(int tmp : res)System.out.print(tmp + " ");
        assertArrayEquals(expecteds, res);
    }

}
