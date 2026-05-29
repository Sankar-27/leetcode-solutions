// Last updated: 29/05/2026, 11:53:47
class Solution {
    public long countPairs(int n, int[][] edges) {
        List<List<Integer>> lis=new ArrayList<>();
        for(int i=0;i<n;i++){
            lis.add(new ArrayList<>());
        }
        for(int[] i:edges){
            int u=i[0];
            int v=i[1];
            lis.get(u).add(v);
            lis.get(v).add(u);
        }
        boolean visited[]=new boolean[n];
        long rem=0;
        long res=n;
        for(int i=0;i<n;i++){
            if (!visited[i]) {
                int s=dfs(i,lis,visited);
                res-=s;
                rem+=res*s;
            }
        }
        return rem;
    }
    public int dfs(int node,List<List<Integer>> graph,boolean[] visited){
    visited[node]=true;
    int c=1;
    for(int i:graph.get(node)){
        if(!visited[i]) c+=dfs(i,graph,visited);
    }
    return c;
    }
}