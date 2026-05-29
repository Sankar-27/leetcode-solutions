// Last updated: 29/05/2026, 11:54:15
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i] == nums[j] && i < j) count++;
            }
        }
        return count;
    }
}