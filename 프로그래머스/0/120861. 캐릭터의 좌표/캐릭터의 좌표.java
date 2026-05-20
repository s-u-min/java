class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int xLimit = board[0] / 2;
        int yLimit = board[1] / 2;
        
        int x = 0;
        int y = 0;
        
        for (String key : keyinput) {
            switch (key) {
                case "left":  x--; break;
                case "right": x++; break;
                case "down":  y--; break;
                case "up":    y++; break;
            }
            
            x = Math.max(-xLimit, Math.min(x, xLimit));
            y = Math.max(-yLimit, Math.min(y, yLimit));
        }
        
        return new int[]{x, y};
    }
}