package iterator.MixIterator;

import java.util.Iterator;

public class MixIterator {
	Iterator<Object> itr;
	Integer cur = null;
	Iterator<Integer> curItr = null;
	public MixIterator(Iterator<Object> itr){
		this.itr = itr;
	}
	
	public boolean hasNext(){
		while(cur == null){
			if(!itr.hasNext() && !curItr.hasNext())return false;
			if(curItr.hasNext()){
				cur = curItr.next();
			}else{
				Object o = itr.next();
				if(o.getClass().equals(Integer.class)){
					cur = (Integer)o;
				}else{
					curItr = (Iterator<Integer>)o;
				}
			}
		}
		return false;
	}
	
	public int next(){
		
	}
}
