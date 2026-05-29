// Last updated: 29/05/2026, 11:53:16
class Solution {
    public String trimTrailingVowels(String s) {
        int i=s.length()-1;
        while(i>=0 && isvowel(s.charAt(i))){
            i--;
        }
        return s.substring(0,i+1);
    }

    private boolean isvowel(char c){
        if(c=='a' || c=='e' || c=='i'|| c=='o'|| c=='u')
            return true;
        return false;
    }
}