package array.longestIncreasingSubsequence;

import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingSubsequence {
    public int getSize(int[] A){
        if(A == null || A.length == 0)return 0;
        List<Integer> memo = new ArrayList<>();
        for(int i : A){
            if(memo.isEmpty() || i > memo.get(memo.size() - 1)){
                memo.add(i);
            }else{
                int start = -1, end = memo.size();
                while(start + 1 < end){
                    int mid = (end - start)/2 + start;
                    if(i <= memo.get(mid)){
                        end = mid;
                    }else{
                        start = mid;
                    }
                }
                memo.set(end, i);
            }
        }
        return memo.size();
    }
}
