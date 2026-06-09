// Last updated: 09/06/2026, 09:15:36
1class Solution {
2    public long maxTotalValue(int[] nums, int k) {
3        long res=0;
4        long min=Integer.MAX_VALUE;
5        long max=Integer.MIN_VALUE;
6        Arrays.sort(nums);
7        min=nums[0];
8        max=nums[nums.length-1];
9        res=(max-min)*k;
10        return res;
11    }
12}