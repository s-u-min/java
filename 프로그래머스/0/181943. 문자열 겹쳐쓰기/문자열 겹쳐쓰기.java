class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String front = my_string.substring(0, s);
        
        int endIdx = s + overwrite_string.length();
        String back = my_string.substring(endIdx);
        
        return front + overwrite_string + back;
    }
}