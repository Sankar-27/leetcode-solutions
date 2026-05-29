// Last updated: 29/05/2026, 11:58:45
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left=0;
        int[] res=new int[2];
        int right=nums.length-1;
        while(left<right){
            if(nums[left]+nums[right]==target){
                res[0]=left+1;
                res[1]=right+1;
                break;
            }
            else if(nums[left]+nums[right]>target)    right--;
            else if(nums[left]+nums[right]<target)    left++;
        }
        return res;
    }
}