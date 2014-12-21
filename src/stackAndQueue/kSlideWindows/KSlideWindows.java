package stackAndQueue.kSlideWindows;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class KSlideWindows {
    public List<Integer> getMin(int[] A, int k){
        List<Integer> res = new ArrayList<>();
        LinkedList<Integer> biQueue = new LinkedList<>();
        if(A == null || A.length < k)return res;
        for(int i = 0; i < A.length; i ++){
            while(!biQueue.isEmpty() && A[i] < biQueue.peekLast())biQueue.removeLast();
            biQueue.add(A[i]);
            if(i - k >= 0 && A[i - k] == biQueue.peekFirst())biQueue.removeFirst();
            if(i - k + 1 >= 0)res.add(biQueue.peekFirst());
        }
        return res;
    }
}
