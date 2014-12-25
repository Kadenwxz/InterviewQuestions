package mergeSort.getMinRange;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GetMinRangeTest{
    @Test
    public void getMinRangeOneElementTest(){
        int[] a = {1, 2};
        List<int[]> input = new ArrayList<>();
        input.add(a);
        GetMinRange getter = new GetMinRange();
        int[] res = getter.getMinRange(input);
        assertEquals(1, res[0]);
        assertEquals(1, res[1]);
    }
    
    @Test
    public void getMinRangeMultiElementTest(){
        int[] a = {1, 2}, b = {3, 4}, c = {5, 6};
        List<int[]> input = new ArrayList<>();
        input.add(a);
        input.add(b);
        input.add(c);
        GetMinRange getter = new GetMinRange();
        int[] res = getter.getMinRange(input);
        assertEquals(2, res[0]);
        assertEquals(5, res[1]);
    }
}
