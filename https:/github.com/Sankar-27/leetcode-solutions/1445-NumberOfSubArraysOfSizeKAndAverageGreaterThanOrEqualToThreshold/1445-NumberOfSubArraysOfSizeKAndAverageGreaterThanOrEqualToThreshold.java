// Last updated: 29/05/2026, 11:54:39
class Solution {
    public int numOfSubarrays(int[] nums, int k, int threshold) {
        int op=0;
        int target=k*threshold;
        int sum=0;
        int max=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        if(sum>=target)
            op++;
        max=sum;
        for(int i=1;i<=nums.length-k;i++){
            sum=sum-nums[i-1]+nums[i+k-1];
            if(sum>=target)
                op++;
        }
        return op;
    }
}