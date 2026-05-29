// Last updated: 29/05/2026, 12:00:09
class Solution {
    public int[][] generateMatrix(int m) {
         int[][] matrix = new int[m][m];          
        int top = 0;
        int rightColumn = matrix[0].length - 1;
        int bottom = matrix.length - 1;
        int leftColumn = 0;
        int n=1;
        while (top <= bottom && rightColumn >= leftColumn) {
           for (int i = leftColumn; i <= rightColumn ; i++) {
                matrix[top][i]=n++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                matrix[i][rightColumn]=n++;
            }
            rightColumn--;
            if(top <= bottom){
                for (int i = rightColumn; i >= leftColumn; i--) {
                    matrix[bottom][i]=n++;
                }
                bottom--;
            }
            if(leftColumn <= rightColumn){
                for (int i = bottom; i >= top; i--) {
                    matrix[i][leftColumn]=n++;
                }
                leftColumn++;
            }
        }
        return matrix;
    }
}