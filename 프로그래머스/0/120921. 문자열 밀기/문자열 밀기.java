class Solution {
    public int solution(String A, String B) {
        String repeatB = B + B;
        
        return repeatB.indexOf(A);
    }
}