// Last updated: 29/05/2026, 11:59:57
class Solution {
    public int climbStairs(int n) {
        if (n <= 1) return 1;

        int a = 1, b = 1;
        for (int i = 2; i <= n; i++) {
            int next = a + b;
            a = b;
            b = next;
        }
        return b;
    }
}
