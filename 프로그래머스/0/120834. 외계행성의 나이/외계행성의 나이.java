class Solution {
    public String solution(int age) {
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        StringBuilder sb = new StringBuilder();
        
        String ageStr = String.valueOf(age);
        
        for (String s : ageStr.split("")) {
            int index = Integer.parseInt(s);
            sb.append(alphabet[index]);
        }
        
        return sb.toString();
    }
}