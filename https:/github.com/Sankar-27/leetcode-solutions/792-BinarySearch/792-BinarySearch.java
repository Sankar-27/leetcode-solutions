// Last updated: 29/05/2026, 11:55:51
class Solution {
    public int search(int[] nums, int target) {
        int len=nums.length;
        int low=0;
        int high=len-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(target>nums[mid]){
                low=mid+1;
            }
            else if(target<nums[mid]){
                high=mid-1;
            }
            else if(target==nums[mid]){
                return mid;
            }
        }
        return -1;
    }
}