// Last updated: 29/05/2026, 11:55:22
import java.util.Arrays;

class Solution {
    public String orderlyQueue(String s, int k) {
        int n = s.length();

        if (k > 1) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            return new String(arr);
        }

        String res = s;

        for (int i = 1; i < n; i++) {
            String rot = s.substring(i) + s.substring(0, i);
            if (rot.compareTo(res) < 0) {
                res = rot;
            }
        }

        return res;
    }
}