class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String replaced = my_string.replaceAll("[a-zA-Z]", " ");
        
        String[] tokens = replaced.split("\\s+");
        
        for (String token : tokens) {
            if (!token.isEmpty()) {
                answer += Integer.parseInt(token);
            }
        }
        
        return answer;
    }
}