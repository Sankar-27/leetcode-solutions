// Last updated: 29/05/2026, 11:54:52
class Solution {
    public String gcdOfStrings(String str1, String str2) {
       return solve(str1,str2); 
    }

    public String solve(String str1,String str2){
       if(!(str1+str2).equals(str2+str1)){
            return "";
       }
       int substr=gcd(str1.length(),str2.length());

       return str1.substring(0,substr);

    }

    public int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }
}