package array.printDuplicate;

public class PrintDuplicate {
    public void printDuplicate(int[] A){
        if(A == null || A.length == 0)return;
        for(int i = 0; i < A.length; i ++){
            int upperBound = getUpperBound(A, i);
            int end = getLastDuplicate(A, i, upperBound);
            int num = end - i + 1;
            System.out.println(A[i] + ":" + num);
            i = end;
        }
    }

    private int getUpperBound(int[] A, int start){
        int dif = 1;
        while(start + dif< A.length)dif <<= 1;
        return Math.min(A.length - 1, start + dif);
    }

    private int getLastDuplicate(int[] A, int start, int end){
        int target = A[start];
        start --;
        end ++;
        while(start + 1 < end){
            int mid = (end - start)/2 + start;
            if(target < A[mid]){
                end = mid;
            }else{
                start = mid;
            }
        }
        return start;
    }
}
