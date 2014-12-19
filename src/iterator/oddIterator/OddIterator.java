package iterator.oddIterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class OddIterator {
	int cur = -1;
	Iterator<Integer> itr;
	
	public OddIterator(Iterator<Integer> itr){
		this.itr = itr;
	}
	
	public boolean hasNext(){
		while(cur == -1 && itr.hasNext()){
			int tmp = itr.next();
			if(tmp % 2 == 1){
				cur = tmp;
				return true;
			}
		}
		return false;
	}
	
	public int next() throws NoSuchElementException{
		if(hasNext()){
			int tmp = cur;
			cur = -1;
			return tmp;
		}
		throw(new NoSuchElementException("There is no odd element in this iterator"));
	}
}
