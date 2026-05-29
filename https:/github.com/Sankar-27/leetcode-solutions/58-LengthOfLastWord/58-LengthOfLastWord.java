// Last updated: 29/05/2026, 12:00:10
class Solution {
    public int lengthOfLastWord(String s) {
        String[] str=s.split(" ");
        int last=str.length;
        int len=str[last-1].length();
        return len;
    }
}