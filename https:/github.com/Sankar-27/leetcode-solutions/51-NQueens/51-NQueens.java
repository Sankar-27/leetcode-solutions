// Last updated: 29/05/2026, 12:00:18
class Solution {
    public boolean isSafe(char[][] grid, int i, int j) {

        // check upper column
        for (int row = i - 1; row >= 0; row--) {
            if (grid[row][j] == 'Q') {
                return false;
            }
        }

        // check upper-left diagonal
        for (int r = i - 1, col = j - 1; r >= 0 && col >= 0; r--, col--) {
            if (grid[r][col] == 'Q') {
                return false;
            }
        }

        // check upper-right diagonal
        for (int r = i - 1, col = j + 1; r >= 0 && col < grid[0].length; r--, col++) {
            if (grid[r][col] == 'Q') {
                return false;
            }
        }

        return true; // position is safe
    }

    public void recursion(char[][] grid, int i) {
        // base case: all queens are placed
        if (i == grid.length) {
            addToResult(grid); // add configuration to result
            return;
        }

        // try placing queen in each column
        for (int j = 0; j < grid[0].length; j++) {
            if (isSafe(grid, i, j)) {
                grid[i][j] = 'Q';      // place queen
                recursion(grid, i + 1); // move to next row
                grid[i][j] = '.';      // backtrack
            }
        }
    }

    List<List<String>> result;

    // convert board configuration to list of strings
    public void addToResult(char[][] grid) {
        List<String> a = new ArrayList<>();
        for (char[] row : grid) {
            String temp = new String(row);
            a.add(temp);
        }
        result.add(a);
    }

    public List<List<String>> solveNQueens(int n) {
        char[][] grid = new char[n][n];

        // initialize board with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = '.';
            }
        }

        result = new ArrayList<>();
        recursion(grid, 0); // start placing queens from row 0
        return result;
    }
}