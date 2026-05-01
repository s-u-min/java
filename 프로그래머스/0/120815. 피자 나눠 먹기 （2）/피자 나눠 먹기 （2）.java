class Solution {
    public int solution(int n) {
        int gcd = getGCD(n, 6);
        
        return n / gcd;
    }

    private int getGCD(int a, int b) {
        if (b == 0) return a;
        return getGCD(b, a % b);
    }
}