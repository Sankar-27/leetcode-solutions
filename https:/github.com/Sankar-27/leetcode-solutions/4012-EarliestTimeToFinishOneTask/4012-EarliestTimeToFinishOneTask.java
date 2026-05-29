// Last updated: 29/05/2026, 11:53:24
class Solution {
    public int earliestTime(int[][] tasks) {
        int n=tasks.length;
        int m=tasks[0].length;
        int max=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int x=0;
            for(int j=0;j<m;j++){
                x+=tasks[i][j];
            }
            if(x<max)
                    max=x;
        }
        return max;
    }
}