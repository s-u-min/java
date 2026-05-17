class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i = 0; i < quiz.length; i++) {
            String[] p = quiz[i].split(" ");
            
            int num1 = Integer.parseInt(p[0]);
            int num2 = Integer.parseInt(p[2]);
            int result = Integer.parseInt(p[4]);
            
            boolean isCorrect = p[1].equals("+") ? (num1 + num2 == result) : (num1 - num2 == result);
            
            answer[i] = isCorrect ? "O" : "X";
        }
        
        return answer;
    }
}