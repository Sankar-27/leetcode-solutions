// Last updated: 03/06/2026, 22:47:35
1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int left = 0, right = 0;
4        int sum = 0;
5        int minlen = Integer.MAX_VALUE;
6        
7        while (right < nums.length) {
8            sum += nums[right];
9            right++;
10            
11            while (sum >= target) {
12                int currentLen = right - left;
13                minlen = Math.min(minlen, currentLen);
14                sum -= nums[left];
15                left++;
16            }
17        }
18        
19        return minlen == Integer.MAX_VALUE ? 0 : minlen;
20    }
21}