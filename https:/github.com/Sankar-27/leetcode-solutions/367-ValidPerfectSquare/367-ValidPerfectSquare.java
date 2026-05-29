// Last updated: 29/05/2026, 11:57:26
class Solution {
    public boolean isPerfectSquare(int num) {
         int l = 1, r = num ;

        while (l <= r) {
            int m = l + (r - l) / 2;
            if (((long) m * (long) m) == num) {
                return true;
            } else if (((long) m * (long) m) > num) {
                r = m - 1;
            } else l = m + 1;
        }
        return false;
    }
}