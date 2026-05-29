// Last updated: 29/05/2026, 11:56:45
class Solution {
    public int change(int amount, int[] coins) {
        int n=coins.length,w=amount;
        /*
        int[][] dp=new int[n+1][w+1];
        for(int i=0;i<=n;i++){
            dp[i][0]=1;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=w;j++){
                if(coins[i-1]>j)    dp[i][j]=dp[i-1][j];
                else    dp[i][j]=dp[i-1][j]+dp[i][j-coins[i-1]];
            }
        }
        return dp[n][w];
        */
        int[] dp= new int[w+1];
        dp[0]=1;
        for(int c:coins){
            for(int i=c;i<=w;i++){
                dp[i]=dp[i-c]+dp[i];
            }
        }
        return dp[w];
    }
}