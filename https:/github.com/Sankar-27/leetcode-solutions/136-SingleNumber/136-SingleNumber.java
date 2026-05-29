// Last updated: 29/05/2026, 11:59:11
class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int n : nums) {
            res ^= n;
        }
        return res;        
    }    
}