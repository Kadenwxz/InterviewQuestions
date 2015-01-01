package array.longestIncreasingSubsequence;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public int getSize(int[] A){
        if(A == null || A.length == 0)return 0;
        int len = A.length;
        int[] memo = new int[len + 1];
        Arrays.fill(memo, Integer.MAX_VALUE);
        memo[0] = Integer.MIN_VALUE;
        int res = 0;
        for(int i = 0; i < len; i ++){
            int index = getMaximumMin(memo, 0, res, A[i]);
            memo[index + 1] = Math.min(memo[index + 1], A[i]);
            res = Math.max(res, index + 1);
        }
        return res;
    }
    
    private int getMaximumMin(int[] memo, int start, int end, int target){
        start --;
        end ++;
        while(start + 1 < end){
            int mid = (end - start)/2 + start;
            if(target < memo[mid]){
                end = mid;
            }else{
                start = mid;
            }
        }
        return start;
    }
}
