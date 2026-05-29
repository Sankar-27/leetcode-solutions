// Last updated: 29/05/2026, 11:56:13
class Solution {
    public int countBinarySubstrings(String s) {
        int prev = 0; 
        int curr = 1;
        int result = 0;

        for (int i = 1; i < s.length(); i++) { 
            if (s.charAt(i) == s.charAt(i - 1)) { 
                curr++;
            } else {
                result += Math.min(prev, curr);
                prev = curr;
                curr = 1;
            }
        }

        result += Math.min(prev, curr);
        return result;
    }
}