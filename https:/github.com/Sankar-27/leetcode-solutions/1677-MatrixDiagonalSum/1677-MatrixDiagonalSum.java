// Last updated: 29/05/2026, 11:54:12
class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=mat[i][i];
            if( i != mat.length-1-i){
            sum += mat[i][mat.length-i-1];
                
            }
        }
        return sum;
    }
}