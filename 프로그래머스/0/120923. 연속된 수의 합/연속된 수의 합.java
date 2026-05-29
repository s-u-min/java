class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        int baseSum = 0;
        for (int i = 0; i < num; i++) {
            baseSum += i;
        }
        
        int start = (total - baseSum) / num;
        
        for (int i = 0; i < num; i++) {
            answer[i] = start + i;
        }
        
        return answer;
    }
}