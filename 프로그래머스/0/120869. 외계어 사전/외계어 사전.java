import java.util.Arrays;

class Solution {
    public int solution(String[] spell, String[] dic) {
        Arrays.sort(spell);
        String target = String.join("", spell);
        
        for (String word : dic) {
            String[] wordArr = word.split("");
            Arrays.sort(wordArr);
            String sortedWord = String.join("", wordArr);
            
            if (sortedWord.equals(target)) {
                return 1;
            }
        }
        
        return 2;
    }
}