// Last updated: 29/05/2026, 11:54:21
class Solution {
    public boolean isvowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' ||ch=='o' ||ch=='u'){
            return true;
        }
        return false;
    }
    public int maxVowels(String s, int k) {
        int c=0;
        int max=0;
        int n=s.length();
        for(int i=0;i<k;i++){
            if(isvowel(s.charAt(i)))
                c++;
        }
        max=c;
        for(int i=1;i<n-k+1;i++){
            if(isvowel(s.charAt(i-1)))    c--;
            if(isvowel(s.charAt(i+k-1)))    c++;
            if(c>max)   max=c;
        }
        return max;
    }
}