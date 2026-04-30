import java.util.*;

class Solution {
    public int solution(int[] array) {
        int[] count = new int[1000];
        int maxCount = 0;
        int answer = 0;

        for(int num : array) {
            count[num]++;
        }

        for(int i = 0; i < 1000; i++) {
            if(count[i] > maxCount) {
               maxCount = count[i];
               answer = i;
           } else if(count[i] == maxCount && maxCount != 0) {
                answer = -1;
           }
        }
        
        return answer;
    }
}