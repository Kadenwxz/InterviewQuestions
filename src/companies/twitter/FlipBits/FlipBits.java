package companies.twitter.FlipBits;

public class FlipBits {
    public int flipBits(int[] A){
        int res = 0, maxDif = 0, pre = 0;
        for(int cur : A){
            if(cur == 1){
                pre --;
                res ++;
            }else{
                pre = Math.max(pre + 1, 1);
                maxDif = Math.max(pre, maxDif);
            }
        }
        return maxDif + res;
    }
}
