import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        List<String> list2 = Arrays.asList(s2);
        
        for (String str1 : s1) {
            if (list2.contains(str1)) {
                answer++;
            }
        }
        
        return answer;
    }
}