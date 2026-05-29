// Last updated: 29/05/2026, 11:57:34
class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length, w=amount;
        if(amount==0)   return 0;
        int[][] dp=new int[n+1][w+1];
        dp[0][0]=0;
        for(int i=1;i<=w;i++){
            dp[0][i]=w+1;
        }
        for(int i=1;i<=n;i++){
            for(int j=0;j<=w;j++){
                if(coins[i-1]>j)    dp[i][j]=dp[i-1][j];
                else    dp[i][j]=Math.min(dp[i-1][j],1+dp[i][j-coins[i-1]]);
            }
        }
        return dp[n][w]==w+1?-1:dp[n][w];
    }
}