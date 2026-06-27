// Last updated: 27/06/2026, 10:28:59
1class Solution {
2    public int minOperations(int[] nums) {
3        int res=0;
4        for(int i=1;i<nums.length;i++){
5            if(nums[i]<=nums[i-1]){
6                int rem=nums[i-1]-nums[i];
7                nums[i]=rem+1+nums[i];
8                res+=rem+1;
9            }
10        }
11        return res;
12    }
13}