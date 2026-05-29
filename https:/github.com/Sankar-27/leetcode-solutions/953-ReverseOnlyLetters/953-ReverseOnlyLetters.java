// Last updated: 29/05/2026, 11:55:16
class Solution {
    public String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray(); 
        int pos = s.length() - 1;
        
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(chars[i])) {
                while (pos >= 0 && !Character.isLetter(chars[pos])) {
                    pos--;
                }
                if (pos > i) { 
                    char temp = chars[i];
                    chars[i] = chars[pos]; 
                    chars[pos] = temp;
                }
                pos--;
            }
        }
        return new String(chars); 
    }
}
