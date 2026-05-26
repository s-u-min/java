import java.util.*;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        Map<String, String> dbMap = new HashMap<>();
        for (String[] user : db) {
            dbMap.put(user[0], user[1]);
        }
        
        String inputId = id_pw[0];
        String inputPw = id_pw[1];
        
        if (dbMap.containsKey(inputId)) {
            if (dbMap.get(inputId).equals(inputPw)) {
                return "login";
            } else {
                return "wrong pw";
            }
        }
        
        return "fail";
    }
}