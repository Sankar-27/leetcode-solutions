// Last updated: 29/05/2026, 11:55:07
class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
       Arrays.sort(nums);
        return nums;
    }
}