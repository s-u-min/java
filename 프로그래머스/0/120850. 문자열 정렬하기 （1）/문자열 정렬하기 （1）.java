import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        String numbersOnly = my_string.replaceAll("[^0-9]", "");
        
        int[] answer = new int[numbersOnly.length()];
        
        for (int i = 0; i < numbersOnly.length(); i++) {
            answer[i] = numbersOnly.charAt(i) - '0';
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}