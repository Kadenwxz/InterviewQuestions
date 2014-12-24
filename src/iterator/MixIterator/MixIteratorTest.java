package iterator.MixIterator;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class MixIteratorTest {

    @Test
    public void test() {
        Iterator<Integer> itr1 = Arrays.asList(1, 2).iterator(), itr2 = Arrays.asList(3, 4, 5).iterator();
        Iterator<Object> input = Arrays.asList(itr1, new Integer(1), new Integer(2), itr2).iterator();
        MixIterator iterator = new MixIterator(input);
        assertEquals(((Integer)iterator.next()).intValue(), 1);
        assertEquals(((Integer)iterator.next()).intValue(), 2);
        assertEquals(((Integer)iterator.next()).intValue(), 1);
        assertEquals(((Integer)iterator.next()).intValue(), 2);
        assertEquals(((Integer)iterator.next()).intValue(), 3);
        assertEquals(((Integer)iterator.next()).intValue(), 4);
        assertEquals(((Integer)iterator.next()).intValue(), 5);
    }

}
