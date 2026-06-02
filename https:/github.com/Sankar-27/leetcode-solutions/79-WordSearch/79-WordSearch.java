// Last updated: 02/06/2026, 22:40:58
1public class Solution {
2    static boolean[][] visited;
3    public boolean exist(char[][] board, String word) {
4        visited = new boolean[board.length][board[0].length];
5        
6        for(int i = 0; i < board.length; i++){
7            for(int j = 0; j < board[i].length; j++){
8                if((word.charAt(0) == board[i][j]) && search(board, word, i, j, 0)){
9                    return true;
10                }
11            }
12        }
13        
14        return false;
15    }
16    
17    private boolean search(char[][]board, String word, int i, int j, int index){
18        if(index == word.length()){
19            return true;
20        }
21        
22        if(i >= board.length || i < 0 || j >= board[i].length || j < 0 || board[i][j] != word.charAt(index) || visited[i][j]){
23            return false;
24        }
25        
26        visited[i][j] = true;
27        if(search(board, word, i-1, j, index+1) || 
28           search(board, word, i+1, j, index+1) ||
29           search(board, word, i, j-1, index+1) || 
30           search(board, word, i, j+1, index+1)){
31            return true;
32        }
33        
34        visited[i][j] = false;
35        return false;
36    }
37}