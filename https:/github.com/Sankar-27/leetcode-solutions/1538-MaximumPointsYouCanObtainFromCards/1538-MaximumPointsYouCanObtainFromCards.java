// Last updated: 29/05/2026, 11:54:24
class Solution {
    public int maxScore(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum=sum+nums[i];
        }
        int max=sum;
        for(int i=0;i<k;i++){
            sum=sum+nums[nums.length-i-1]-nums[k-i-1];
            if(sum>max)
                max=sum;
        }
        return max;
    }
}