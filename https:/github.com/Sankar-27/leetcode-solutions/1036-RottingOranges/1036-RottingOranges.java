// Last updated: 29/05/2026, 11:55:04
class Solution {
    int levels;
    int[][] dir = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    public void bfs(int[][] grid, Queue<int[]> q){
        while(!q.isEmpty()){
            int curr[] = q.poll();
            for(int[] d : dir){
                int x = curr[0] + d[0];
                int y = curr[1] + d[1];
                if(x>=0 && x<grid.length && y>=0 && y<grid[0].length && grid[x][y]==1){
                    grid[x][y] = 2; // rot this orange
                    q.offer(new int[]{x, y});
                }
            }
            if(curr[0]==-1 && q.size()!=0){
                // if -1 encountered => increase level
                // and push (-1, -1) to mark next level
                q.offer(new int[]{-1, -1});
                levels++;
            }
        }
    }
    public int orangesRotting(int[][] grid) {
        levels = 0; // min minutes to rott all
        Queue<int[]> q = new LinkedList<>();
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==2){
                    // they all will start to rot simultaneously => so they are at same level initially
                    q.offer(new int[]{i, j});
                }
            }
        }
        q.offer(new int[]{-1, -1}); // to mark a level
        bfs(grid, q); // start bfs
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==1) return -1; // is still any unrotten orange => -1
            }
        }
        return levels;
    }
}