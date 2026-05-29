// Last updated: 29/05/2026, 11:56:59
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public boolean makesquare(int[] matchsticks) {
        int sum = Arrays.stream(matchsticks).sum();
        if (sum % 4 != 0 || matchsticks.length < 4) return false;
        
        // Sorting and reversing is key to pruning
        Integer[] nums = Arrays.stream(matchsticks).boxed().toArray(Integer[]::new);
        Arrays.sort(nums, Collections.reverseOrder());
        
        int target = sum / 4;
        int[] sides = new int[4];
        return backtrack(nums, 0, sides, target);
    }
    
    private boolean backtrack(Integer[] ms, int index, int[] sides, int target) {
        if (index == ms.length) return true;
        
        for (int i = 0; i < 4; i++) {
            if (sides[i] + ms[index] <= target) {
                sides[i] += ms[index];
                if (backtrack(ms, index + 1, sides, target)) return true;
                sides[i] -= ms[index];
            }
            if (sides[i] == 0) break; // Optimization
        }
        return false;
    }
}
