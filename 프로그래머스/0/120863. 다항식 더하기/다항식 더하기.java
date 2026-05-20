class Solution {
    public String solution(String polynomial) {
        int x = 0, c = 0;
        
        for (String s : polynomial.split(" ")) {
            if (s.contains("x")) x += s.equals("x") ? 1 : Integer.parseInt(s.replace("x", ""));
            else if (!s.equals("+")) c += Integer.parseInt(s);
        }
        
        String xStr = (x == 0) ? "" : (x == 1 ? "x" : x + "x");
        String cStr = (c == 0) ? "" : String.valueOf(c);
        
        return xStr.isEmpty() ? cStr : (cStr.isEmpty() ? xStr : xStr + " + " + cStr);
    }
}