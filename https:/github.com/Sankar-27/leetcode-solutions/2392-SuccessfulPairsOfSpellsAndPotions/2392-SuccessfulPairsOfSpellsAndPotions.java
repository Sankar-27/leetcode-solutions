// Last updated: 29/05/2026, 11:53:48
import java.util.*;

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] result = new int[spells.length];
        int m = potions.length;

        for (int i = 0; i < spells.length; i++) {
            int spell = spells[i];
            int left = 0, right = m - 1;
            int idx = m;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if ((long) spell * potions[mid] >= success) {
                    idx = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            result[i] = m - idx;
        }
        return result;
    }
}
