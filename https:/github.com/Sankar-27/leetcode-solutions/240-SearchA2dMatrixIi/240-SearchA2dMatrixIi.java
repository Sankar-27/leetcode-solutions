// Last updated: 29/05/2026, 11:57:58
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int c=matrix[0].length-1;
        int r=0;;
        while(r<matrix.length && c>=0){
            if(matrix[r][c]==target){
                return true;
            }
            if(matrix[r][c]>target){
                c--;
            }
            else{
                r++;
            }
        }
        return false;
    }
}