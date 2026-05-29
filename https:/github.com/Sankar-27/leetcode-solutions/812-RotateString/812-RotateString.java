// Last updated: 29/05/2026, 11:55:45
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length())
            return false;
        boolean b=(s+s).contains(goal);
        return b;
    }
}