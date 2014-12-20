package stackAndQueue.kSlideWindows;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class KSlideWindows {
    public List<Integer> getMin(int[] A, int k){
        List<Integer> res = new ArrayList<>();
        LinkedList<Integer> biQueue = new LinkedList<>();
        if(A == null || A.length < k)return res;
        int a = 0, b = 0;
        while(b < A.length){
            while(!biQueue.isEmpty() && biQueue.peekLast() > A[b])biQueue.removeLast();
            biQueue.add(A[b]);
            if(b >= k - 1){
                res.add(biQueue.peekFirst());
            }
            if(b >= k && A[a] == biQueue.peekFirst()){
                biQueue.removeFirst();
            }
        }
        return res;
    }
}
