// Last updated: 29/05/2026, 11:59:54
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length,m=matrix[0].length;
        int left=0,right=n*m-1;
        while(left<=right){
            int mid=(left+right)/2;
            int r=mid/m;
            int c=mid%m;
            if(matrix[r][c]==target){
                return true;
            }
            if(matrix[r][c]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return false;
    }
}