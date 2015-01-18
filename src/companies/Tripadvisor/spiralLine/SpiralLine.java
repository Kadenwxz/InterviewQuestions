package companies.Tripadvisor.spiralLine;

import java.util.ArrayList;
import java.util.List;

public class SpiralLine {
    public class Pair implements Cloneable{
        int x, y;
        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
        public String toString(){
            StringBuilder builder = new StringBuilder();
            builder.append("(").append(x).append(",").append(y).append(")");
            return builder.toString();
        }
        public Pair clone(){
            return new Pair(this.x, this.y);
        }
    }

    public List<Pair> getSpiral(int n){
        List<Pair> res = new ArrayList<>();
        if(n <= 0)return res;
        res.add(new Pair(0, 0));
        Pair[] memo = {new Pair(1, 0), new Pair(1, 1), new Pair(-1, 1), new Pair(-1, -1)};
        for(int i = 0; i < n - 1; i ++){
            int cur = i % 4;
            res.add(memo[cur].clone());
            if(cur == 0){
                memo[cur].x ++;
                memo[cur].y --;
            }else if(cur == 1){
                memo[cur].x ++;
                memo[cur].y ++;
            }else if(cur == 2){
                memo[cur].x --;
                memo[cur].y ++;
            }else{
                memo[cur].x --;
                memo[cur].y --;
            }
        }
        return res;
    }
}
