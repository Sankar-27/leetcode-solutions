// Last updated: 12/06/2026, 21:11:42
1class Solution {
2    public boolean canJump(int[] nums) {
3        int gap = 1;
4        for(int i=nums.length-2; i>=0; i--) {
5            if(nums[i] < gap) gap ++;
6            else gap = 1;
7        }
8        return gap > 1 ? false : true;
9    }
10}