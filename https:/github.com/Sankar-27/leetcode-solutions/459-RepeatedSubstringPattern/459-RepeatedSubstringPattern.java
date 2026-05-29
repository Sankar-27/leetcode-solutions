// Last updated: 29/05/2026, 11:57:02
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        for (int i = 1; i <= len / 2; i++) {
            if (len % i == 0) {
                String sub = s.substring(0, i);
                if (sub.repeat(len / i).equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }
}