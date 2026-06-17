// Last updated: 17/06/2026, 22:54:15
1class Solution {
2    boolean[] vi;
3    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
4        vi=new boolean[rooms.size()];
5        dfs(0,rooms);
6        for(boolean i:vi){
7            if(i==false)   return false;
8        }
9        return true;
10    }
11    public void dfs(int start,List<List<Integer>> rooms){
12        vi[start]=true;
13        for(int i:rooms.get(start)){
14            if(vi[i]==false)    dfs(i,rooms);
15        }
16    }
17}