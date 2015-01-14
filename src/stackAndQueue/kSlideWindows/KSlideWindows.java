package stackAndQueue.kSlideWindows;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class KSlideWindows {
    public List<Integer> getMin(int[] A, int k){
        List<Integer> res = new ArrayList<>();
        if(A == null || A.length == 0)return res;
        LinkedList<Integer> biQueue = new LinkedList<>();
        for(int i = 0; i < A.length; i ++){
            while(!biQueue.isEmpty() && A[i] < biQueue.getLast())biQueue.removeLast();
            biQueue.add(A[i]);
            if(i - k >= 0 && biQueue.getFirst() == A[i - k])biQueue.removeFirst();
            if(i - k + 1 >= 0)res.add(biQueue.getFirst());
        }
        if(res.isEmpty())res.add(biQueue.getFirst());
        return res;
    }
}
