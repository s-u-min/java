import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        Arrays.sort(numlist);
        
        List<Integer> list = new ArrayList<>();
        for (int i = numlist.length - 1; i >= 0; i--) {
            list.add(numlist[i]);
        }
        
        Collections.sort(list, (a, b) -> {
            int distA = Math.abs(a - n);
            int distB = Math.abs(b - n);
            return Integer.compare(distA, distB);
        });
        
        int[] answer = new int[numlist.length];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}