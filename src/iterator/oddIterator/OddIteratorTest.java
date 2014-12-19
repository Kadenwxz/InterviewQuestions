package iterator.oddIterator;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class OddIteratorTest {

	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void test() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		OddIterator itr = new OddIterator(list.iterator());
		assertTrue(itr.next() == 1);
		assertTrue(itr.next() == 3);
		assertTrue(itr.next() == 5);
		thrown.expect(NoSuchElementException.class);
		itr.next();
	}

}
