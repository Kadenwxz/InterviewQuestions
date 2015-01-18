package companies.twitter.FlipBits;

import static org.junit.Assert.*;

import org.junit.Test;

public class FlipBitsTest {

    @Test
    public void test() {
        FlipBits solution = new FlipBits();
        int[] A = {1, 0, 0, 1, 0, 0, 1};
        assertEquals(6, solution.flipBits(A));
    }

}
