class Solution {
    public int solution(int[][] board) {
        int n = board.length;
        int[][] padded = new int[n + 2][n + 2];
        
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (board[r][c] == 1) {
                    for (int i = r; i <= r + 2; i++) {
                        for (int j = c; j <= c + 2; j++) {
                            if (padded[i][j] == 0) padded[i][j] = 2;
                        }
                    }
                }
            }
        }
        
        int safeCount = 0;
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= n; c++) {
                if (padded[r][c] == 0 && board[r-1][c-1] == 0) safeCount++;
            }
        }
        
        return safeCount;
    }
}