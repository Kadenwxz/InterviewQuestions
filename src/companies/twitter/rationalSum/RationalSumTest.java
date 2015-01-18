package companies.twitter.rationalSum;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class RationalSumTest {

    @Test
    public void test() {
        int[] a = {4, 2, 2, 4};
        RationalSum solution = new RationalSum();
        List<Integer> res = solution.rationalSum(a[0], a[1], a[2], a[3]);
        assertEquals(5, res.get(0).intValue());
        assertEquals(2, res.get(1).intValue());
    }

}
