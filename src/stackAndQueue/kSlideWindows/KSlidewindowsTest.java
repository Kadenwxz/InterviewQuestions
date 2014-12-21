package stackAndQueue.kSlideWindows;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class KSlidewindowsTest {

    @Test
    public void test() {
        int[] A = {5, 8, 3, 4, 1, 9};
        KSlideWindows windows = new KSlideWindows();
        List<Integer> res = windows.getMin(A, 2);
        assertEquals(res.get(0).intValue(), 5);
        assertEquals(res.get(1).intValue(), 3);
        assertEquals(res.get(2).intValue(), 3);
        assertEquals(res.get(3).intValue(), 1);
        assertEquals(res.get(4).intValue(), 1);
    }

}
