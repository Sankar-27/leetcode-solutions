// Last updated: 29/05/2026, 12:00:34
class Solution {
    public int strStr(String s, String x) {
        int n = s.length();
        int l = x.length();
        if (l == 0) {
            return 0;
        }
        if (n < l) {
            return -1;
        }
        for (int i = 0; i <= n - l; i++) {
            boolean matchFound = true;
            for (int j = 0; j < l; j++) {
                if (s.charAt(i + j) != x.charAt(j)) {
                    matchFound = false;
                    break;
                }
            }
            if (matchFound) {
                return i;
            }
        }
        return -1;
    }
}