package iterator.MixIterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MixIterator {
    
    Iterator<Object> itr;
    Iterator<Integer> curItr = null;
    Integer cur = null;
    
    public MixIterator(Iterator<Object> itr){
        this.itr = itr;
    }
    
    public boolean hasNext(){
        while(cur == null){
            if(curItr != null && curItr.hasNext()){
                cur = curItr.next();
            }else if(itr.hasNext()){
                Object o = itr.next();
                if(o.getClass().equals(Integer.class)){
                    cur = (Integer) o;
                }else if(o.getClass().equals(Iterator.class)){
                    curItr = (Iterator<Integer>) o;
                }
            }else{
                return false;
            }
        }
        return true;
    }
    
    public int next() throws NoSuchElementException{
        if(!hasNext()){
            throw(new NoSuchElementException("There are no elements in this iterator."));
        }
        int res = cur;
        cur = null;
        return res;
    }
}
