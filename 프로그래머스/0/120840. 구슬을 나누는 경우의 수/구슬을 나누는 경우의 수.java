import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        BigInteger num = factorial(balls);
        BigInteger den = factorial(balls - share).multiply(factorial(share));
        
        return num.divide(den).intValue();
    }
    
    public BigInteger factorial(int n) {
        BigInteger res = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
}

// nCm