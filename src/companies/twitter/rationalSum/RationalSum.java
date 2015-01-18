package companies.twitter.rationalSum;

import java.util.ArrayList;
import java.util.List;

public class RationalSum {
    public int gcd(int a, int b){
        return a == 0 ? b : gcd(b % a, a);
    }

    public List<Integer> rationalSum(int a, int b, int c, int d){
        List<Integer> res = new ArrayList<>();
        int gcd = gcd(a, b);
        a = a/gcd;
        b = b/gcd;
        gcd = gcd(c, d);
        c = c/gcd;
        d = d/gcd;
        gcd = gcd(b, d);
        res.add(a * (d/gcd) + c * (b/gcd));
        res.add(b * (d/gcd));
        return res;
    }
}
