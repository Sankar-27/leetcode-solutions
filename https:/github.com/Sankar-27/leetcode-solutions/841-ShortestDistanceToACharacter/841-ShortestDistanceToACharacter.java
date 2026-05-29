// Last updated: 29/05/2026, 11:55:39
class Solution {
    public int[] shortestToChar(String s, char c) {
        int n= s.length();
        int[] result=new int[n];
        for(int i=0;i<n;i++){
            if(s.charAt(i)!=c)
            {
                int left=i,right=i;
                while(left >= 0 || right < n){
                    if(left>=0 &&s.charAt(left)==c) {
                        result[i]=i-left;
                        break;
                    }
                    if(right<n && s.charAt(right)==c) {
                        result[i]=right-i;
                        break;
                    }
                    left--;
                    right++;
                }    
            }
            else
                 result[i]=0;
        }
        return result;
    }
}