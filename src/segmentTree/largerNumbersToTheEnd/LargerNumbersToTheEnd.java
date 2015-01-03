package segmentTree.largerNumbersToTheEnd;

import java.util.Arrays;

public class LargerNumbersToTheEnd {
    public class SegmentTree{
        public int[] left, right, count;
        public SegmentTree(int[] memo, int n){
            int size = n * 4 + 10;
            left = new int[size];
            right = new int[size];
            count = new int[size];
            construct(0, memo, 0, memo.length - 1);
        }
        
        private void construct(int head, int[] memo, int start, int end){
            left[head] = memo[start];
            right[head] = memo[end];
            if(start >= end)return;
            int mid = (end - start)/2 + start;
            construct(head * 2 + 1, memo, start, mid);
            construct(head * 2 + 2, memo, mid + 1, end);
        }
        
        public int query(int head, int min, int max){
            if(right[head] < min || left[head] > max)return 0;
            if(left[head] >= min && right[head] <= max)return count[head];
            return query(head * 2 + 1, min, max) + query(head * 2 + 2, min, max);
        }
        
        public void update(int head, int val){
            if(val < left[head] || val > right[head])return;
            count[head] ++;
            update(head * 2 + 1, val);
            update(head * 2 + 2, val);
        }
    }
    public int[] getLargerNumbersToTheEnd(int[] A){
        if(A == null || A.length == 0)return A;
        int[] memo = Arrays.copyOf(A, A.length), res = new int[A.length];
        Arrays.sort(memo);
        SegmentTree tree = new SegmentTree(memo, memo.length);
        for(int i = A.length - 1; i >= 0; i --){
            res[i] = tree.query(0, Integer.MIN_VALUE, A[i] - 1);
            tree.update(0, A[i]);
        }
        return res;
    }
}
