package array.countingSort.getHIndex;

import static org.junit.Assert.*;

import org.junit.Test;

public class GetHIndexTest {

    @Test
    public void test() {
        GetHIndex solution = new GetHIndex();
        int[] A = {7, 2, 4, 3, 5, 7};
        int res = solution.getHIndex(A);
        assertEquals(3, res);
    }

}
