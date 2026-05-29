// Last updated: 29/05/2026, 11:55:59
class Solution {
    public int dominantIndex(int[] nums) {
        int maxNumber=nums[0];
        int maxIndex=0;
        boolean flag=true;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>maxNumber){
                maxNumber=nums[i];
                maxIndex=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==maxNumber) continue;
            if(maxNumber<(nums[i]*2)){
                flag=false;
            }
        }
        if(flag) return maxIndex;
        else return -1;
    }
}