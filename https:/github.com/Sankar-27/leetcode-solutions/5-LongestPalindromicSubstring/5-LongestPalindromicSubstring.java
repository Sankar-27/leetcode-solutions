// Last updated: 29/05/2026, 12:00:58
class Solution {
    public String longestPalindrome(String str) {
        int n=str.length();
        boolean dp[][]=new boolean[n][n];
        for(int i=0;i<n;i++){
            dp[i][i]=true;
        }
        String res=str.substring(0, 1);
        for(int len=1;len<n;len++){
            for(int i=0;i<n-len;i++){
                int j=i+len;
                if(str.charAt(i)==str.charAt(j) && (len < 2 || dp[i + 1][j - 1])){
                    dp[i][j]=true;
                    if (len + 1 > res.length()) {
                        res = str.substring(i, j + 1);
                    }
                }    
            }
        }
        return res;
    }
}