// Last updated: 10/06/2026, 11:38:41
1class Solution {
2    public void setZeroes(int[][] matrix) {
3        int m = matrix.length;
4        int n = matrix[0].length;
5        boolean[] rowZero = new boolean[m];
6        boolean[] colZero = new boolean[n];
7        for (int i = 0; i < m; i++) {
8            for (int j = 0; j < n; j++) {
9                if (matrix[i][j] == 0) {
10                    rowZero[i] = true;
11                    colZero[j] = true;
12                }
13            }
14        }
15        for (int i = 0; i < m; i++) {
16            if (rowZero[i]) {
17                for (int j = 0; j < n; j++) {
18                    matrix[i][j] = 0;
19                }
20            }
21        }
22        for (int j = 0; j < n; j++) {
23            if (colZero[j]) {
24                for (int i = 0; i < m; i++) {
25                    matrix[i][j] = 0;
26                }
27            }
28        }
29    }
30}
31