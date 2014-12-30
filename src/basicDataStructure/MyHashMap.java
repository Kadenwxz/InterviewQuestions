package basicDataStructure;

import java.util.ArrayList;
import java.util.List;

class MyHashMap<K, V>{
    
    class Pair{
        K key;
        V val;
        public Pair(K key, V val){
            this.key = key;
            this.val = val;
        }
        public K getKey(){
            return key;
        }
        
        public V getValue(){
            return val;
        }
    }
    
    private final static int factor = 128;
    List<Pair>[] memo = new List[factor];
    
    public void put(K key, V val){
        int index = key.hashCode()%factor;
        if(memo[index] == null)memo[index] = new ArrayList();
        Pair pair = new Pair(key, val);
        memo[index].add(pair);
    }
    
    public V get(K key){
        int index = key.hashCode()%factor;
        if(memo[index] == null)return null;
        List<Pair> list = memo[index];
        for(Pair pair: list){
            if(key.equals(pair.key))return pair.getValue();
        }
        return null;
    }
}