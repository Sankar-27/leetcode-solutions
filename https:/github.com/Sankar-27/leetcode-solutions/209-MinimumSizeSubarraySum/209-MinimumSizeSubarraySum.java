// Last updated: 29/05/2026, 11:58:21
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, right = 0;
        int sum = 0;
        int minlen = Integer.MAX_VALUE;
        
        while (right < nums.length) {
            sum += nums[right];
            right++;
            
            while (sum >= target) {
                int currentLen = right - left;
                minlen = Math.min(minlen, currentLen);
                sum -= nums[left];
                left++;
            }
        }
        
        return minlen == Integer.MAX_VALUE ? 0 : minlen;
    }
}