// Last updated: 29/05/2026, 11:54:29
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int len=nums.length;
        int[] res=new int[len];
        for(int i=0;i<len;i++){
            int count=0;
            int j=0;
            while(j<len){
                if(nums[j]<nums[i])
                    count++;
                j++;    
            }
            res[i]=count;
        }
        return res;
    }
}