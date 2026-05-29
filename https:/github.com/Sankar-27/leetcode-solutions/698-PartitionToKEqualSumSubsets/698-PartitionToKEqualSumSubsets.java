// Last updated: 29/05/2026, 11:56:12
class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        for (int num : nums) sum += num;
        
        // If total sum isn't divisible by k, partition is impossible
        if (sum % k != 0) return false;
        
        int target = sum / k;
        // Sort to try larger numbers first (better pruning)
        Arrays.sort(nums);
        int n = nums.length;
        
        // Reverse array for descending order
        for (int i = 0; i < n / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[n - 1 - i];
            nums[n - 1 - i] = temp;
        }
        
        // Pruning: if largest element > target, cannot partition
        if (nums[0] > target) return false;

        return backtrack(nums, new boolean[n], k, 0, 0, target);
    }

    private boolean backtrack(int[] nums, boolean[] used, int k, int currentSum, int start, int target) {
        // Base case: all k subsets successfully filled
        if (k == 0) return true;
        
        // If current subset is full, start finding the next subset
        if (currentSum == target) {
            return backtrack(nums, used, k - 1, 0, 0, target);
        }

        for (int i = start; i < nums.length; i++) {
            // Skip used elements or those that exceed target
            if (used[i] || currentSum + nums[i] > target) continue;

            used[i] = true;
            if (backtrack(nums, used, k, currentSum + nums[i], i + 1, target)) return true;
            used[i] = false; // Backtrack

            // Critical Pruning: if currentSum is 0 and we failed, 
            // no need to try other elements for this specific subset start
            if (currentSum == 0) return false;
        }
        return false;
    }
}
