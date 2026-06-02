// Last updated: 02/06/2026, 12:27:04
1class Solution {
2    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
3        int minFinishTime = Integer.MAX_VALUE;
4        int n = landStartTime.length;
5        int m = waterStartTime.length;
6
7        // Try every pair of land ride (i) and water ride (j)
8        for (int i = 0; i < n; i++) {
9            for (int j = 0; j < m; j++) {
10                
11                // Case 1: Land ride first, then Water ride
12                int landEnd = landStartTime[i] + landDuration[i];
13                int waterStart = Math.max(landEnd, waterStartTime[j]);
14                int finishTime1 = waterStart + waterDuration[j];
15                
16                // Case 2: Water ride first, then Land ride
17                int waterEnd = waterStartTime[j] + waterDuration[j];
18                int landStart = Math.max(waterEnd, landStartTime[i]);
19                int finishTime2 = landStart + landDuration[i];
20                
21                // Track the absolute global minimum
22                minFinishTime = Math.min(minFinishTime, Math.min(finishTime1, finishTime2));
23            }
24        }
25        
26        return minFinishTime;
27    }
28}
29