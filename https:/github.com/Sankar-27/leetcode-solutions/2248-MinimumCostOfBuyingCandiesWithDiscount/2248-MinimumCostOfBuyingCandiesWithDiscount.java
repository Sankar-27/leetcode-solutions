// Last updated: 15/07/2026, 08:47:19
class Solution {
    public int minimumCost(int[] cost) {
        int min=0;
        Arrays.sort(cost);
        int count=2;
        for(int i=cost.length-1;i>=0;i--){
            if(count==0){
                count=2;
                continue;
            }
            min+=cost[i];
            count--;
        }
        return min;
    }
}