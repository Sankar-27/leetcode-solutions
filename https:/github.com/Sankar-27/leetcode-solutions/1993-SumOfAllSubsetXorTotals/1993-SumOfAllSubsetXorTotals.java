// Last updated: 29/05/2026, 11:53:59
class Solution {
    public int subsetXORSum(int[] nums) {
        int sum=0;
        for(int n:nums){
            sum |=n;
        }
        return sum<<(nums.length-1);
    }
}