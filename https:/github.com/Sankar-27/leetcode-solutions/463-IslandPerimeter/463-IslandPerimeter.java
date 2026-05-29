// Last updated: 29/05/2026, 11:57:01
class Solution {
    static int peri;
    void dfs(int[][] grid,int r,int c){
        if(r<0|| c<0||r>=grid.length||c>=grid[0].length||grid[r][c]==0){
            peri++;
            return ;
        }
        if(grid[r][c]==-1)return ;
        grid[r][c]=-1;// mark as visited 
         dfs(grid,r+1,c);
         dfs(grid,r-1,c);
         dfs(grid,r,c+1);
         dfs(grid,r,c-1);
        
    }
    public int islandPerimeter(int[][] grid) {
       peri=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    dfs(grid,i,j);
                    return peri;
                }
            }
        }
        return -1;
    }
}