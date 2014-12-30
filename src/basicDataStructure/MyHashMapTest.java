package basicDataStructure;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyHashMapTest {

    @Test
    public void test() {
        MyHashMap<String, Integer> map = new MyHashMap<>();
        map.put("abc", 123);
        map.put("kkd", 456);
        assertEquals(123, map.get("abc").intValue());
        assertEquals(456, map.get("kkd").intValue());
    }

}
