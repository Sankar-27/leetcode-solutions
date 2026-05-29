// Last updated: 29/05/2026, 11:54:00
class Solution {
    public int countGoodSubstrings(String s) {
        int good=0;
        int c0;
        for(int i=0;i<s.length()-2;i++){
            String str=s.substring(i,i+3);
            char ch1=str.charAt(0);
            char ch2=str.charAt(1);
            char ch3=str.charAt(2);
            if(ch1 != ch2 && ch2 !=ch3 && ch3!=ch1)
                good++;
        }
        return good;
    }
}