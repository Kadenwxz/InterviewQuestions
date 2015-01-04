package array.countingSort.getHIndex;

public class GetHIndex {
    public int getHIndex(int[] A){
        if(A == null || A.length == 0)return 0;
        int[] memo = new int[A.length + 2];
        for(int a : A)memo[Math.min(a, A.length + 1)]++;
        int sum = memo[memo.length - 1];
        for(int i = A.length; i >= 0; i --){
            if(sum > i)return i;
            sum += memo[i];
        }
        return 0;
    }
}
