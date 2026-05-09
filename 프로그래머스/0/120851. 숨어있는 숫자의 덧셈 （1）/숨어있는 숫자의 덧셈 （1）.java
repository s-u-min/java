class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String numbersOnly = my_string.replaceAll("[^0-9]", "");
        
        for (int i = 0; i < numbersOnly.length(); i++) {
            answer += numbersOnly.charAt(i) - '0';
        }
        
        return answer;
    }
}