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
        assertEquals((int)res.get(0), 5);
        assertEquals((int)res.get(1), 3);
        assertEquals((int)res.get(2), 3);
        assertEquals((int)res.get(3), 1);
        assertEquals((int)res.get(4), 1);
    }

}
