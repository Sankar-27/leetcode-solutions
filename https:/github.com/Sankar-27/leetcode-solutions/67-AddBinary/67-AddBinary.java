// Last updated: 29/05/2026, 12:00:00
class Solution {
    public String addBinary(String a, String b) {
int i=a.length()-1,j=b.length()-1,carry=0;
StringBuilder res=new StringBuilder();
     while(i>=0 || j>=0 || carry>0)
     {
        int c=i>=0?a.charAt(i)-'0':0;
        int d=j>=0?b.charAt(j)-'0':0;
        int sum=c+d+carry;
        res.append(sum%2);
        carry=sum/2;
        

        i--;j--;
     }
      return res.reverse().toString();
    }
}