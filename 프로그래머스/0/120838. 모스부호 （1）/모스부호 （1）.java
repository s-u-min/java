class Solution {
    public String solution(String letter) {
        String[] morse = {
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
            "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-",
            "..-","...-",".--","-..-","-.--","--.."
        };
        
        StringBuilder sb = new StringBuilder();
        
        String[] words = letter.split(" ");
        
        for (String word : words) {
            for (int i = 0; i < morse.length; i++) {
                if (word.equals(morse[i])) {
                    sb.append((char)(i + 'a'));
                    break;
                }
            }
        }
        
        return sb.toString();
    }
}