// Last updated: 29/05/2026, 11:58:56
class Solution {
    public String reverseWords(String s) {
        
        String[] str = s.trim().split("\\s+");

        StringBuilder resultBuilder = new StringBuilder();

        for (int i = str.length - 1; i >= 0; i--) {
            resultBuilder.append(str[i]);
            if (i > 0) {
                resultBuilder.append(" ");
            }
        }
        return resultBuilder.toString();
    }
}