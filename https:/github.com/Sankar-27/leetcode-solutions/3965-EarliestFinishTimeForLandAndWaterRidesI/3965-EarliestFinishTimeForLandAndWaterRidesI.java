// Last updated: 15/07/2026, 08:47:06
class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int minFinishTime = Integer.MAX_VALUE;
        int n = landStartTime.length;
        int m = waterStartTime.length;

        // Try every pair of land ride (i) and water ride (j)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                
                // Case 1: Land ride first, then Water ride
                int landEnd = landStartTime[i] + landDuration[i];
                int waterStart = Math.max(landEnd, waterStartTime[j]);
                int finishTime1 = waterStart + waterDuration[j];
                
                // Case 2: Water ride first, then Land ride
                int waterEnd = waterStartTime[j] + waterDuration[j];
                int landStart = Math.max(waterEnd, landStartTime[i]);
                int finishTime2 = landStart + landDuration[i];
                
                // Track the absolute global minimum
                minFinishTime = Math.min(minFinishTime, Math.min(finishTime1, finishTime2));
            }
        }
        
        return minFinishTime;
    }
}
