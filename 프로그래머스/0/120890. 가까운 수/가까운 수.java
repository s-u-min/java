import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        
        int answer = array[0];
        int minDiff = Math.abs(n - array[0]);
        
        for (int i = 1; i < array.length; i++) {
            int currentDiff = Math.abs(n - array[i]);
            
            if (currentDiff < minDiff) {
                minDiff = currentDiff;
                answer = array[i];
            }
        }
        
        return answer;
    }
}