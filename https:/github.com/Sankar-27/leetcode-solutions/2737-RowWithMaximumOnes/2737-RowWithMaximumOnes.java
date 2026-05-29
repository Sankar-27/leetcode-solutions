// Last updated: 29/05/2026, 11:53:37
class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int [] res = new int[2];
        res[0]=0;
        res[1]=0;
        for(int i=0;i<m;i++){
            int noone=0;
            for(int j=0;j<n;j++){
                if(mat[i][j]==1)
                    noone++;
            }
            if (noone > res[1]) {
                res[0] = i;
                res[1] = noone;
            }
        }
        return res;

    }
}