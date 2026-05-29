// Last updated: 29/05/2026, 11:57:16
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> charCounts = new HashMap<>();
        for (char ch : s.toCharArray()) {
            charCounts.put(ch, charCounts.getOrDefault(ch, 0) + 1);
        }

        int length = 0;
        boolean oddCountExists = false;
        for (int count : charCounts.values()) {
            length += (count / 2) * 2;
            if (count % 2 != 0) {
                oddCountExists = true;
            }
        }
        if (oddCountExists) {
            length++;
        }
        return length;
    }
}
