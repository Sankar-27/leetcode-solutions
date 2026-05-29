// Last updated: 29/05/2026, 11:58:53
class Solution {
    public int findMin(int[] nums) {
        int min=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        return min;
    }
}