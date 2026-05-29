// Last updated: 29/05/2026, 11:53:54
class Solution {
    public int findMiddleIndex(int[] nums) {
        int l=0,r=0;
        for(int i=0;i<nums.length;i++){
            r+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            r-=nums[i];
            
            if(l==r)
                return i;
            l+=nums[i];    
        }
        return -1;
    }
}