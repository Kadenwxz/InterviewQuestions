package iterator.iteratorToIterator;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.internal.runners.statements.ExpectException;
import org.junit.rules.ExpectedException;

public class IteratorToIteratorTest {

	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void test() {
		List<Integer> l1 = Arrays.asList(1, 2), l2 = Arrays.asList(3, 4, 5), l3 = new ArrayList<>();
		List<Iterator<Integer>> list = Arrays.asList(l1.iterator(), l2.iterator(), l3.iterator());
		IteratorToIterator itr = new IteratorToIterator(list.iterator());
		assertEquals(itr.next(), 1);
		assertEquals(itr.next(), 2);
		assertEquals(itr.next(), 3);
		assertEquals(itr.next(), 4);
		assertEquals(itr.next(), 5);
		thrown.expect(NoSuchElementException.class);
		itr.next();
	}

}
