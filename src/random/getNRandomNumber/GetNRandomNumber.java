package random.getNRandomNumber;

import java.util.Random;

public class GetNRandomNumber {
    
    Random random = new Random();
    
    int n, maxBits, sign;
    
    public int get1Random(){
        return random.nextInt(2);
    }
    
    public GetNRandomNumber(int n){
        if(n == Integer.MIN_VALUE){
            maxBits = 31;
            sign = -1;
            this.n = n;
        }else{
            sign = n < 0 ? -1 : 1;
            this.n = Math.abs(n);
            this.maxBits = (int)Math.floor(Math.log(this.n)/Math.log(2));
        }    
    }
    
    public int getNRandom(){
        int res = Integer.MAX_VALUE;
        while(n == Integer.MIN_VALUE && res > 0 || res > n){
            res = 0;
            for(int i = 0; i <= maxBits; i ++){
                res |= get1Random() << i;
            }
        }
        if(res < 0)return res;
        while(n != Integer.MIN_VALUE && res > n){
            res = 0;
            for(int i = 0; i <= maxBits; i ++){
                res |= get1Random() << i;
            }
        }
        return res;
    }
}
