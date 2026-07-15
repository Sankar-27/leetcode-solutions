// Last updated: 15/07/2026, 08:47:29
class Solution {
    public int minOperations(int[] nums) {
        int res=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1]){
                int rem=nums[i-1]-nums[i];
                nums[i]=rem+1+nums[i];
                res+=rem+1;
            }
        }
        return res;
    }
}