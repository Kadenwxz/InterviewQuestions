package array.rotateArray;

public class RotateArray {
    public void rotate(int[] A, int m){
        if(A == null || A.length <= 1 || m % A.length == 0)return;
        int len = A.length;
        m = len - m % len;
        int rounds = gcd(len, m);
        for(int i = 0; i < rounds; i ++){
            int tmp = A[i], cur = i, next = (cur + m)%len;
            while(next != i){
                A[cur] = A[next];
                cur = next;
                next = (cur + m)%len;
            }
            A[cur] = tmp;
        }
    }

    private int gcd(int a, int b){
        return a == 0 ? b : gcd(b % a, a);
    }
}
