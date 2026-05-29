// Last updated: 29/05/2026, 11:53:39
class Solution {
    public int maximumCount(int[] nums) {
        int pos=0,neg=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=1)
                pos++;
            else if(nums[i]<=-1)
                neg++;    
        }
        return Math.max(pos,neg);
    }
}