package array.printDuplicate;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrintDuplicateTest {

    @Test
    public void test() {
        PrintDuplicate solution = new PrintDuplicate();
        int[] A = {1, 1, 1, 2, 2, 6, 6, 8, 8, 9, 9};
        solution.printDuplicate(A);
    }

}
