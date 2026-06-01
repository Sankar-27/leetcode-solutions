// Last updated: 01/06/2026, 09:50:28
1class Solution {
2    public int minimumCost(int[] cost) {
3        int min=0;
4        Arrays.sort(cost);
5        int count=2;
6        for(int i=cost.length-1;i>=0;i--){
7            if(count==0){
8                count=2;
9                continue;
10            }
11            min+=cost[i];
12            count--;
13        }
14        return min;
15    }
16}