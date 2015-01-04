package array.consecutiveSequenceSum;

import java.util.HashMap;
import java.util.Map;

public class ConsecutiveSequenceSum {
    public int[] getConsequetiveSequence(int[] A, int target){
        int[] res = {-1, -1};
        if(A == null || A.length == 0)return res;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < A.length; i ++){
            sum += A[i];
            int dif = sum - target;
            if(map.containsKey(dif)){
                res[0] = map.get(dif) + 1;
                res[1] = i;
                break;
            }
            map.put(sum, i);
        }
        return res;
    }
    
    public int[] getConsequetiveSequenceFromPositive(int[] A, int target){
        int[] res = {-1, -1};
        if(A == null || A.length == 0)return res;
        int start = 0, sum = 0;
        for(int i = 0; i < A.length; i ++){
            sum += A[i];
            while(sum > target && start < i){
                sum -= A[start];
                start ++;
            }
            if(sum == target){
                res[0] = start;
                res[1] = i;
                break;
            }
        }
        return res;
    }
}
