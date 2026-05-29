class Solution {
    public int solution(int[] common) {
        int lastIndex = common.length - 1;
        
        if ((common[1] - common[0]) == (common[2] - common[1])) {
            int diff = common[1] - common[0];
            return common[lastIndex] + diff;
        } else {
            int ratio = common[1] / common[0];
            return common[lastIndex] * ratio;
        }
    }
}