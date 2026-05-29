// Last updated: 29/05/2026, 11:54:22
class Solution {
    public int maxPower(String s) {
        int max = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) continue;

            int j = i;
            int occ = 1;

            while (j + 1 < s.length() && s.charAt(j) == s.charAt(j + 1)) {
                occ++;
                j++;
            }

            max = Math.max(occ, max);
            i = j;
        }
        return max;
    }
}
