// Last updated: 29/05/2026, 11:53:53
class Solution {
    static HashMap<Integer,List<Integer>> map;
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        map=new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(i, new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            map.get(u).add(v);
            map.get(v).add(u);
        }
        boolean[] vi=new boolean[n];
        return dfs(source,destination,vi);
    }

    static boolean dfs(int source,int destination,boolean[] vi){
        if(source==destination) return true;
        vi[source]=true;
        for(int i:map.get(source)){
            if(vi[i]==false){
                if(dfs(i,destination,vi))
                    return true;
            }
        }
        return false;
    }
}