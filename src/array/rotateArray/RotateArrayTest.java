package array.rotateArray;

import static org.junit.Assert.*;

import org.junit.Test;

public class RotateArrayTest {

    @Test
    public void test() {
        RotateArray solution = new RotateArray();
        int[] A = {1, 2, 3, 4, 5, 6};
        solution.rotate(A, 3);
        int[] expecteds = {4, 5, 6, 1, 2, 3};
        assertArrayEquals(expecteds, A);
    }

}
