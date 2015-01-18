package companies.twitter.twoOperations;

import static org.junit.Assert.*;

import org.junit.Test;

public class GetMinNumTest {

    @Test
    public void test() {
        GetMinNum solution = new GetMinNum();
        assertEquals(solution.getMinNum(5), 4);
        assertEquals(solution.getMinNum(3), 3);
    }

}
