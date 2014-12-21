package binarySearch.getMissingNumbers;

import java.util.ArrayList;
import java.util.List;

public class GetMissingNumbers {
    List<Integer> res = new ArrayList<>();
    public List<Integer> getMissingNumbers(int[] A, int n){
        if(A == null || A.length >= n)return res;
        getMissingNumbers(A, 0, A.length - 1, 1, n);
        return res;
    }
    
    private void getMissingNumbers(int[] A, int a, int b, int c, int d){
        if(a > b){
            for(int i = c; i <= d; i ++)res.add(i);
            return;
        }
        int mid = (b - a)/2 + a;
        getMissingNumbers(A, a, mid - 1, c, A[mid] - 1);
        getMissingNumbers(A, mid + 1, b, A[mid] + 1, d);
    }
}
