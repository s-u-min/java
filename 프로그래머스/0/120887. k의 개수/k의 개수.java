class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        char target = (char)(k + '0');
        
        for (int num = i; num <= j; num++) {
            String numStr = String.valueOf(num);
            
            for (int l = 0; l < numStr.length(); l++) {
                if (numStr.charAt(l) == target) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}