package companies.Tripadvisor.EarlestWindowWithKEvenNumber;

public class EarlestWindowWithKEvenNumber {
    public int getMinWindow(int[] A, int n, int k){
        if(A == null || A.length == 0 || A.length < n || k > n)return -1;
        int count = 0;
        for(int i = 0; i < A.length; i ++){
            if(A[i] %2 == 0)count ++;
            if(i > n && A[i - n] % 2 == 0)count --;
            if(i >= n && count == k)return i;
        }
        return -1;
    }
}
