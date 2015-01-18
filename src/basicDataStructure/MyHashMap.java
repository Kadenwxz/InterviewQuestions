package basicDataStructure;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class MyHashMap<K, V>{
    
    class Segment<K, V> extends ReentrantLock{        
        private final static int factor = 4;
        List<Pair>[] table = new List[factor];
        public void put(int hashCode, K key, V val){
            lock();
            try{
                int index = hashCode % factor;
                if(table[index] == null)table[index] = new ArrayList<>();
                Pair<K, V> pair = new Pair(key, val);
                table[index].add(pair);
            }finally{
                unlock();
            }
        }
        
        public V get(int hashCode, K key){
            int index = hashCode % factor;
            if(table[index] == null)return null;
            for(Pair<K, V> pair : table[index]){
                if(pair.getKey().equals(key))return pair.getValue();
            }
            return null;
        }
    }
    
    class Pair<K, V>{
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
    
    private final static int factor = 32;
    private Segment<K, V>[] segments = (Segment<K, V>[]) new Segment[factor];
    
    public MyHashMap(){
        for(int i = 0; i < factor; i ++){
            segments[i] = new Segment<>();
        }
    }
    
    private Segment<K, V> segmentFor(int hashCode){
        int index = hashCode % 32;
        return segments[index];
    }
    
    public void put(K key, V val){
        int hashCode = key.hashCode();
        segmentFor(hashCode).put(hashCode, key, val);
    }
    
    public V get(K key){
        int hashCode = key.hashCode();
        return segmentFor(hashCode).get(hashCode, key);
    }
}