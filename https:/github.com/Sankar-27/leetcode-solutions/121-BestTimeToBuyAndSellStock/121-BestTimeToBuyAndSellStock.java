// Last updated: 29/05/2026, 11:59:20
class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
        return 0;
    }
    int min = Integer.MAX_VALUE;
    int profit = 0;
    for (int i = 0; i < prices.length; i++) {
        min = Math.min(min, prices[i]);
        profit = Math.max(profit, prices[i] - min);
    }
    return profit;
    }
}