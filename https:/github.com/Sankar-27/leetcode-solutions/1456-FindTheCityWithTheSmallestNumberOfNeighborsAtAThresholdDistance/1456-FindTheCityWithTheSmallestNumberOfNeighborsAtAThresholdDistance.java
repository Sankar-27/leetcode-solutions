// Last updated: 29/05/2026, 11:54:36
class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] dist = new int[n][n]; // O(V ^ 2)

        // O(V ^ 2)
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i != j) {
                    dist[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        // O(E)
        for(int[] edge: edges) {
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];

            dist[u][v] = wt;
            dist[v][u] = wt;
        }

        // O(V ^ 3)
        for(int k = 0; k < n; k++) {
            for(int i = 0; i < n; i++) {
                if(dist[i][k] == Integer.MAX_VALUE) continue;
                for(int j = 0; j < n; j++) {
                    if(dist[k][j] == Integer.MAX_VALUE) continue;

                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                }
            }
        }
        
        // O(V ^ 2)
        int result = -1;
        int minValue = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            int cityCount = 0;
            for(int j = 0; j < n; j++) {
                if(i != j && dist[i][j] <= distanceThreshold) cityCount++;
            }
            if(minValue >= cityCount) {
                minValue = cityCount;
                result = i;
            }
        }

        return result;
    }
}