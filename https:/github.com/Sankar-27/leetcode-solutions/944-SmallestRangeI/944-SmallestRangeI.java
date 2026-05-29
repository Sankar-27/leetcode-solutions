// Last updated: 29/05/2026, 11:55:19
class Solution {
    public int smallestRangeI(int[] nums, int k) {

        Arrays.sort(nums);
        int x = nums[0] + k;
        nums[0] = x;
        int max=nums[0];
        int min=nums[0];
        for (int i = 1; i < nums.length; i++) {
            int t = nums[i] - x;
            if (t >= -k && t <= k) {
                nums[i] = x;
            } else {
                nums[i] = nums[i] - k;
            }
            if(max<nums[i]) max=nums[i];
            if(min>nums[i]) min=nums[i];
        }
        return max-min;
    }
}