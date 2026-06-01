// Last updated: 01/06/2026, 12:30:57
1class Solution {
2    public int maximalSquare(char[][] matrix) {
3        int m=matrix.length;
4        int n=matrix[0].length;
5        int[][] dp=new int[m+1][n+1];
6        int res=0;
7        for(int i=1;i<=m;i++){
8            for(int j=1;j<=n;j++){
9                if (matrix[i - 1][j - 1] == '1') {
10                    dp[i][j]=Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]))+1;
11                    res=Math.max(res,dp[i][j]);
12                }
13            }
14        }
15        return res*res;
16    }
17}