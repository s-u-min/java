class Solution {
    public int solution(int[][] dots) {
        int w = 0, h = 0;
        
        for (int i = 1; i < 4; i++) {
            if (dots[0][0] != dots[i][0]) w = Math.abs(dots[0][0] - dots[i][0]);
            if (dots[0][1] != dots[i][1]) h = Math.abs(dots[0][1] - dots[i][1]);
        }
        
        return w * h;
    }
}