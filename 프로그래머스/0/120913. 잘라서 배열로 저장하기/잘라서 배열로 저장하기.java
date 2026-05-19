class Solution {
    public String[] solution(String my_str, int n) {
        int len = my_str.length();
        
        int arrayLength = (len + n - 1) / n;
        String[] answer = new String[arrayLength];
        
        int idx = 0;
        for (int i = 0; i < len; i += n) {
            int end = Math.min(i + n, len);
            
            answer[idx++] = my_str.substring(i, end);
        }
        
        return answer;
    }
}