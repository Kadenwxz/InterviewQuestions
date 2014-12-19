package iterator.iteratorToIterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteratorToIterator {
	Iterator<Iterator<Integer>> itr;
	Iterator<Integer> cur = null;
	public IteratorToIterator(Iterator<Iterator<Integer>> itr){
		this.itr = itr;
	}
	
	public boolean hasNext(){
		while(cur == null || !cur.hasNext()){
			if(!itr.hasNext())return false;
			cur = itr.next();
		}
		return true;
	}
	
	public int next() throws NoSuchElementException{
		if(hasNext()){
			return cur.next();
		}
		throw(new NoSuchElementException("There is no element available in iterator."));
	}
}
