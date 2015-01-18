package companies.twitter.twoOperations;

public class GetMinNum {
    public int getMinNum(int n){
        int onesCount = 0, high = 0;
        for(int i = 0; i < 31; i ++){
            if((n & (1<<i)) > 0){
                high = i;
                onesCount ++;
            }
        }
        return high + onesCount;
    }
}
