// Last updated: 18/06/2026, 09:36:57
1class Solution {
2    public List<Integer> spiralOrder(int[][] matrix) {
3        List<Integer> ans = new ArrayList<>();          
4        int top = 0;
5        int rightColumn = matrix[0].length - 1;
6        int bottom = matrix.length - 1;
7        int leftColumn = 0;
8
9        while (top <= bottom && rightColumn >= leftColumn) {
10           for (int i = leftColumn; i <= rightColumn ; i++) {
11                ans.add(matrix[top][i]);
12            }
13            top++;
14            for (int i = top; i <= bottom; i++) {
15                ans.add(matrix[i][rightColumn]);
16            }
17            rightColumn--;
18            if(top <= bottom){
19                for (int i = rightColumn; i >= leftColumn; i--) {
20                    ans.add(matrix[bottom][i]);
21                }
22                bottom--;
23            }
24            if(leftColumn <= rightColumn){
25                for (int i = bottom; i >= top; i--) {
26                    ans.add(matrix[i][leftColumn]);
27                }
28                leftColumn++;
29            }
30        }
31        return ans;
32    }
33}