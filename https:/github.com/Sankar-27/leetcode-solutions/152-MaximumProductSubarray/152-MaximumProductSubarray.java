// Last updated: 29/05/2026, 11:58:55
class Solution {
    public int maxProduct(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        int ans=nums[0];
        for (int i = 1; i < nums.length; i++) {
            int tmax=Math.max(nums[i],Math.max(max*nums[i],min*nums[i]));
            int tmin=Math.min(nums[i],Math.min(max*nums[i],min*nums[i]));
            max=tmax;
            min=tmin;
            ans=Math.max(ans,max);
        }
        return ans;
    }
}