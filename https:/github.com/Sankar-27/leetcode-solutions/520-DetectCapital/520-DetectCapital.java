// Last updated: 29/05/2026, 11:56:43
class Solution {
    public boolean detectCapitalUse(String word) {
        int upperCount = 0;

        for (char ch : word.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                upperCount++;
            }
        }

        return upperCount == word.length() || upperCount == 0 || (upperCount == 1 && Character.isUpperCase(word.charAt(0)));
    }
}