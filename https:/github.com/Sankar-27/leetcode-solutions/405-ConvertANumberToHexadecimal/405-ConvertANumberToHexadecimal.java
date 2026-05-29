// Last updated: 29/05/2026, 11:57:18
class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";
        char[] hexChars = "0123456789abcdef".toCharArray();
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            int val = num & 15; // last 4 bits
            sb.append(hexChars[val]);
            num >>>= 4; // unsigned shift
        }
        return sb.reverse().toString();
    }
}