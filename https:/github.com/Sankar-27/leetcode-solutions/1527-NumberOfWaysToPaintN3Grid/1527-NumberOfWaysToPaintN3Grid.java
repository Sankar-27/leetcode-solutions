// Last updated: 29/05/2026, 11:54:25
class Solution {
    public int numOfWays(int n) {
        final int MOD = 1_000_000_007;

        long diff = 6; // all 3 cells different
        long same = 6; // first and third same

        for (int i = 2; i <= n; i++) {
            long newDiff = (diff * 2 + same * 2) % MOD;
            long newSame = (diff * 2 + same * 3) % MOD;

            diff = newDiff;
            same = newSame;
        }

        return (int)((diff + same) % MOD);
    }
}