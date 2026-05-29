// Last updated: 29/05/2026, 11:54:18
class Solution {
    public int[] runningSum(int[] nums) {
        int len=nums.length;
        int[] arr=new int[len];
        for(int i=0;i<nums.length;i++){
            if(i==0)
                arr[i]=nums[i];
            else{
                arr[i]=nums[i]+arr[i-1];
            }    
        }
        return arr;
    }
}