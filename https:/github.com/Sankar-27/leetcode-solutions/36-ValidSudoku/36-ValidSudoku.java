// Last updated: 12/06/2026, 23:59:09
1class Solution {
2    public boolean isValidSudoku(char[][] board) {
3        //grid=(i/3)*3+(j/3)
4        HashSet<Character>[] row=new HashSet[9];
5        HashSet<Character>[] col = new HashSet[9];
6        HashSet<Character>[] grid = new HashSet[9];
7        for(int i=0;i<9;i++){
8            row[i] = new HashSet<>();
9            col[i] = new HashSet<>();
10            grid[i] = new HashSet<>();
11        }
12        for(int i=0;i<9;i++){
13            for(int j=0;j<9;j++){
14                Character ch=board[i][j];
15                if(ch=='.')
16                continue;
17
18                if(row[i].contains(ch))
19                return false;
20                row[i].add(ch);
21
22                if(col[j].contains(ch))
23                return false;
24                col[j].add(ch);
25
26                int grid_index=(i/3)*3+(j/3);
27                if(grid[grid_index].contains(ch))
28                return false;
29                grid[grid_index].add(ch);
30            }
31        }
32        return true;
33
34    }
35}