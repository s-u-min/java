import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String[] array = my_string.toLowerCase().split("");
        
        Arrays.sort(array);
        
        return String.join("", array);
    }
}