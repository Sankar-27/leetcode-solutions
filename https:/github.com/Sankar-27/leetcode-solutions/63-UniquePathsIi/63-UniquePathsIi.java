// Last updated: 29/05/2026, 12:00:05
class Solution {
    public int uniquePathsWithObstacles(int[][] ob) {
        int m=ob.length;
        int n=ob[0].length;
        int[][] dp=new int[m][n];
        if(ob[0][0]==1) return 0;
        dp[0][0]=1;
        for(int i=1;i<m;i++){
            if(ob[i][0]==0){
                dp[i][0]=dp[i-1][0];
            }
        }
        for(int i=1;i<n;i++){
            if(ob[0][i]==0){
                dp[0][i]=dp[0][i-1];
            }
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(ob[i][j]==0){
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];
    }
}