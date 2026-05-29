// Last updated: 29/05/2026, 11:58:48
class Solution {
    public int findPeakElement(int[] nums) {
        int low=0,high=nums.length-1;
        while(low!=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>nums[mid+1]){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}