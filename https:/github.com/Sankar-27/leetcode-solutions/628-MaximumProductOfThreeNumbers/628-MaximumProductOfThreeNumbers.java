// Last updated: 29/05/2026, 11:56:26
class Solution {
    public int maximumProduct(int[] nums) {
        int len=nums.length;
        Arrays.sort(nums);
        int prod1=nums[0]*nums[1]*nums[len-1];
        int prod2=nums[len-1]*nums[len-2]*nums[len-3];
        int max=Math.max(prod1,prod2);
        return max;
    }
}