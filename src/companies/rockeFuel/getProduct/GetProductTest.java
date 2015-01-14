package companies.rockeFuel.getProduct;

import static org.junit.Assert.*;

import org.junit.Test;

public class GetProductTest {

    @Test
    public void test() {
        int[] A = {2, 3, 1, 1, 4, 2, 1}, B = {24, 16, 48, 48, 12, 24, 48};
        GetProduct solution =  new GetProduct();
        int[] res = solution.getProduct(A);
        assertArrayEquals(B, res);
    }

}
