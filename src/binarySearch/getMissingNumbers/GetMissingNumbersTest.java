package binarySearch.getMissingNumbers;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class GetMissingNumbersTest {

    @Test
    public void fiveElementsTest() {
        GetMissingNumbers t = new GetMissingNumbers();
        int[] A = {1, 2, 5, 7, 10};
        List<Integer> res = t.getMissingNumbers(A, 11);
        Collections.sort(res);
        assertEquals(res.get(0).intValue(), 3);
        assertEquals(res.get(1).intValue(), 4);
        assertEquals(res.get(2).intValue(), 6);
        assertEquals(res.get(3).intValue(), 8);
        assertEquals(res.get(4).intValue(), 9);
        assertEquals(res.get(5).intValue(), 11);
    }
    
    @Test
    public void zeroElementsTest() {
        GetMissingNumbers t = new GetMissingNumbers();
        int[] A = {};
        List<Integer> res = t.getMissingNumbers(A, 2);
        Collections.sort(res);
        assertEquals(res.get(0).intValue(), 1);
        assertEquals(res.get(1).intValue(), 2);
    }
}
