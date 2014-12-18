package trie.insertAndSearch;

import static org.junit.Assert.*;

import org.junit.Test;

import sun.java2d.pipe.AAShapePipe;

public class AddAndSearchTest {

	/**
	 * Test null input
	 */
	@Test
	public void nullInputTest() {
		AddAndSearch aas = new AddAndSearch();
		aas.addWord(null);
		assertTrue(aas.search(null));
	}
	
	@Test
	public void emptyInputTest(){
		AddAndSearch ass = new AddAndSearch();
		ass.addWord("");
		assertTrue(ass.search(""));
	}
	
	@Test
	public void mediumSizeInputTest(){
		AddAndSearch ass = new AddAndSearch();
		ass.addWord(null);
		ass.addWord("");
		ass.addWord("kaden");
		ass.addWord("kaden go to keller hall.");
		assertTrue(ass.search(null));
		assertTrue(ass.search("kaden"));
		assertTrue(ass.search("kaden go to keller hall."));
		assertFalse(ass.search("abc"));
		assertFalse(ass.search("kad"));
		assertTrue(ass.search("kad.n"));
	}

}
