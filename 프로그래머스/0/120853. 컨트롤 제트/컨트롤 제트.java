class Solution {
    public int solution(String s) {
        int answer = 0;
        int lastValue = 0;
        
        String[] parts = s.split(" ");
        
        for (String part : parts) {
            if (part.equals("Z")) {
                answer -= lastValue;
            } else {
                int currentNum = Integer.parseInt(part);
                answer += currentNum;
                lastValue = currentNum;
            }
        }
        
        return answer;
    }
}