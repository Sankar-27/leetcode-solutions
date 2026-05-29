// Last updated: 29/05/2026, 11:53:21
class Solution {

    public long minCost(String s, int encCost, int flatCost) {
        int n = s.length();

        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + (s.charAt(i) - '0');
        }

        return solve(0, n, prefix, encCost, flatCost);
    }

    private long solve(int l, int r, int[] prefix, int encCost, int flatCost) {
        int len = r - l;
        int ones = prefix[r] - prefix[l];

        long cost;
        if (ones == 0) {
            cost = flatCost;
        } else {
            cost = (long) len * ones * encCost;
        }

        if (len % 2 == 0) {
            int mid = l + len / 2;
            long split = solve(l, mid, prefix, encCost, flatCost)
                       + solve(mid, r, prefix, encCost, flatCost);
            cost = Math.min(cost, split);
        }

        return cost;
    }
}