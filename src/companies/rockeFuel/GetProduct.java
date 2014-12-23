package companies.rockeFuel;

public class GetProduct {
    public int[] getProduct(int[] A){
        if(A == null || A.length == 0)return A;
        int len = A.length;
        int[] B = new int[len];
        for(int i = len - 1; i >= 0; i --){
            if(i == len - 1){
                B[i] = A[i];
            }else{
                B[i] = B[i + 1] * A[i];
            }
        }
        System.out.println("B = ");
        for(int i : B)System.out.print(i + " ");
        System.out.println();
        int cur = 1;
        for(int i = 0; i < len; i ++){
            int tmp = i < len - 1 ? B[i + 1] : 1;
            B[i] = tmp * cur;
            cur *= A[i];
        }
        return B;
    }
}
