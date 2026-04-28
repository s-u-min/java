class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int top = (numer1 * denom2) + (numer2 * denom1);
        int bottom = denom1 * denom2;
        
        int gcd = getGCD(top, bottom);
        
        return new int[]{top / gcd, bottom / gcd};
    }
    
    private int getGCD(int a, int b) {
        if (a % b == 0) return b;
        return getGCD(b, a % b);
    }
}