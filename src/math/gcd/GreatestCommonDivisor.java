package math.gcd;

public class GreatestCommonDivisor {
    public int gcd(int a, int b){
        return a == 0 ? b : gcd(b % a, a);
    }
}
