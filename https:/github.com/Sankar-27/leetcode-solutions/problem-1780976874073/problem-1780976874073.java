// Last updated: 09/06/2026, 09:17:54
1class Solution {
2    public long maxTotalValue(int[] nums, int k) {
3        long min=Integer.MAX_VALUE;
4        long max=Integer.MIN_VALUE;
5        for(int num:nums){
6            max=Math.max(max,num);
7            min=Math.min(min,num);
8        }
9        return (max-min)*k;
10    }
11}