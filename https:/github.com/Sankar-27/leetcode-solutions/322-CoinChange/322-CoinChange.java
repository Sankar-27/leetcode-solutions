// Last updated: 17/06/2026, 23:33:26
1class Solution {
2    public int coinChange(int[] coins, int amount) {
3        int n=coins.length, w=amount;
4        if(amount==0)   return 0;
5        int[][] dp=new int[n+1][w+1];
6        dp[0][0]=0;
7        for(int i=1;i<=w;i++){
8            dp[0][i]=w+1;
9        }
10        for(int i=1;i<=n;i++){
11            for(int j=0;j<=w;j++){
12                if(coins[i-1]>j)    dp[i][j]=dp[i-1][j];
13                else    dp[i][j]=Math.min(dp[i-1][j],1+dp[i][j-coins[i-1]]);
14            }
15        }
16        return dp[n][w]==w+1?-1:dp[n][w];
17    }
18}