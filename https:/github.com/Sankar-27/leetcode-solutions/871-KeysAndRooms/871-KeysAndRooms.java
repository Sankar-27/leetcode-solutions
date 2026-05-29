// Last updated: 29/05/2026, 11:55:36
class Solution {
    boolean[] vi;
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        vi=new boolean[rooms.size()];
        dfs(0,rooms);
        for(boolean i:vi){
            if(i==false)   return false;
        }
        return true;
    }
    public void dfs(int start,List<List<Integer>> rooms){
        vi[start]=true;
        for(int i:rooms.get(start)){
            if(vi[i]==false)    dfs(i,rooms);
        }
    }
}